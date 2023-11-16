package org.example;

public class SavingsAccount implements BankAccount{
    private String accountNumber;
    private double amount;

    public SavingsAccount() {
    }

    public SavingsAccount(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount>(this.amount-200))
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
