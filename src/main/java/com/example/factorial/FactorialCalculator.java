package com.example.factorial;

import java.util.Scanner;

public class FactorialCalculator
{
    public int calculateFactorial(int n)
    {
        if(n<0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int factorial =1;
        for (int i = 1; i <=n ; i++) {
            factorial*=i;

        }
        return factorial;

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = scanner.nextInt();

        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(number);

        System.out.println("factorial of number  " + "is : " + result);
        scanner.close();
    }
}
