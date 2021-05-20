package com.sudharsan.leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {

        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);


         int result = 0, previous = 0;

         for (int i=s.length()-1; i >= 0; i--){

             char charAt = s.charAt(i);

             Integer value = romanValues.get(charAt);
             if ( value < previous){
                 result -= value;
             } else {
                 result += value;
             }
             previous = value;
         }

        return result;
    }
}
