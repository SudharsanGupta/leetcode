package com.sudharsan.leetcode.easy;

public class IntegerPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-2344));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(9));
        System.out.println(isPalindrome(10));


    }

    public static boolean isPalindrome(int x) {

        if (x < 0){
            return false;
        }

        //convert integer to string
        String number = String.valueOf(x);
        int left = 0, right = number.length() - 1;

        while (left != right && left <= right){

            //compare indexes
            if (number.charAt(left) != number.charAt(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }

}
