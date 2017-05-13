package de.haw.eled.led.entities.led;


import de.haw.eled.led.entities.color.Brightness;
import de.haw.eled.led.entities.led.types.Dimmable;

/**
 * Created by Tim on 30.04.2017.
 */
public abstract class DimmableLED implements Dimmable {

    protected int brightness;

    public DimmableLED(int brightness) {
        this.setBrightness(brightness);
        onBrightnessChange();
    }

    public void setOn() {
        this.setBrightness(Brightness.MAX);
        onBrightnessChange();
    }

    public void setOff() {
        this.setBrightness(Brightness.MIN);
        onBrightnessChange();
    }

    public boolean isOn() {
        return brightness > Brightness.MIN;
    }

    @Override
    public void setBrightness(int brightness) {
        Brightness.checkValue(brightness);
        this.brightness = brightness;
        onBrightnessChange();
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    protected abstract void onBrightnessChange();
}
