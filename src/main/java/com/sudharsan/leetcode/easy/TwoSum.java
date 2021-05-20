package com.sudharsan.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        Arrays.stream(twoSum(new int[]{3, 2, 4}, 6)).forEach(i -> System.out.println(i + " "));
    }


    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> storeIntegers = new HashMap<>();

        for (int i=0; i < length; i++) {
            storeIntegers.put(nums[i], i);
        }

        for (int i=0; i < length; i++) {
            int find = target - nums[i];
            Integer integer = storeIntegers.get(find);
            if (integer != null && integer != i){
                return new int[]{i, integer};
            }
        }

        return new int[]{};
    }

}
