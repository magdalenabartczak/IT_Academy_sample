package Homework.Homework11;

/*
Calculate how many numbers from the array satisfy the following condition: number is divisible by 3 and greater than 3.
 */
public class NumberDivisibleBy3 {
    public static void main(String[] args) {
        int[] divisible;
        int count=0;
        int numbers[] = new int[]{1, 5, 3, 6, 23, 54, 3, 6, 7, 4, 4, 8, 9, 3, 15};


//    public static boolean isDivisible(int[] numbers, int count) { ????

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] > 3) {
                System.out.println(numbers[i]);
                count++;

            }
        } System.out.println("Count: " +count);
    }


    }



