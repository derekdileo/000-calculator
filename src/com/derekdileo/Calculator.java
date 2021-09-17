package com.derekdileo;

public class Calculator {

    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if(y != 0) {
            return x / y;
        }
        return -1;
    }

    public static int square(int x) {
        return x * x;
    }

    public static double squareRoot(int x) {
        if (x >= 0) {
            return Math.sqrt(x);
        } else {
            return -1;
        }
    }


}