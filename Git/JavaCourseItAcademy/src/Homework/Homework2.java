package Homework;
//Write a program that will print discount for the client based on the given rules:
//   - if age of client is greater than 65, discount is 10%
//   - if age is less than 18, discount is 25%
//   - if client is regular - then give additional 5%

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
       System.out.println("What is your age?");
       Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

 //       int age = 67;

        System.out.println("age: " +age);

        if (age > 65) {
            System.out.println("Your discount is 10%");
        } else if (age < 18) {
            System.out.println("Your discount is 25%");
        } else {
            System.out.println("Your discount is 5%");
        }
    }
}
