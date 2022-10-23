package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */
public class Cplusplus {
    public int addNums(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += i;
        }
        return result;
    }
}
