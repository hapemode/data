package com.ppx.algorithm.recursion_multi;

/**
 * 斐波那契数列
 */
public class E01Fibonacci {

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
//        int x = f(n - 1);
//        int y = f(n - 2);
//        return x + y;
        return  f(n - 1)+ f(n - 2);
    }

    public static void main(String[] args) {
        int f = f(5);
        System.out.println("f = " + f);
    }
}
