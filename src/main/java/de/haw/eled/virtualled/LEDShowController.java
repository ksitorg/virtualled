package de.haw.eled.virtualled;

import de.haw.eled.virtualled.led.Alpha;
import de.haw.eled.virtualled.led.Color;
import de.haw.eled.virtualled.led.LEDManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tim on 30.04.2017.
 */
@Controller
public class LEDShowController {

    @RequestMapping("/led")
    public String showled(Model model) {
//        Color color = LEDManager.getInstance().getLED().getColor();
//        Alpha alpha = LEDManager.getInstance().getLED().getAlpha();
//        model.addAttribute("red",color.getRed());
//        model.addAttribute("blue",color.getBlue());
//        model.addAttribute("green",color.getGreen());
//        model.addAttribute("alpha",alpha.getAlpha());
        return "led";
    }
}
