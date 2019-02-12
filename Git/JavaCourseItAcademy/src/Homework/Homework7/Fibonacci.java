package Homework.Homework7;
/*
Create program to calculate Fibonacci number of given order.
Fibonacci of 0: F(0) = 0
Fibonacci of 1: F(1) = 1
Fibonacci of n: F(n) = F(n-1) + F(n-2)

Example for Fibonacci of 2: F(2) = F(1) + F(0) = 1 + 0 = 1
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Please type a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("F(0) = 0");
        System.out.println("F(1) = 1");

        int fn1 = 0;
        int fn2 = 1;

        for (int i = 1; i <= n; i++) {
            int fn = fn1+fn2;
            fn1 = fn2;
            fn2 = fn;

            System.out.println("F(" + (i + 1) + ") = " + fn);
        }
    }
}

