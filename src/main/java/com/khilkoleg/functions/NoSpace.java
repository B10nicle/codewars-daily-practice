package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

class NoSpace {

    public static String noSpace(final String x) {

        var array = x.toCharArray();

        var sb = new StringBuilder();

        for (char c : array) {

            if (c != ' ')
                sb.append(c);

        }

        return sb.toString();
    }

}