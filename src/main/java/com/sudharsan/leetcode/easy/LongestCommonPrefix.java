package com.sudharsan.leetcode.easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
    }


    public static String longestCommonPrefix(String[] strs) {


        if (strs.length > 1){
            String firstString = strs[0];
            boolean end = false;
            for (int i = 0; i < firstString.length(); i++) {
                for (int j = 1; j < strs.length ; j++) {
                    if ( i >= strs[j].length() || firstString.charAt(i) != strs[j].charAt(i) ){
                        end = true;
                        break;
                    }
                }

                if (end){
                    return i == 0? "" : firstString.substring(0, i);
                }
            }
        }

        return strs[0];
    }

}
