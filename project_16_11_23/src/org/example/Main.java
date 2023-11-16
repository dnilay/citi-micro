package org.example;

import java.util.UUID;

public class Main {
    public static void main(String[] args)
    {
        BankAccount account1=new SavingsAccount(UUID.randomUUID().toString(),1200);
        System.out.println(account1);
        account1.deposit(100);
        account1.withdraw(1000);
        account1.withdraw(200);
        account1=new CurrentAccount(UUID.randomUUID().toString(),3000);
        System.out.println(account1);
        account1.withdraw(2500);
    }
}
