package com.Banking.Models;

import java.util.Date;

public class Transaction {
    // Fields
    private float amount;
    private String type; // e.g., DEPOSIT, WITHDRAW, TRANSFER, etc.
    private Date date;
    private Account account; // Each transaction belongs to one account

    // Constructors
    public Transaction() {
        this.date = new Date(); // default: current date
    }

    public Transaction(float amount, String type) {
        this.amount = amount;
        this.type = type;
        this.date = new Date(); // set to current time
    }

    public Transaction(float amount, String type, Date date, Account account) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.account = account;
    }

    // Getters and Setters
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}