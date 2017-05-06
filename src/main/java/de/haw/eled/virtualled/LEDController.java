package de.haw.eled.virtualled;

import de.haw.eled.virtualled.led.*;
import de.haw.eled.virtualled.led.effect.BasicEffect;
import de.haw.eled.virtualled.led.effect.BlinkEffect;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tim on 30.04.2017.
 */
@RestController
public class LEDController {

    @RequestMapping(value = "/led/setcolor")
    public Color setColor(@RequestParam(value="r") int red, @RequestParam(value = "g") int green, @RequestParam(value = "b") int blue) {
        LED led = LEDManager.getInstance().getLED();
        led.getColor().setRed(red);
        led.getColor().setGreen(green);
        led.getColor().setBlue(blue);
        return led.getColor();
    }

    @RequestMapping(value = "/led/getcolor")
    public Color getColor() {
        LED led = LEDManager.getInstance().getLED();
        return led.getColor();
    }

    @RequestMapping(value = "/led/setalpha")
    public Alpha setAlpha(@RequestParam(value="a") int alpha) {
        LED led = LEDManager.getInstance().getLED();
        led.getAlpha().setAlpha(alpha);
        return led.getAlpha();
    }

    @RequestMapping(value = "/led/getalpha")
    public Alpha getAlpha() {
        LED led = LEDManager.getInstance().getLED();
        return led.getAlpha();
    }

    @RequestMapping(value = "/led/effect/trigger/blink")
    public BasicEffect triggerBlinkEffect() {
        BasicEffect effect = new BlinkEffect(new Color(0,0,255), 300);
        LEDManager.getInstance().setEffect(effect);
        return effect;
    }

    @RequestMapping(value = "/led/effect/trigger/blink/{time}/{red},{green},{blue}")
    public BasicEffect triggerBlinkEffect(@PathVariable int time, @PathVariable int red, @PathVariable int green, @PathVariable int blue) {
        BasicEffect effect = new BlinkEffect(new Color(red,green,blue), time);
        LEDManager.getInstance().setEffect(effect);
        return effect;
    }

    @RequestMapping(value = "/led/effect/consume")
    public BasicEffect consumeEffect() {
        BasicEffect effect = LEDManager.getInstance().getEffect();
        LEDManager.getInstance().resetEffect();
        return effect;
    }

}
