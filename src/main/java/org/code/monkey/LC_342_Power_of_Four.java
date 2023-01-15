/*
 * Copyright (c) 2023.
 * AlgoMonkey. - All Rights Reserved
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium is strictly prohibited.
 */

package org.code.monkey;

import java.util.Objects;

public class LC_342_Power_of_Four {
    public boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        return n % 4 == 0 && isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        LC_342_Power_of_Four obj = new LC_342_Power_of_Four();

        assertResult(obj.isPowerOfFour(16), true, "failed for 16");
        assertResult(obj.isPowerOfFour(5), false, "failed for 5");
        assertResult(obj.isPowerOfFour(1), true, "failed for 1");
        assertResult(obj.isPowerOfFour(0), false, "failed for 0");

        System.out.println("All Test Cases Passed");
    }

    private static void assertResult(boolean obtained, boolean expected, String message) {
        if (!Objects.deepEquals(obtained, expected)) {
            throw new AssertionError(String.format("obtained : %s, expected : %s, message : %s", obtained, expected, message));
        }
    }
}
