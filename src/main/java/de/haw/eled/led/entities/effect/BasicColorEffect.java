package de.haw.eled.led.entities.effect;


import de.haw.eled.led.entities.led.types.Dimmable;
import de.haw.eled.led.entities.led.types.Dyeable;
import de.haw.eled.led.entities.color.types.Color;

/**
 * Created by Tim on 04.05.2017.
 */
public abstract class BasicColorEffect implements Dimmable, Dyeable<Color>, TimeLimited  {

    private Color color;
    private int brightness;
    private long durationInMs;

    public BasicColorEffect(Color color, int brightness, int durationInMs) {
        this.color = color;
        this.brightness = brightness;
        this.durationInMs = durationInMs;
    }

    public abstract String getName();

    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public long getDuration() {
        return durationInMs;
    }

    @Override
    public void setDuration(long durationInMs) {
        this.durationInMs = durationInMs;
    }
}
