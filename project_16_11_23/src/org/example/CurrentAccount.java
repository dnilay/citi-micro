package org.example;

public class CurrentAccount extends Object implements BankAccount{

    private String accountNumber;
    private double amount;

    public CurrentAccount() {
    }

    public CurrentAccount(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount>(this.amount-500))
        {
            System.out.println("insufficiant fund try adding funds");
        }
        else {
            this.amount-=amount;
            System.out.println("amount withdrawled successfully... available balance is: "+this.amount);
        }
    }

    @Override
    public void deposit(double amount) {

        this.amount+=amount;
        System.out.println("amount deposited successfully. balance is: "+this.amount);
    }

    @Override
    public String toString() {
        return "account number: "+accountNumber+" available balance: "+amount;
    }
}
