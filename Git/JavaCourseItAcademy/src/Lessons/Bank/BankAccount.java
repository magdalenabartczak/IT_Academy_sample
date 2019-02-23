package Lessons.Bank;

public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        balance += balance;
    }
    public void withdraw (double value){
        balance -= value;
    }
}
