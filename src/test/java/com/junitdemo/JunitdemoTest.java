package com.junitdemo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JunitdemoTest {

    @Test
    void testAdd() {
        Assertions.assertEquals(8, Junitdemo.add(5, 3));
        Assertions.assertEquals(0, Junitdemo.add(-2, 2));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(2, Junitdemo.subtract(5, 3));
        Assertions.assertEquals(-4, Junitdemo.subtract(1, 5));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(15, Junitdemo.multiply(5, 3));
        Assertions.assertEquals(0, Junitdemo.multiply(5, 0));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2, Junitdemo.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Junitdemo.divide(5, 0)
        );

        Assertions.assertEquals("Cannot divide by zero", exception.getMessage());
    }
}