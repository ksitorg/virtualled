package de.haw.eled.virtualled.led;


/**
 * Created by Tim on 30.04.2017.
 */
public class LED {

    private Color color;

    private Alpha alpha;

    public LED(Color color, Alpha alpha) {
        this.color = color;
        this.alpha = alpha;
    }

    public LED(Color color) {
        this.color = color;
        this.alpha = new Alpha(Alpha.MIN);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Alpha getAlpha() {
        return alpha;
    }

    public void setAlpha(Alpha alpha) {
        this.alpha = alpha;
    }
}
