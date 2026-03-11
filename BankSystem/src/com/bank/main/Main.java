package com.bank.main;

import com.bank.accounts.SavingsAccount;
import com.bank.exception.InsufficientBalanceException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount("ACC1001", 5000);

        acc.deposit(2000);

        try {
            acc.withdraw(3000);
            acc.withdraw(6000); 
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }

        System.out.println("Current Balance: " + acc.getBalance());
    }
}