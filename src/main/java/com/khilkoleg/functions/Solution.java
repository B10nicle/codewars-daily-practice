package com.khilkoleg.functions;

import java.util.Arrays;

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

    public static String vaporCode(String s) {
        var ca = s.toCharArray();
        var sb = new StringBuilder();

        for (char c : ca) {
            if (c == ' ') {
                continue;
            } else {
                sb.append(c).append(" ").append(" ");
            }
        }

        return sb.toString().toUpperCase().trim();
    }

    public static void main(String[] args) {
        System.out.println(Solution.vaporCode("Lets go to the movies"));
    }
}