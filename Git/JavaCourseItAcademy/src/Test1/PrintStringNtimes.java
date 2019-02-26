package Test1;

import java.util.Scanner;
/*Bonus task: enhance the program so each element is printed N times. N is defined in method main.
*/
public class PrintStringNtimes {
    public static void main(String[] args) {
        String[] arrOfStrings = new String[]{"a", "b"};
        System.out.println("Please provide number of times that strings from array should be printed (n)");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 0; i < arrOfStrings.length; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arrOfStrings[i] + " ");
        }
    }
}

