package com.leetcode;

import java.util.HashMap;
import java.util.Map;

class LinkedListComponents {
    public ListNode mid(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public String reverseCase(String s) {
        if (s == null) {
            return s;
        }
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            Character c = array[i];
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public int numComponents(ListNode head, int[] G) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < G.length; i++) {
            map.put(G[i], map.getOrDefault(G[i], 0) + 1);
        }
        int result = 0;
        while (head != null) {
            if (head.next != null && map.containsKey(head.val) && !map.containsKey(head.next.val)) {
                result++;
                if (map.get(head.val) > 1) {
                    map.put(head.val, map.get(head.val) - 1);
                } else {
                    map.remove(head.val);
                }
            } else if (head.next != null && map.containsKey(head.val)) {
                if (map.get(head.val) > 1) {
                    map.put(head.val, map.get(head.val) - 1);
                } else if (head.next == null && map.containsKey(head.val)) {
                    result++;

                } else {
                    map.remove(head.val);
                }
            }
            head = head.next;
        }
        return result;

    }

    public static void main(String[] args) {
        LinkedListComponents s = new LinkedListComponents();
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        System.out.println(s.numComponents(head, new int[]{0, 1, 3}));
    }
}

