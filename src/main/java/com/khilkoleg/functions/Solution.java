package com.khilkoleg.functions;

import java.util.Arrays;
import java.util.List;

/**
 * @author Oleg Khilko
 */

public class Solution {

    public static String doubleChar(String s) {

        var sb = new StringBuilder();

        for (char c : s.toCharArray())
            sb.append(c).append(c);

        return sb.toString();
    }

    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

}