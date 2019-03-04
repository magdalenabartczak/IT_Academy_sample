package Homework;
/*
Implement mehod which returns a number of digits in integer number.

Examples:
int n = numberOfDigits(10); // should be 2
int n = numberOfDigits(145); // should be 3
int n = numberOfDigits(10234); // should be 5
 */
public class Homework12 {

    public static int numberOfDigits(int ... number) {
        return number.length;
    }

    public static void main(String[] args) {
        int n = numberOfDigits(1,1,1);

        System.out.println("Number of digits: " + n);
    }

}
