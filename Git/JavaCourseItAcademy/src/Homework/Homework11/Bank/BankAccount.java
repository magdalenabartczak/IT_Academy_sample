package Homework.Homework11.Bank;

public class BankAccount {
    private double balance;

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double value) {
//        balance = balance - value;
        balance -= value;
    }

    public double getBalance() {
        return balance;

    }
}
