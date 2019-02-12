package Homework.Homework7;
// Write a Java program that reads a number and display the square, cube, and fourth power


import java.util.Scanner;

public class SquareCubeFourthPower {
    public static void main(String[] args) {
        System.out.println("Please a number");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextInt();

        double n2 = Math.pow(number, 2);
        double n3 = Math.pow(number, 3);
        double n4 = Math.pow(number, 4);

        System.out.println(number + " square = " +n2);
        System.out.println(number + " cube = " +n3);
        System.out.println(number + " fourth power = " + n4);

    }
}
