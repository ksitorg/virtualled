package de.haw.eled.virtualled.led.effect;

import de.haw.eled.virtualled.led.Color;

/**
 * Created by Tim on 04.05.2017.
 */
public class BlinkEffect extends BasicEffect {

    public BlinkEffect(Color color, int time) {
        super(color, time);
    }

    @Override
    public String getName() {
        return "blink";
    }
}
