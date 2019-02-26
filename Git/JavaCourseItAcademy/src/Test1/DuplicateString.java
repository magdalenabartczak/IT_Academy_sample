package Test1;

/* Write a program, which duplicates each String element of the given array.

Example:
Input: array with following elements: "a" , "b"
Output: "a","a","b","b"

Bonus task: enhance the program so each element is printed N times. N is defined in method main.
*/
public class DuplicateString {
    public static void main(String[] args) {
        String[] arrOfStrings = new String[]{"a", "b"};

        for (int i = 0; i < arrOfStrings.length; i++){
            for (int j = 0; j < 2; j++)
            System.out.print(arrOfStrings[i]+ ", ");
        }
    }
}
