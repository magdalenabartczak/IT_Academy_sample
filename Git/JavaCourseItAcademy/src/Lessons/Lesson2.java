package Lessons;

public class Lesson2 {
    public static void main(String[] args) {

        int age = 20;
        if (age < 13) {
            System.out.println("Am I child?");
        } else if (age < 20) {
            System.out.println("I am teenager");
        } else if (age >= 40) {
            System.out.println("maybe I am not so old yet");
        } else {
            System.out.println("I am always 20!");
        }

    }
}