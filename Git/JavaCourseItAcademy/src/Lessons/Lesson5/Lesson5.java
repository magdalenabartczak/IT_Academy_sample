package Lessons.Lesson5;

import java.util.Scanner;

public class Lesson5 {
    // Omówienie zadania domowego,
    // variables:
    // -class level
    // -method variables
    // -block variables

    // Declaration of class fields
    // modifier FINAL w przypadku pi.
    // Znaczy, ze ta wartość jest stała i nigdy się nie zmieni (constans)

    // modifier STATIC - to assign to the class itself !not to instance of the class!
    // (przydaje się gdy mamy dużo obiektów bo oszczędza miejsce)

    // jak się połączy static final to wszędzie będzie taka sama wartość i będzie ona niezmienna (jak stałe w fizyce)


    // Array - reference data type that holds collection of another values

    int[] variable_name = new int[10]; //tworzymy nową pustą tablicę z jednym rzędem i 10 polami

    // index starts from 0 więc dla tablicy z 10 polami max index będzie 9
    // może być nawet tablica kółek -> Circle[] kolka = new Circle[5]

    // AVERAGE


    public static void main(String[] args) {
        System.out.println("Please type how many numbers from you want to calculate average");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("type numbers");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        double avg = average(numbers);          // <- jak się wynosi część do metody to trzeba zdeklarować zmienną w mainie i odwołać sie do metody
        System.out.println("Average = " +avg);
    }

    // modifier static for methods

        static double average(int[] numbers){
            double sum = 0;
            double n = numbers.length;
            for (int i = 0; i < n; i++) {
                sum = sum + numbers[i];
            }
            double avg = sum / n;
            return avg;
        }

        // TERNARY OPERATOR (operator trójargumentowy)
        // if-else statement może być zapisany prościej

        // expression_predicate ? expression_if_true : expression_if_false
        // e.g
        //    boolean positive = n>=0 ? true : false

        //    int price = 100 jeśli cena jest większa od 100 to daj 5% zniżki
        //    int discount = price > 100 ? 5: 0;

        //    static max(int a, int b) {
        //        int max = a > b ? a : b;
        //        return max;
        //    }


    }




