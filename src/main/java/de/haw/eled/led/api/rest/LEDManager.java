package de.haw.eled.led.api.rest;


import de.haw.eled.led.arduino.ArduinoLED;
import de.haw.eled.led.entities.led.EffactableLed;
import de.haw.eled.led.entities.color.types.Color;
import de.haw.eled.led.entities.color.Colors;

/**
 * Created by Tim on 30.04.2017.
 */
public class LEDManager {

    private static LEDManager instance;

    private EffactableLed<Color> led = new ArduinoLED(Colors.createRGBW(),255);

    private LEDManager() {}

    public static LEDManager getInstance() {
        if(instance == null)
            instance = new LEDManager();
        return instance;
    }

    public EffactableLed<Color> getLED() {
        return led;
    }

}
