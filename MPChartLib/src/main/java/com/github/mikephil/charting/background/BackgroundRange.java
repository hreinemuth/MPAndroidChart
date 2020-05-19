
package com.github.mikephil.charting.background;

public class BackgroundRange {

    private int color;

    private float lowerThreshold;

    private float higherThreshold;

    public BackgroundRange(int color, float lowerThreshold, float higherThreshold) {
        this.color = color;
        this.lowerThreshold = lowerThreshold;
        this.higherThreshold = higherThreshold;
    }

    public int getColor() {
        return color;
    }

    public float getLowerThreshold() {
        return lowerThreshold;
    }

    public float getHigherThreshold() {
        return higherThreshold;
    }

    /**
     * Returns true if this background range object is equal to the other
     *
     * @param r
     * @return
     */
    public boolean equalTo(BackgroundRange r) {

        if (r == null)
            return false;
        else {
            if (this.color == r.color &&
            this.lowerThreshold == r.lowerThreshold &&
            this.higherThreshold == r.higherThreshold)
                return true;
            else
                return false;
        }
    }

    @Override
    public String toString() {
        return "BackgroundRange, color: " + color + ", lowerThreshold: " + lowerThreshold + ", higherThreshold: " + higherThreshold;
    }
}
