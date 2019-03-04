package ZZ_Inne;

public class Output {
    public static void main(String[] args) {
//        String[][] listing = new String[][] { { "Book", "34.99" },
//                { "Game", "29.99" }, { "Pen", ".99" } };
//        System.out.println(listing.length + " " + listing[0].length);

//        int fish = 1 + 2 * 5>=2 ? 4 : 2;
//        int mammals = 3 < 3 ? 1 : 5>=5 ? 9 : 7;
//        System.out.print(fish+mammals+"");

        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);

    }
}
