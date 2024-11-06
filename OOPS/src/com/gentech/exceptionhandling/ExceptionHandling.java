package com.gentech.exceptionhandling;

class Handling {
    public static void getDivision(int x, int y) {
        try {
            int res = x / y;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Invalid input: Division by zero is not allowed.");
        } finally {
            System.out.println("Division attempt completed.");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Handling.getDivision(10, 0);
        Handling.getDivision(10, 2); // Adding another case to show normal division
    }
}