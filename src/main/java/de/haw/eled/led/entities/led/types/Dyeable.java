package de.haw.eled.led.entities.led.types;


/**
 * Created by Tim on 12.05.2017.
 */
public interface Dyeable<ColorType> {
    ColorType getColor();
    void setColor(ColorType color);
}
