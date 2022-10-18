package com.khilkoleg.functions;

/**
 * @author Oleg Khilko
 */

public class ToSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToSum toSum = new ToSum();
        int[] result = new int[4];
        result[0] = 2;
        result[1] = 7;
        result[2] = 11;
        result[3] = 15;
        toSum.twoSum(result, 9);
        toSum.twoSum(result, 9);
    }
}