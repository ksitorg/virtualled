package de.haw.eled.led.entities.color;

import de.haw.eled.led.entities.color.types.RGBW;

/**
 * Created by Tim on 12.05.2017.
 */
public class RGBWImpl extends RGBImpl implements RGBW {

    private int w;

    RGBWImpl(int r, int g, int b, int w) {
        super(r, g, b);
        this.w = w;
    }

    public RGBWImpl(int r, int g, int b) {
        this(r, g, b, 0);
    }

    @Override
    public int getW() {
        return w;
    }

    @Override
    public void setW(int w) {
        Colors.checkValue(w);
        this. w = w;
    }

    @Override
    public void setRGBW(int r, int g, int b, int w) {
        setRGB(r,g,b);
        Colors.checkValue(w);
        this.w = w;
    }

    @Override
    public String[] asArray() {
        return new String[] {Integer.toString(getR()), Integer.toString(getG()), Integer.toString(getB()), Integer.toString(getW())};
    }
}
