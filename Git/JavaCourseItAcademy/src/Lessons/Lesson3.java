package Lessons;

import java.util.Scanner;

public class Lesson3 {
// LOOPS

    //while loop - will continue until condition is true
    // while(exp){
    // statements;
    // }

    // do while loop

    // for(inicialization; terminal condition; increment assignment){
    // statements;
    // }
    public static void main(String[] args) {
//        System.out.println("Podaj x");
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//
//        while (x < 10) {
//            System.out.println("while loop:" +x);
//            x++;
//        }
//
//        do {
//            System.out.println("do while " +x);
//            x++;
//        } while(x<10);

//        for (int x = scanner.nextInt(); x < 10; x++) {
//            System.out.println("for loop " + x);
//        }


// Printuje wszystkie liczby podzielne przez 3 od zera do wartości, którą podał user
//
//        System.out.println("Podaj liczbę");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//
//        for (int x = 0; x < i; x++) {
//
//            if (x % 3 == 0 && x % 5 == 0) {
//                System.out.println("Liczby podzielne przez 15 to: " + x);
//            }
//        }

        // break & continue

        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

//        for (int x = 0; x < i; x++) {
//
//            if (x % 3 == 0) {
//                System.out.println("Podzielne przez 3 jest: " + x);
//                continue;
//            }
//            if (x == 7) {
//                System.out.println("A to jest siedem i koniec: " + x);
//                break;
//            }
//            System.out.println("Niepodzielne przez 3 jest: " + x);
//        }
//      } ? nie wiem czy ten nawias jest konieczny


        // switch
        switch (i) {
            case 3:
                System.out.println("first case 3");
                break;
            case 7:
                System.out.println("case 7");
                break; // general practise is to put break after each case
                // default:
                // sout("sth default");
        }
        System.out.println("end");

    }
}