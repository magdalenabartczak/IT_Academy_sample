package Lessons;

public enum EnumerationCurrency {
    USD (3.6) , PLN (1.0), EUR (4.3), AUSTRALIAN_DOLLAR (3.3);

    private double exchangeRate;

    EnumerationCurrency(double exchangeRate){
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
