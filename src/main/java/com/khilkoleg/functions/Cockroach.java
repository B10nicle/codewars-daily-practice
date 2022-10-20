package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

public class Cockroach {
    public int cockroachSpeed(double x) {
        return (int) Math.round((x * 1000 / 60) * 100 / 60);
    }
}