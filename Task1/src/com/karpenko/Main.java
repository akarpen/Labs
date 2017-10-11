package com.karpenko;

public class Main {
    public static void main(final String... args) {
        final Race[] races = new Race[10];
        final Calculate counting = new Calculate();
        races[0] = new Race(20, 8, 2016, 10, true);
        races[1] = new Race(10, 3, 2016, 2, false);
        races[2] = new Race(20, 8, 2015, 30, true);
        races[3] = new Race(11, 4, 2016, 7, true);
        races[4] = new Race(10, 3, 2015, 2, false);
        races[5] = new Race(15, 8, 2016, 17, true);
        races[6] = new Race(9, 7, 2016, 12, true);
        races[7] = new Race(1, 3, 2016, 21, false);
        races[8] = new Race(23, 9, 2015, 9, false);
        races[9] = new Race(27, 8, 2016, 12, true);

        final int countprize = counting.prize(races);
        System.out.println("Kol-vo sorevnovanii s prizom: " + countprize);

        final int countusers = counting.users(races);
        System.out.println("Obshee kol-vo uchastnikov: " + countusers);
    }

}
