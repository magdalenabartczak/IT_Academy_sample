package Homework.Homework7;

import java.util.Scanner;

//Create program to calculate factorial of entered number.

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please type a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(number + " factorial = " + factorial);
    }
}
