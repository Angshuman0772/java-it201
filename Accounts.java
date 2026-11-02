/*
 * Create an abstract class Accounts with the following details:
 * Data Members:
 * (a) Balance (b) accountNumber (c) accountHoldersName (d) address
 * 
 * Methods:
 * (a) withdrawl()- abstract
 * (b) deposit()- abstract
 * (c) display() to show the balance of the account number
 * 
 * Create a subclass of this class SavingsAccount and add the following details:
 * Data Members:
 * (a) rateOfInterest
 * 
 * Methods:
 * (a) calculateAmount()
 * Write the Java program to implement this classes
 */

abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    Accounts(double balance, int accountNumber,
            String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }

    abstract void withdrawl(double amount);

    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(double balance, int accountNumber,
            String accountHoldersName, String address,
            double rateOfInterest) {

        super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    void withdrawl(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        }
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        System.out.println("Total Amount: " + (balance + interest));
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(
                10000, 12345, "Angshuman", "Kolkata", 5);

        account.display();

        account.deposit(2000);
        account.withdrawl(3000);

        System.out.println("\nAfter Transactions:");
        account.display();

        account.calculateAmount();
    }
}
