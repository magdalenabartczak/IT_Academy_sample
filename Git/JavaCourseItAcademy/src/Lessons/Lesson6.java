package Lessons;

public class Lesson6 {
    public static void main(String[] args) {
        // dla każdego elementu tablicy bierze wartość
        
        int[] numbers = new int[]{1, 2, 3};
        for (int v : numbers) {          //for each
            System.out.println(v);
            if (v == 1) {
                break;
            }
        }
    }
}
