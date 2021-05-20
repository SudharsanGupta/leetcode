package com.sudharsan.leetcode.easy;


import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoSortedLists {


    public static void main(String[] args) {

        Random random = new Random();
        ListNode temp = null, l1 = null, l2 = null;
        int rand = random.nextInt(15);
        for (int i = 0; i < 5; i++) {
            ListNode node = new ListNode(rand * i, null);
            if (l1 == null){
                l1 = node;
                temp = node;
            }else {
                temp.next = node;
                temp = node;
            }
        }

        rand = random.nextInt(10);
        for (int i = 0; i < 5; i++) {
            ListNode node = new ListNode(rand * i, null);
            if (l2 == null){
                l2 = node;
                temp = node;
            }else {
                temp.next = node;
                temp = node;
            }
        }
        ListNode listNode = mergeTwoLists(l1, l2);

        while (listNode != null){
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }


        // compare and merge 
        ListNode temp, result = l1;

        if (l1.val > l2.val){
            result = l2;
        }

        do {
            if (l1.val <= l2.val){
                while (l1.next != null && l1.next.val <= l2.val){
                    l1 = l1.next;
                }
                temp = l1;
                l1 = l1.next;
                temp.next = l2;
            } else {
                while (l2.next != null && l2.next.val <= l1.val){
                    l2 = l2.next;
                }
                temp = l2;
                l2 = l2.next;
                temp.next = l1;
            }
        }while (l1 != null && l2 != null);

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}