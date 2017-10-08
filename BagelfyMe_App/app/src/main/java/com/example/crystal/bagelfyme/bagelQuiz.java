package com.example.crystal.bagelfyme;

/**
 * Created by Kyle on 10/7/2017.
 */

public class bagelQuiz {
    // plain,rainbow,everything,wholewheat,poppy,toast
    private int[] allScores = new int[6];

    public void addValue(int val) {
        allScores[val-1]++;
    }

    // ugly on purpose, I swear.
    public int getBagel() {
        int max = Integer.MIN_VALUE;
        int indexMax = 0;

        for (int i = 0; i < 6; i++) {
            if (allScores[i] > max) {
                max = allScores[i];
                indexMax = i;
            }
        }

        return indexMax+1;
    }
}
