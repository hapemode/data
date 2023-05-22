package com.ppx.algorithm.recursion_multi;

/**
 * 斐波那契-青蛙
 */
public class E01Fibonacci_frog {

    public static void main(String[] args) {
        int count = f(5);
        System.out.println("count = " + count);
    }

        private static int f(int i) {
            if (i == 1) {
                return 1;
            } else if (i == 2) {
                return 2;
            }
            return f(i - 1) + f(i - 2);
        }
}
