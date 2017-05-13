package de.haw.eled.led.entities.led;


import de.haw.eled.led.entities.led.types.Effectable;

/**
 * Created by Tim on 12.05.2017.
 */
public abstract class EffactableLed<ColorType> extends DyeableLed<ColorType> implements Effectable {
    public EffactableLed(ColorType color, int brightness) {
        super(color, brightness);
    }
}
