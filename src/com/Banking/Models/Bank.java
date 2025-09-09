package com.Banking.Models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Fields
    private List<Account> accounts;

    // Constructors
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    // Getters and Setters
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    // Methods from UML
    public void addAccount(Account account) {
        if (account != null && !accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }
}