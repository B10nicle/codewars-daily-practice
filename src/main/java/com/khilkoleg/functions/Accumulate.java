package com.khilkoleg.functions;

public class Accumulate {

    public static String accum(String s) {

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i]; j++) {
                System.out.print(charArray[i] + "-");
            }
        }

        return charArray.toString();

    }

}