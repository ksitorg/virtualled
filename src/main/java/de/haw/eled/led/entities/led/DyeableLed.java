package de.haw.eled.led.entities.led;

import de.haw.eled.led.entities.led.types.Dyeable;

/**
 * Created by Tim on 12.05.2017.
 */
public abstract class DyeableLed<ColorType> extends DimmableLED implements Dyeable<ColorType> {

    protected ColorType color;

    public DyeableLed(ColorType color, int brightness) {
        super(brightness);
        this.color = color;
    }

    @Override
    public ColorType getColor() {
        return color;
    }

    @Override
    public void setColor(ColorType color) {
        this.color = color;
        onColorChange();
    }

    protected abstract void onColorChange();
}
