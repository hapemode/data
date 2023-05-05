package com.ppx.algorithm.recursion_single;

/**
 * 反向打印字符串
 */
public class E02ReversePrintString {

    public static void f(int n, String str) {
        if (n == str.length()) {
           return;
        }
        f(n + 1, str);
        System.out.print(str.charAt(n));
    }

    public static void main(String[] args) {
        f(0, "abcdef");
    }
}
