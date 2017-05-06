package de.haw.eled.virtualled.led.effect;

import de.haw.eled.virtualled.led.Color;

/**
 * Created by Tim on 05.05.2017.
 */
public class EmptyEffect extends BasicEffect {


    public EmptyEffect() {
        super(new Color(0,0,0), 0);
    }

    @Override
    public String getName() {
        return "empty";
    }
}
