package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();
    int a = 5;
    int b = 3; 

    // TODO: Write a unit test for the add() method.
    @Test
    public void testAdd() {
        calc = new Calculator();
        assertEquals(5, calc.add(2, 3));

    }

    // TODO: Write a unit test for the subtract() method.
    @Test
    public void testSubtract() {
        // Example test: Check if 5 - 3 equals 2
        calc = new Calculator();
        assertEquals(2, calc.subtract(a, b));
    }

    // TODO: Write a unit test for the multiply() method.
    @Test
    public void testMultiply() {
        // Example test: Check if 4 * 3 equals 12
        calc = new Calculator();
        assertEquals(2, calc.multiply(a, b));
    }

    // TODO: Write a unit test for the divide() method.
    @Test
    public void testDivide() {
        // Example test: Check if 10 / 2 equals 5
    }

    // TODO: Write a unit test that ensures divide() throws an ArithmeticException when dividing by zero.
    @Test
    public void testDivideByZero() {
        // Check that an ArithmeticException is thrown when dividing by zero.
    }
}
