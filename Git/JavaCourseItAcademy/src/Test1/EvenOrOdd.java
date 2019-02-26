package Test1;

/*
Write a program, which counts the number of even and odd numbers in an array.

Tip: If the number is divisible without remainder by 2 (that is, the remainder is zero), then it is even. Otherwise, it is odd.

 */
public class EvenOrOdd {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 88, 45, 66, 81, 23};
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
 //               System.out.println(array[i] + " is even");
                countEven++;

            } else {
//                System.out.println(array[i] + " is odd");
                countOdd++;
            }
        }
        System.out.println("Even count: " + countEven);
        System.out.println("Odd count: " + countOdd);
    }
}

