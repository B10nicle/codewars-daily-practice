package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String[] phrases = new String[6];

        phrases[0] = "I love you";
        phrases[1] = "a little";
        phrases[2] = "a lot";
        phrases[3] = "passionately";
        phrases[4] = "madly";
        phrases[5] = "not at all";

        return phrases[(nb_petals - 1) % phrases.length];
    }
}