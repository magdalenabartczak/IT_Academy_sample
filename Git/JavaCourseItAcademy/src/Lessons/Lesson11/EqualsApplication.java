package Lessons.Lesson11;

import Lessons.Lesson9.Person;

import javax.swing.plaf.SpinnerUI;

public class EqualsApplication {
    public static void main(String[] args) {
        Person p1 = new Person("Steven", "Grey");
        Person p2 = new Person("Steven", "Grey");
        Person p3 = p2;

        if (p1 == p2) {
            System.out.println("objects p1 & p2 are the same");
        } else {
            System.out.println("objects p1 & p2 are not the same");
        }

        if (p2 == p3) {
            System.out.println("objects p2 & p3 are the same");
        } else {
            System.out.println("objects p2 & p3 are not the same");
        }

        boolean p1Equalsp2 = p1.equals(p2);     // porównuje referencje, sprawdza czy jest to samo miejsce w pamięci
        if (p1Equalsp2) {
            System.out.println("p1 & p2 are equal");
        } else {
            System.out.println("p1 & p2 not equal");
        }




        System.out.println();

        System.out.println("Reflective");
        System.out.println(p1.equals(p1));

        System.out.println();
        System.out.println("transitive");
        boolean p1Ep2 = p1.equals(p2);
        boolean p2Ep3 = p2.equals(p3);
        System.out.println(p1.equals(p3)); //powinno wyjść true

        System.out.println();
        System.out.println("Symmetric");
        boolean p1Ep2_ = p1.equals(p2);
        boolean p2Ep1_ = p2.equals(p1);
        System.out.println(p1Ep2_);                          // też powinno być true, ale chyba jesdt faLSE BO NIE OVERRIDOWAŁAM metody gdzieśtam

        System.out.println();
        System.out.println("Consistent");
        System.out.println("invocation 1: " + p1.equals(p2));
        System.out.println("invocation 2: " + p1.equals(p2));
        System.out.println("inocation 3: " + p1.equals(p2));

        System.out.println();
        System.out.println("null-safe");
        System.out.println(p1.equals(null));                // app should not crash, just return false

    }
}
