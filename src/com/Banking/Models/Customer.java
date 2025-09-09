package com.Banking.Models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // Fields
    private String name;
    private String customerID;
    private List<Account> accounts; // One customer can have multiple accounts

    // Constructors
    public Customer() {
        this.accounts = new ArrayList<>();
    }

    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
        this.accounts = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    // These methods were not mentioned in the UML due to time pressure, but I feel that these methods should be there with Customer class.
    public void addAccount(Account account) {
        if (account != null && !accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }
}