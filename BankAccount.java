package thisStaticFinal;
public class BankAccount {
    private static String bankName = "SBI Bank";
    private final String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "Ravi", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayAccountDetails();
    }
}
