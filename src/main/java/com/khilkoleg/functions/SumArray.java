package com.khilkoleg.functions;

import java.util.Arrays;

/**
 * @author Oleg Khilko
 */

public class SumArray {

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}