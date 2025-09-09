package com.Banking.Models;

import java.util.Date;

public class UPI extends Transaction {
    // Fields
    private String upiId;

    // Constructors
    public UPI() {
        super();
    }

    public UPI(float amount, String type, String upiId) {
        super(amount, type); // parent constructor sets amount, type, date
        this.upiId = upiId;
    }

    public UPI(float amount, String type, Date date, Account account, String upiId) {
        super(amount, type, date, account);
        this.upiId = upiId;
    }

    // Getters and Setters
    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}