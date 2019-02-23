package Lessons.Bank;

public class BankApplication {
    public static void main(String[] args) {
        User user = new User(5); // may have up to 5 accounts
        user.setName("Paul");
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(150);
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.deposit(100);


        // method that allows to assign bank account to user
        user.addBankAccount(bankAccount);

        user.printUserInfo();


        transfer(bankAccount, bankAccount2, 75);
        user.printUserInfo();
    }

    public static void transfer(BankAccount from, BankAccount to, double value) {
        from.withdraw(value);
        to.deposit(value);
    }
}
