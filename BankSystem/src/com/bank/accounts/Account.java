package com.bank.accounts;

import java.io.IOException;
import com.bank.exception.InsufficientBalanceException;

public class Account {

    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws IOException, InsufficientBalanceException {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}