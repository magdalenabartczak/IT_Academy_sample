package Lessons;


import java.util.Arrays;

public class CurrencyApplication {
    public static void main(String[] args) {

        EnumerationCurrency usdCurrency = EnumerationCurrency.USD;
        System.out.println(usdCurrency.getExchangeRate());

        EnumerationCurrency[] values = EnumerationCurrency.values(); // returns array of all possible values
        System.out.println(Arrays.toString(values));

        EnumerationCurrency pln = EnumerationCurrency.valueOf("PLN");
        System.out.println(pln.getExchangeRate());
    }
}
