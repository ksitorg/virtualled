package de.haw.eled.led.entities.color.types;

/**
 * Created by Tim on 12.05.2017.
 */
public interface RGB extends Color {
    int getR();
    void setR(int r);
    int getG();
    void setG(int g);
    int getB();
    void setB(int b);
    void setRGB(int r, int b, int g);
}
