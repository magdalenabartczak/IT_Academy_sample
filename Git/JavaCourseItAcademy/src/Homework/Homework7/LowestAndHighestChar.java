package Homework.Homework7;

// You have an array of chars. Print the lowest and the highest char.


import java.util.Arrays;
import java.util.Collections;

public class LowestAndHighestChar {

    public static void main(String[] args) {

        Character[] myChars
                = new Character[]{'a', 'A', 'Y', 'c', 'Q', 'w'};

        char min = Collections.min(Arrays.asList(myChars));
        char max = Collections.max(Arrays.asList(myChars));


        System.out.println("Minimum char is : " + min);
        System.out.println("Maximum char is : " + max);
    }
}

