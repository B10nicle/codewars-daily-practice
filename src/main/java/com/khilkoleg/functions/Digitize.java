package com.khilkoleg.functions;

public class Digitize {

    public static int[] digitize(long n) {

        int numberOfInts = String.valueOf(n).length();
        char[] stringValue = String.valueOf(n).toCharArray();
        int[] array = new int[numberOfInts];
        for (int i = 0; i < array.length; i++) {
            array[i] = stringValue[i];
            int x = Character.getNumericValue(array[i]);
            array[i] = x;
        }
        int[] resultArray = new int[numberOfInts];
        for (int i = 0; i < numberOfInts; i++) {
            resultArray[numberOfInts - 1 - i] = array[i];
        }

        return resultArray;

    }

}