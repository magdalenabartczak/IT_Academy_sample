package Homework.Homework5.ArrayUtils;
// create class ArrayApplication with main method.
// In main methods declare local variable int[] myArray = new int[5].
// Fill array with 5 numbers.
// Then use your static methods from ArrayUtils to find max and min number in myArray:

public class ArrayApplication {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 7;
        myArray[2] = 4;
        myArray[3] = 15;
        myArray[4] = 10;


        int minNumber = ArrayUtils.min(myArray);
        System.out.println("min number is " + minNumber);

        int maxNumber = ArrayUtils.max(myArray);
        System.out.println("max number is " + maxNumber);
    }
}