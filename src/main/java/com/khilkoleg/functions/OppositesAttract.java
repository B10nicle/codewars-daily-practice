package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {

        boolean flowerOneIsOdd = flower1 % 2 == 1;
        boolean flowerOneIsEven = flower1 % 2 == 0;

        boolean flowerTwoIsOdd = flower2 % 2 == 1;
        boolean flowerTwoIsEven = flower2 % 2 == 0;

        if (flowerOneIsOdd && flowerTwoIsEven)
            return true;

        else
            return flowerOneIsEven && flowerTwoIsOdd;
    }

}