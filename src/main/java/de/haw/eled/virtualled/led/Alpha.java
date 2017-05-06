package de.haw.eled.virtualled.led;

/**
 * Created by Tim on 30.04.2017.
 */
public class Alpha {

    public static final int MAX = 100;
    public static final int MIN = 0;

    private int alpha;

    public Alpha(int alpha) {
        checkAlphaArgument(alpha);
        this.alpha = alpha;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        checkAlphaArgument(alpha);
        this.alpha = alpha;
    }

    private void checkAlphaArgument(int alphaVal) {
        if(alphaVal < MIN || alphaVal > MAX)
            throw new IllegalArgumentException("Value have to be between 0 and 255");
    }
}
