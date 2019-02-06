package Homework.Homework4;

//2) Determine whether the number entered by a user is divisible by 23.

import java.util.Scanner;

public class NumberMod23 {
    public static void main(String[] args) {
        System.out.println("Please type an integer number");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i % 23 == 0) {
            System.out.println("Number is divisible by 23");
        } else {
            System.out.println("Number is not divisible by 23");
        }

    }
}
