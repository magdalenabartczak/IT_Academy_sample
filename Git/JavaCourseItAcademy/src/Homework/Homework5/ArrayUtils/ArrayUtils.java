package Homework.Homework5.ArrayUtils;
//2) in class ArrayUtils create method which finds maximum number in the array.
// Method should be declared as follows:
// public static int max(int[] numbers) {
//   your code here }
// 3) in class ArrayUtils create method which finds minimum number in array.
// Method should be declared as follows:
// public static int min(int[] numbers) {
//   your code here }

// Use :for loop, if conditional statement, int n = numbers.length

public class ArrayUtils {


    public static int max(int[] myArray) {
        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public static int min(int[] myArray) {
        int min = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }

}






