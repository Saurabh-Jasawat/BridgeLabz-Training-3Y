package Inheritance;
public class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Checking Account, Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int term;
    FixedDepositAccount(int accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account, Term: " + term + " years");
    }
}

class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, 5000, 4.5);
        CheckingAccount ca = new CheckingAccount(1002, 10000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount(1003, 50000, 5);
        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
