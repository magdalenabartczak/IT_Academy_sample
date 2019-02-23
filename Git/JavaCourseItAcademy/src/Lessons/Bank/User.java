package Lessons.Bank;

public class User {
    //referencja do bank accounts

    private BankAccount[] bankAccounts;
    private int accountLenght = 0;  //int how many accounts user really has
    private String name;


    //initialze using constructor
    public User(int numberOfAccounts) {
        this.bankAccounts = new BankAccount[numberOfAccounts];

    }

    public void setName (String name) {
        this.name = name;
    }

    public void addBankAccount(BankAccount bankAccount) {
        if (accountLenght == 5) {
            return;
        }
        bankAccounts[accountLenght] = bankAccount;   // dla pierwszego konta
        accountLenght++;
    }

    public void printUserInfo() {
        System.out.println("Name: " + name);
        for (int i = 0; i < accountLenght; i++) {
            BankAccount a = bankAccounts[i];
            System.out.println("account: " + a.getBalance());
        }
    }
}
