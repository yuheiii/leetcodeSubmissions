package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SimpleTests {

//    public static void bar(String a) {
//        a = "def";
//    }

//    public static void main(String[] args) {
//        String a = "abc";
//        try {
//            String b = a.substring(2, 4);
//        } catch (IndexOutOfBoundsException exc) {
//            exc.printStackTrace();
//        } finally {
//            System.out.println(a);
//        }
//    }
    public static void foo1(int diff) {
        diff = 2;
    }

    public static void foo2(int[] diff) {
        diff[0] = 2;
    }

    public static void testMethod (int i) {
        int[] list = new int[20];
        for (int k : list) {

        }
    }

    public static void main(String[] args) {
        int a = 0;
        int[] b = {0};
        foo1(a);
        foo2(b);
        System.out.println(a);
        System.out.println(b[0]);
    }
}
