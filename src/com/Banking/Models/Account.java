package com.Banking.Models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    // Fields
    private float balance;
    private List<Transaction> transactions;
    private Customer customer;
    private Bank bank;

    // Constructors
    public Account() {
        this.balance = 0.0f;
        this.transactions = new ArrayList<>();
    }

    public Account(float balance, Customer customer, Bank bank) {
        this.balance = balance;
        this.customer = customer;
        this.bank = bank;
        this.transactions = new ArrayList<>();
        if (bank != null) {
            bank.addAccount(this);
        }
        if (customer != null) {
            customer.addAccount(this);
        }
    }

    // Getters and Setters
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    // ===================== Methods =====================

    // Deposit without UPI (normal transaction)
    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction(amount, "DEPOSIT"));
        }
    }

    // Deposit with UPI
    public void deposit(float amount, String upiId) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new UPI(amount, "DEPOSIT", upiId));
        }
    }

    // Withdraw without UPI (normal transaction)
    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction(amount, "WITHDRAW"));
        }
    }

    // Withdraw with UPI
    public void withdraw(float amount, String upiId) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new UPI(amount, "WITHDRAW", upiId));
        }
    }
}