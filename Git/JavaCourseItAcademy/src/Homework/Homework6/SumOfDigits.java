package Homework.Homework6;

// Write a Java program and compute the sum of the digits of an integer
// Input data: number 35 -> Expected result: 8
// Tips: think about using while loop, and remainder % operator

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        int number;
        int reminder;
        int sum = 0;

        System.out.println("Please type number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while (number > 0) {
            reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        System.out.format("Sum of digits = %d ", +sum);

    }
}
