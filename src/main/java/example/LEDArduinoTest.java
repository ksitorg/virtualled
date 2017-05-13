package example;

import de.haw.eled.led.api.rest.LEDManager;
import de.haw.eled.led.entities.color.types.Color;
import de.haw.eled.led.entities.color.Colors;
import de.haw.eled.led.entities.BlinkRGBWEffect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 12.05.2017.
 */
public class LEDArduinoTest {
    public static void main(String[] args) throws InterruptedException {
        LEDManager ledManager = LEDManager.getInstance();

        List<Color> colorList = new ArrayList<>();
        colorList.add(Colors.createRGBW(0,255,0,0)); //Green
        colorList.add(Colors.createRGBW(255,0,0,0)); //Red
        colorList.add(Colors.createRGBW(0,0,255,0)); //Blue
        colorList.add(Colors.createRGBW(0,0,0,255)); //White;

        LEDManager.getInstance().getLED().setColor(Colors.createRGBW());

        BlinkRGBWEffect effect = new BlinkRGBWEffect(Colors.createRGBW(255,127,127,127), 255, 2000);

        LEDManager.getInstance().getLED().triggerBasicEffect(effect);


//        while (true) {
//            for (Color c : colorList) {
//                ledManager.getLED().setColor(c);
//                TimeUnit.MILLISECONDS.sleep(50);
//            }
//        }
    }
}
