package de.haw.eled.led.entities;


import de.haw.eled.led.entities.color.types.RGBW;
import de.haw.eled.led.entities.effect.BasicColorEffect;

/**
 * Created by Tim on 04.05.2017.
 */
public class BlinkRGBWEffect extends BasicColorEffect {

    public BlinkRGBWEffect(RGBW color, int brightness, int durationInMs) {
        super(color, brightness, durationInMs);
    }

    @Override
    public String getName() {
        return "blink";
    }
}
