package Homework.Homework4;

import java.util.Scanner;

// 1) Find the average value of five given integers.
// b) initialize integers with values entered by a user

public class AverageNumbersTypedByUser {
    public static void main(String[] args) {
        System.out.println("Please type 5 integer numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();


        double avg2 = (a + b + c + d + e) / 5.0;

        System.out.println("Average = " + avg2);

    }
}
