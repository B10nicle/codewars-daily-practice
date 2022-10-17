package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

public class Palindrome {
    public static boolean isPalindrome(int x) {
        var input = String.valueOf(x).toCharArray();
        int[] numbers = new int[9];
        int counter = 0;
        int j = 0;

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        for (int number : numbers) {
            if (number == x)
                return true;
        }

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