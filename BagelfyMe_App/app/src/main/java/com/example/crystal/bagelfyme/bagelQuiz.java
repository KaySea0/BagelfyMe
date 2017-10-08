package com.example.crystal.bagelfyme;

/**
 * Created by Kyle on 10/7/2017.
 */

public class bagelQuiz {
    private int numPlain;
    private int numRainbow;
    private int numEverything;
    private int numWholeWheat;
    private int numPoppy;
    private int numToast;

    public void addValue(int val) {
        switch (val) {
            case 1:
                numPlain++;
                break;
            case 2:
                numRainbow++;
                break;
            case 3:
                numEverything++;
                break;
            case 4:
                numWholeWheat++;
                break;
            case 5:
                numPoppy++;
                break;
            case 6:
                numToast++;
                break;
        }
    }

    // ugly on purpose, I swear.
    public int getBagel() {
        return Math.max(numPlain,Math.max(numRainbow,Math.max(numWholeWheat,Math.max(numPoppy,numToast))));
    }
}
