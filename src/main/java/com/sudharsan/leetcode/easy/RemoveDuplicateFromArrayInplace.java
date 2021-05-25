package com.sudharsan.leetcode.easy;

import java.util.Arrays;

public class RemoveDuplicateFromArrayInplace {


//    [1,1,2]
//            [0,0,1,1,1,2,2,3,3,4]
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
        Arrays.stream(nums).forEach(i -> System.out.print(i + " "));
    }
    public static int removeDuplicates(int[] nums) {


        int temp = 0, pointer = 1, length = nums.length;

        while (pointer < length){
            if ( nums[temp] == nums[pointer]){
                while ((++pointer)< length) {
                    if (nums[temp] != nums[pointer]) {
                        copyAndMoveTemp(nums, ++temp, pointer);
                    }
                }
            }else {
                temp++;
                pointer++;
            }
        }

        return temp + 1;
    }

    private static void copyAndMoveTemp(int[] nums, int temp, int pointer) {

        do{
            nums[temp] = nums[pointer];
        }while ( pointer < nums.length && nums[temp++] != nums[pointer++] );
    }


}
