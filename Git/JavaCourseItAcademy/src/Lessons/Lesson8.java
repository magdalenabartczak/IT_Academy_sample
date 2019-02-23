package Lessons;

public class Lesson8 {


    public static void main(String[] args) {
        int number = 10; // number
        Integer numberWrapper = number;  //object, we can call methods
        Character character = 'a';
        char upperCase = Character.toUpperCase(character);

        System.out.println(upperCase);

        boolean digit = Character.isDigit(character);
        System.out.println(digit);

        /*
        Strings - można wpisywać normalnie albo przez konstruktor. By default String keeps array of chars
        inside String object you will have array of chars
        Immutable object - object can't be changed  - trzeba go przypisać do nowej zmiennej
         */

        String someString = "my string here";
        String usingConstructor = new String("my string from constructor");

        String upperCased = someString.toUpperCase();
        System.out.println(someString);
        System.out.println(upperCased);

        int lenght = someString.length();
        System.out.println(lenght);

        char fifth = someString.charAt(5);   //pokazuje char na danej pozycji, jak w arrayu czyli liczy się od 0
        System.out.println(fifth);

        char[] chars = someString.toCharArray();
        chars[3] = 'Q';

        String str = new String(chars); // robimy string z arraya

        System.out.println(str);

        String summedUp = someString + " + end ";
        System.out.println(summedUp);

        String substring = summedUp.substring(3, 7); //wyciąga <3,7) char
        System.out.println(substring);

        String formatted = String.format("You have %d grade", 5); // %d placeholder for number here number is provided -> 5
        System.out.println(formatted);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("first");
        stringBuilder.append("second");
        int number1 = 5;
        if (number1 > 0) {
            stringBuilder.append("number more than 0");
        }

        int number2 = 100_000_000; // syntax do bardziej czytelnego zapisu liczb, można tylko między cyframi wstawić _
        double doubleValue = 100_000_000_000.123;

        int[] numbers11 = new int[]{1, 2, 3, 4, 5}; // taki tam sposób deklaracji arraya
        int[][] numbers2D = new int[2][];
        numbers2D[0] = new int[]{1, 2, 3};
        numbers2D[1] = new int[]{4, 5, 6};
        //  lub
        int[][] numbers2D2 = new int[][]{       // i jeszcze jeden sposób zapisu 
                {1, 2, 3},
                {4, 5, 6}
        };
    }


//        private static String reverse (String str){  //reverse order of characters <- można poszukać odpowiedniej metody w bibliotece
//

//            int[] reversedChars = new int[lenght];
//
//            for (int i = 0; i < lenght; i++) {
//                reversedChars[lenght - 1] = chars[i];
//                lenght = lenght--;
//                return "";
//            }
//            System.out.println("Reversed chars array: ");
//            for (int j = 0; j < lenght; j++) {
//                System.out.println(reversedChars[j] + ",");

}




