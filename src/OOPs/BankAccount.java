package OOPs;

class Account{
    String ownerName;
    int balance;
    static double interestRate = 4.5; // All accounts share one interest rate, DO NOT pass in constructor

    Account(String ownerName, int balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void printDetails(){
        System.out.println("Name: " + ownerName + ", Balance: " + balance + ", Interest Rate: " + interestRate);
    }
}


public class BankAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("Aayam", 97000);
        Account acc2 = new Account("Aaryan", 100000);

        acc1.printDetails();
        acc2.printDetails();
    }
}
