package com.ppx.algorithm.recursion_multi;

/**
 * 斐波那契-兔子
 */
public class E01Fibonacci_rabbit {

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        int f = f(4);
        System.out.println("f = " + f);
    }
}
