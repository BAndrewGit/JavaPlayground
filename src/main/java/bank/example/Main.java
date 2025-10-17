package bank.example;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Andrew", 10000);
        BankAccount JasonAccount = new BankAccount ("Jason", 4000);

        System.out.println(myAccount.getOwner());
        System.out.println(JasonAccount.getBalance());
        myAccount.withdrawMoney(1000);
        JasonAccount.depositMoney(5000);

    }
}
