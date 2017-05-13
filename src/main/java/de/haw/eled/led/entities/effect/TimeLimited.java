package de.haw.eled.led.entities.effect;

/**
 * Created by Tim on 12.05.2017.
 */
public interface TimeLimited {
    long getDuration();
    void setDuration(long durationInMs);
}
