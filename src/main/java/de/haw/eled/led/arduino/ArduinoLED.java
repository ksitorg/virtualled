package de.haw.eled.led.arduino;

import de.haw.eled.led.entities.color.types.Color;
import de.haw.eled.led.entities.effect.BasicColorEffect;
import de.haw.eled.led.entities.led.EffactableLed;
import org.ardulink.core.Link;
import org.ardulink.core.convenience.Links;
import org.ardulink.util.URIs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by Tim on 12.05.2017.
 */
public class ArduinoLED extends EffactableLed<Color> {

    private static final Logger LOG = LoggerFactory.getLogger(ArduinoLED.class);

    private Link link;

    public ArduinoLED(Color color, int brightness){
        super(color, brightness);


        link = Links.getLink(URIs.newURI("ardulink://serial-jssc?port=COM4"));


        try {
            link.addCustomListener(new ArduinoMessageLogger());
            link.addRplyListener(new ArduinoMessageLogger());
        } catch (IOException e) {
            LOG.error("Error adding RplyListner to aruduino link!",e);
        }
    }

    @Override
    protected void onColorChange() {
        LOG.debug("onColorChange triggered");
        String message = "colr/"+String.join(",",this.getColor().asArray())+"/";
        try {
            long id = link.sendCustomMessage(message);
            LOG.info("Message#{} send to arduino. Content: {}", id, message);
        } catch (IOException e) {
            LOG.error("Sending message to arduino failed. Content: {}",message,e);
        }
    }

    @Override
    protected void onBrightnessChange() {

    }

    @Override
    public void triggerBasicEffect(BasicColorEffect effect) {
        LOG.debug("triggerBasicEffect triggered");
        String message = "rgbw/"+Long.toString(effect.getDuration())+"/"+String.join(",",effect.getColor().asArray())+"/";
        try {
            long id = link.sendCustomMessage(message);
            LOG.info("Message#{} send to arduino. Content: {}", id, message);
        } catch (IOException e) {
            LOG.error("Sending message to arduino failed. Content: {}",message,e);
        }
    }
}
