package com.junitdemo;

public class Junitdemo {

public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(Junitdemo.add(5, 3));        // Output: 8
        System.out.println(Junitdemo.subtract(5, 3));
        System.out.println(Junitdemo.multiply(5, 3));
        System.out.println(Junitdemo.divide(5, 3));
    }
}
