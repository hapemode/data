package com.ppx.algorithm.recursion_single;

/**
 * 递归求阶乘
 */
public class E01Factorial {

    public static Integer f(int i) {
        if (i==1){
            return 1;
        }
        return i*f(i-1);
    }

    public static void main(String[] args) {
        Integer f = f(3);
        System.out.println("f = " + f);
    }
}
