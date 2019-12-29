package com.leetcode;

public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass instance1 = new OuterClass.StaticNestedClass();
        instance1.printMsg();
        instance1.printOut();

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
        OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();
        inner2.display();
        OuterClass res = inner2.getOuterClass();
        System.out.println(res);
    }
}
