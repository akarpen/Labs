package com.karpenko;

public class Calculate {
    public int prize(final Race[] races) {
        int countprize = 0;
        for (final Race race : races) {
            if (race.isPrize() == true) {
                ++countprize;
            }
        }
        return countprize;
    }

    public int users(final Race[] races) {
        int countusers = 0;
        for (final Race race : races) {
            countusers = race.getCountriders() + countusers;
        }
        return countusers;
    }
}
