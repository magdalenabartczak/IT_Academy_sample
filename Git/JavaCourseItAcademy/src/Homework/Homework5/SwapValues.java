package Homework.Homework5;
// You have two variables. The goal is to swap their values and print the value of each variable.
//Example: you have x=1 and y=2. After your program you should have x=2 and y=1.

public class SwapValues {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x + ", y = " + y);


    }
}
