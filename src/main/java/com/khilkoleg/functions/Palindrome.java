package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

public class Palindrome {
    public static boolean isPalindrome(int x) {
        var input = String.valueOf(x).toCharArray();
        int counter = 0;
        int j = 0;

        if (x >= 0 && x < 10)
            return true;

        for (int i = input.length - 1; i >= 0; i--) {

            if (input[j] != input[i])
                return false;

            if (input[j] == input[i]) {
                counter++;
                if (counter == input.length / 2)
                    return true;
            }
            j++;
        }
        return false;
    }
}