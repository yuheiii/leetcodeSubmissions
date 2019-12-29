package com.leetcode;

public class OuterClass {

    private static String msg = "message";

    public static class StaticNestedClass {

        public void printMsg() {
            System.out.println(msg);
        }

        public static void printOut() {}
    }

    public class InnerClass {
        public void display() {
            System.out.println("from inner:" + msg);
        }

//        public static void printOut() {
//
//
//        }

        public OuterClass getOuterClass() {
            return OuterClass.this;
        }
    }
}
