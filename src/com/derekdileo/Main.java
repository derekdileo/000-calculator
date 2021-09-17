package com.derekdileo;

import com.derekdileo.mylibrary.Series;

public class Main {

    public static void main(String[] args) {

        // Add
        System.out.println(Calculator.add(5, 2) == 7);
        System.out.println(Calculator.add(6, 4) == 10);
        System.out.println(Calculator.add(0, -1) != 1);

        // Subtract
        System.out.println(Calculator.subtract(5, 2) == 3);
        System.out.println(Calculator.subtract(-5, -11) == 6);
        System.out.println(Calculator.subtract(0, 0) == 0);

        // Multiply
        System.out.println(Calculator.multiply(5, 10) == 50);
        System.out.println(Calculator.multiply(20, 10) == 200);
        System.out.println(Calculator.multiply(-20, -10) == 200);
        System.out.println(Calculator.multiply(-20, 10) == -200);

        // Divide
        System.out.println(Calculator.divide(10, 5) == 2);
        System.out.println(Calculator.divide(10, 0) == -1); // Cannot divide by 0!
        System.out.println(Calculator.divide(-10, 2) == -5);

        // Square
        System.out.println(Calculator.square(5) == 25);
        System.out.println(Calculator.square(-5) == 25);
        System.out.println(Calculator.square(0) == 0);

        // Square root
        System.out.println(Calculator.squareRoot(25) == 5);
        System.out.println(Calculator.squareRoot(-25) == -1); // Cannot sqrt negative number (imaginary)
        System.out.println(Calculator.squareRoot(1) == 1);
        System.out.println(Calculator.squareRoot(0) == 0);

        // nSum
        System.out.println(Series.nSum(4) == 10);
        System.out.println(Series.nSum(10) == 55);

        // Factorial
        System.out.println(Series.factorial(6) == 720);

        // Fibonacci
        System.out.println(Series.fibonacci(10) == 55);
        
    }
}
