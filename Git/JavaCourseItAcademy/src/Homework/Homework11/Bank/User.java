package Homework.Homework11.Bank;

public class User {

    private BankAccount[] bankAccounts;
    private int accountLength = 0;
    private String name;

    public User(int numberOfAccounts) {
        this.bankAccounts = new BankAccount[numberOfAccounts];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBankAccount(BankAccount bankAccount) {
        if (accountLength == 5) {
            return;
        }
        bankAccounts[accountLength] = bankAccount;
        accountLength++;
    }

    public void printUserInfo() {
        System.out.println("Name: " + this.name);
        for (int i = 0; i < accountLength; i++) {
            BankAccount a = bankAccounts[i];
            System.out.println("account: " + a.getBalance());
        }
    }
}
