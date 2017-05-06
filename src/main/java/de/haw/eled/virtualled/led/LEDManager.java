package de.haw.eled.virtualled.led;


import de.haw.eled.virtualled.led.effect.BasicEffect;
import de.haw.eled.virtualled.led.effect.EmptyEffect;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

/**
 * Created by Tim on 30.04.2017.
 */
public class LEDManager {

    private static LEDManager instance;

    private static BasicEffect EMPTY_EFFECT = new EmptyEffect();

    private LED led = new LED(new Color(0,0,255), new Alpha(0));

    private BasicEffect effect;

    private LEDManager() {}

    public static LEDManager getInstance() {
        if(instance == null)
            instance = new LEDManager();
        return instance;
    }

    public LED getLED() {
        return led;
    }

    public BasicEffect getEffect() {
        if(effect == null)
            return LEDManager.EMPTY_EFFECT;
        return effect;
    }

    public void setEffect(BasicEffect effect) {
        this.effect = effect;
    }

    public void resetEffect() {
        this.effect = null;
    }
}
