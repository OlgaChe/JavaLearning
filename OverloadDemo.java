package com.company;

/**
 * Created by kovtunov on 23/08/14.
 */
public class OverloadDemo {

    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a,b: " + a + " " + b);
    }

    double test (double a) {
        System.out.println("Double a: " + a);
        return a*a;
    }
}
