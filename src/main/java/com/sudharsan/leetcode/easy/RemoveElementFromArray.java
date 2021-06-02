package com.sudharsan.leetcode.easy;

import java.util.Arrays;

public class RemoveElementFromArray {


    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Remove element from array of numbers
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
