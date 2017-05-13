package de.haw.eled.led.entities.color.types;

/**
 * Created by Tim on 12.05.2017.
 */
public interface RGBW extends RGB {
    int getW();
    void setW(int w);
    void setRGBW(int r, int g, int b, int w);
}
