package de.haw.eled.led.api.rest;

import de.haw.eled.led.entities.color.types.Color;
import de.haw.eled.led.entities.color.Colors;
import de.haw.eled.led.entities.effect.BasicColorEffect;
import de.haw.eled.led.entities.BlinkRGBWEffect;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tim on 30.04.2017.
 */
@RestController
public class LEDController {

    @RequestMapping(value = "/led/color/{red},{green},{blue},{white}")
    public Color setColor(@PathVariable int red, @PathVariable int green, @PathVariable int blue, @PathVariable int white) {
        LEDManager.getInstance().getLED().setColor(Colors.createRGBW(red,green,blue,white));
        return LEDManager.getInstance().getLED().getColor();
    }

    @RequestMapping(value = "/led/trigger/effect/blink/{time}/{red},{green},{blue},{white}")
    public BasicColorEffect triggerBlinkEffect(@PathVariable int time, @PathVariable int red, @PathVariable int green, @PathVariable int blue, @PathVariable int white) {
        BasicColorEffect effect = new BlinkRGBWEffect(Colors.createRGBW(red,green,blue,white), 255, time);
        LEDManager.getInstance().getLED().triggerBasicEffect(effect);
        return effect;
    }

}
