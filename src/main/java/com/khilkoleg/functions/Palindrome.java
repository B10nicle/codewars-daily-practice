package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

public class Palindrome {
    public static boolean isPalindrome(int x) {
        var input = String.valueOf(x).toCharArray();
        var reversed = new char[input.length];
        int j = 0;

        for (int i = input.length - 1; i >= 0; i--) {
            reversed[j++] = input[i];
        }

        for (int i = 0; i < input.length; i++) {
            int counter = 0;
            if (input[i] == reversed[i]) {
                counter++;
                if (counter == input.length)
                    return true;
            }
        }
        return false;
    }
}