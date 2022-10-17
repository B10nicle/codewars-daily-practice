package com.khilkoleg.functions;

import static com.khilkoleg.functions.NoSpace.noSpace;
import static com.khilkoleg.functions.Solution.doubleChar;

/**
 * @author Oleg Khilko
 */

public class Main {

    public static void main(String[] args) {

        //digitize(0);
        //accumulate("Switch");
        //numberToString(5);
        //System.out.println(isLove(4, 4));
        //System.out.println(doubleChar("Hello"));
        //System.out.println(noSpace("131 sdqwe 123131 1 12 "));
        System.out.println(Palindrome.isPalindrome(5154));
        System.out.println(Palindrome.isPalindrome(515));
        System.out.println(Palindrome.isPalindrome(123));
        System.out.println(Palindrome.isPalindrome(32123));

    }

}