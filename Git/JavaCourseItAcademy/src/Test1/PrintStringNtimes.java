package Test1;

public class PrintStringNtimes {
    public static void main(String[] args) {
        String[] arrOfStrings = new String[]{"a", "b"};
        int n = 3;


            for (int i = 0; i < arrOfStrings.length; i++) {
                for (int j = 0; j < n; j++)
                System.out.print(arrOfStrings[i] + " ");
            }
    }
}

