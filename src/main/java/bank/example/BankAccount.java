package bank.example;

public class BankAccount {
    private String owner;
    private double balance;


    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double amount) {
        if (amount > 0){
        this.balance = balance + amount;
            System.out.println("Deposit successful. Now you have " + this.balance);
        }
        else
            System.out.println("Deposit amount must be positive");
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance = balance - amount;
            System.out.println("Withdrawal successful. Now you have " + this.balance);
        }
        else
            System.out.println("Insufficient funds or invalid amount");
    }
}