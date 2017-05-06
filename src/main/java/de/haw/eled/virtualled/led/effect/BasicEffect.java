package de.haw.eled.virtualled.led.effect;

import de.haw.eled.virtualled.led.Color;

/**
 * Created by Tim on 04.05.2017.
 */
public abstract class BasicEffect {
    private Color color;

    private int time = 0;

    BasicEffect(Color color, int time) {
        this.color = color;
        this.time = time;
    }

    protected BasicEffect() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public abstract String getName();
}
