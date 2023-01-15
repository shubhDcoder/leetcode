/*
 * Copyright (c) 2023.
 * AlgoMonkey. - All Rights Reserved
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium is strictly prohibited.
 */

package org.code.monkey;

public class LC_509_Fibonacci_Number {
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Test cases
    public static void main(String[] args) {
        LC_509_Fibonacci_Number fibObject = new LC_509_Fibonacci_Number();

        assert fibObject.fib(4) == 3 : "failed for 4";
        assert fibObject.fib(3) == 2 : "failed for 3";
        assert fibObject.fib(2) == 1 : "failed for 2";
        System.out.println("All Test Cases Passed");
    }
}
