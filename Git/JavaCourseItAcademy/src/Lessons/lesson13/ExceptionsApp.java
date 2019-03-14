package Lessons.lesson13;

public class ExceptionsApp {
    public static void main(String[] args) {
        System.out.println(doubleNumber(6));
//        System.out.println(doubleNumber(0));


        int a = -5;

        try {
            System.out.println(doubleNumber(a));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("a was zero");
        }
    }

    public static int doubleNumber(int a) throws ArithmeticException, NullPointerException {
        if (a == 0) {
            throw new NullPointerException("a is 0"); // code after this line won't be executed
        }
        if (a < 0) {
            throw new ArithmeticException("a is negative");
        }
        return 2 * a;
    }
}