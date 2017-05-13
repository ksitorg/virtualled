package de.haw.eled.led.entities.color;

import de.haw.eled.led.entities.color.types.RGB;

/**
 * Created by Tim on 30.04.2017.
 */
public class RGBImpl implements RGB {

    private int r;
    private int g;
    private int b;

    RGBImpl(int r, int g, int b) {
        Colors.checkValues(r, g, b);
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public int getR() {
        return r;
    }

    @Override
    public void setR(int r) {
        Colors.checkValue(r);
        this.r = r;
    }

    @Override
    public int getG() {
        return g;
    }

    @Override
    public void setG(int g) {
        Colors.checkValue(g);
        this.g = g;
    }

    @Override
    public int getB() {
        return b;
    }

    @Override
    public void setB(int b) {
        Colors.checkValue(b);
        this.b = b;
    }

    @Override
    public void setRGB(int r, int b, int g) {
        Colors.checkValues(r,g,b);
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String[] asArray() {
        return new String[] {Integer.toString(getR()), Integer.toString(getG()), Integer.toString(getB())};
    }
}
