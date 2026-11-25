class Bank {
    String accountHolder;
    double balance;

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Bank {
    double interestRate = 5;

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Savings Interest: " + interest);
    }
}

class CurrentAccount extends Bank {
    double overdraftLimit = 10000;

    void displayOverdraft() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class Main {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        s.accountHolder = "Harsha";
        s.balance = 50000;

        System.out.println("Savings Account");
        s.displayDetails();
        s.calculateInterest();

        CurrentAccount c = new CurrentAccount();
        c.accountHolder = "Rahul";
        c.balance = 30000;

        System.out.println("\nCurrent Account");
        c.displayDetails();
        c.displayOverdraft();
    }
}
