package de.haw.eled.virtualled.led;

/**
 * Created by Tim on 30.04.2017.
 */
public class Color {

    public static final int MAX = 255;
    public static final int MIN = 0;

    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        checkColorArgument(red);
        this.red = red;
        checkColorArgument(green);
        this.green = green;
        checkColorArgument(blue);
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        checkColorArgument(red);
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        checkColorArgument(green);
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        checkColorArgument(blue);
        this.blue = blue;
    }

    private void checkColorArgument(int colorVal) {
        if(colorVal < MIN || colorVal > MAX)
            throw new IllegalArgumentException("Value have to be between 0 and 255");
    }
}
