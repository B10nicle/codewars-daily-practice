package com.khilkoleg.functions;

import java.util.Arrays;

public class Accumulate {

    public static String accumulate(String s) {

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            for (int j = 0; j < c; j++) {
                System.out.print(c + "-");
            }
        }

        return Arrays.toString(charArray);

    }

}