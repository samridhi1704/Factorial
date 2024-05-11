package com.example.factorial;   //package

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;  //imports assertion class from Junit Jupiter  API
import org.junit.jupiter.api.Test; // imports Test annotation from Junit Jupiter APi used to denote a method as test method


public class FactorialCalculatorTest { //contains method FactorialCalculator
    private FactorialCalculator calculator = new FactorialCalculator(); //declares the private field calculator of type FactorialCalculator

    @Test
   public void testFactorialOfZero() {

        Assertions.assertEquals(1,calculator.calculateFactorial(0));  //calculateFactorial method
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Assertions.assertEquals(120, calculator.calculateFactorial(5));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class,()->
        {
            calculator.calculateFactorial(-5);
        });
    }
}