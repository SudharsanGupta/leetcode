package com.sudharsan.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {


    public static void main(String[] args) {

//        System.out.println(isValid("(){}{}}{"));
        System.out.println(isValid("(){}{}"));
    }


    public static boolean isValid(String s) {

        HashMap<Character, ValueStore> parentheses = new HashMap<>();
        parentheses.put('[', new ValueStore('[',']', 1));
        parentheses.put(']', new ValueStore(']','[', 2));
        parentheses.put('{', new ValueStore('{', '}', 1));
        parentheses.put('}', new ValueStore('}', '{', 2));
        parentheses.put('(', new ValueStore('(', ')', 1));
        parentheses.put(')', new ValueStore(')', '(', 2));

        Stack<ValueStore> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (!stack.empty() && parentheses.get(charAt).getMatch() == stack.peek().getValue() && stack.peek().getRank() == 1){
                stack.pop();
            }else {
                stack.push(parentheses.get(charAt));
            }
        }

        return stack.empty();

    }

    private static class ValueStore {

        private Character value;
        private Character match;
        private int rank;


        public ValueStore(Character value, Character match, int rank) {
            this.value = value;
            this.match = match;
            this.rank = rank;
        }

        public Character getMatch() {
            return match;
        }

        public void setMatch(Character match) {
            this.match = match;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public Character getValue() {
            return value;
        }

        public void setValue(Character value) {
            this.value = value;
        }
    }
}
