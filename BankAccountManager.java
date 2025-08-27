package workshop;

public class BankAccountManager {
    String accountNumber;
    double balance;

    public BankAccountManager(String acc123, double v) {
    }

    public void BankAccount(String accNumber, double initialBalance) {
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > (double)0.0F) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }

    }

    public void withdraw(double amount) {
        if (amount > (double)0.0F && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }

    }

    public void checkBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccountManager myAccount = new BankAccountManager("ACC123", (double)1000.0F);
        myAccount.checkBalance();
        myAccount.deposit((double)500.0F);
        myAccount.withdraw((double)200.0F);
        myAccount.withdraw((double)2000.0F);
        myAccount.checkBalance();
    }
}
