/* Write a program to implement the Multiple Inheritance kind of framework (Bank Interface, Customer & Account classes). */

interface Bank {
    String bankName = "State Bank of India";

    void displayBankDetails();
}

class Customer {
    String customerName;
    String customerId;

    public Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account extends Customer implements Bank {
    String accountNumber;
    double balance;

    public Account(String customerName, String customerId, String accountNumber, double balance) {
        super(customerName, customerId);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }

    public void displayAccountDetails() {
        displayBankDetails();
        displayCustomerDetails();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Account myAccount = new Account("Angshuman Pal", "101", "AJQWE18267S", 50000.0);
        myAccount.displayAccountDetails();
    }
}