package com.bank.accounts;

import java.io.IOException;
import com.bank.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, IOException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }

        super.withdraw(amount);
    }
}