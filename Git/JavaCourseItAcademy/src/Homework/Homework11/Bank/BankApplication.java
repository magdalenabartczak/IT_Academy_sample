package Homework.Homework11.Bank;

public class BankApplication {
    public static void main(String[] args) {
    User user = new User(5);
    user.setName("Paul");

    BankAccount bankAcoount = new BankAccount();
    bankAcoount.deposit(150);

    BankAccount bankAcoount2 = new BankAccount();
    bankAcoount2.deposit(100);

    user.addBankAccount(bankAcoount);
    user.addBankAccount(bankAcoount2);

    user.printUserInfo();

    transfer(bankAcoount, bankAcoount2, 75);

    user.printUserInfo();
}

    public static void transfer(BankAccount from, BankAccount to, double value) {
        from.withdraw(value);
        to.deposit(value);
    }
}
