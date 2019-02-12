package Homework.Homework7;
/*
Write a Java program to solve quadratic equations. Program has to ask a user to enter
coefficients a,b and c. Use methods from Math class to find square root (sqrt) and to
raise to a power of 2 (pow).
Quadratic equation:
Solution:
find Discriminant:
if Discriminant is positive - then solution has 2 roots
if Discriminant is 0 - then solution has 1 root
if Discriminant is negative - then equation does not have roots.
 */

import com.sun.tools.doclint.Entity;

import java.util.Scanner;


public class QuadraticEquations {
    public static void main(String[] args) {
        System.out.println("Please type 3 numbers");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (4 * a * c);
            double x2 = (-b - Math.sqrt(delta)) / (4 * a * c);
            System.out.println("x1 = "+x1+ ", x2 = " +x2);
        } else if (delta == 0) {
            double x = (-b) / 2 * a;
            System.out.println("x = " + x);
        } else {
            System.out.println("no root");
        }

    }

}



