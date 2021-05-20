package com.sudharsan.leetcode.easy;

public class ReverseInt {

    public static void main(String[] args) {

        System.out.println(reverse_overFlow_failed(1534236469));
    }


    public static int reverse_overFlow_failed(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }

        int reminder, quoficient, result = 0, temp = Math.abs(x);

        while (true) {

            reminder = temp % 10;
            quoficient = temp / 10;

            temp = quoficient;


            if (quoficient == 0 && reminder == 0) {
                break;
            } else {
                try {
                    result = Math.multiplyExact(result, 10) + reminder;
                } catch (Exception e) {
                    return 0;
                }
            }

        }

        return isNegative ? result * -1 : result;

    }
}

//    public static int reverse(int x) {
//        boolean isNegative = false, isSkipLeadingZero = true;
//        ;
//        if (x < 0){
//            isNegative = true;
//        }
//
//        int reminder, quoficient, temp = Math.abs(x);
//
//        StringBuilder result = new StringBuilder();
//        if (isNegative) result.append("-");
//        while (true){
//
//            reminder = temp % 10;
//            quoficient = temp / 10;
//
//            temp = quoficient;
//
//
//            if (quoficient == 0 && reminder == 0){
//                break;
//            }else {
//                if (isSkipLeadingZero && reminder != 0) {
//                    isSkipLeadingZero = false;
//                    result.append(reminder);
//                }
//
//            }
//
//        }
//
//        //check whether value going out side integer
//        if ( Integer.MIN_VALUE >=  )
//        return result;
//    }
