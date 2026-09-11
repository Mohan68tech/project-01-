class BankAccount {

    private long accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {

    public static void main(String[] args) {

        BankAccount account =
            new BankAccount(10016868, "Mohan", 55000);

        account.deposit(2000);
        account.withdraw(3000);

        account.displayBalance();
    }
}