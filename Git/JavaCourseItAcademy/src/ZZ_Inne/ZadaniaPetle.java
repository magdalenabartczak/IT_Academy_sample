package ZZ_Inne;

import java.util.Scanner;

public class ZadaniaPetle {
    public static void main(String[] args) {

        System.out.println("popdaj liczbę");
        Scanner scanner = new Scanner(System.in);

        //       for (int x = scanner.nextInt(); x >= 0; x-- ) {
        //          System.out.println("Bomba wybuchnie za: " + x);
        //       }
        int x = scanner.nextInt();

//        while (x >= 0) {
//            System.out.println(" Bomba wybuchnie za: " + x);
//            x--;
//        }
        do {
            System.out.println("Bomba wybuchnie za... " +x);
            x--;
        }
            while (x >= 0);



    }
}
