package com.Banking.Main;

import com.Banking.Models.*;

public class Main {
    public static void main(String[] args) {

        // Step 1: Create a customer
        Customer customer = new Customer("Harsh","101");
        System.out.println("Customer created: " + customer.getName());

        // Step 2: Create a bank
        Bank bank = new Bank();
        System.out.println("Bank created. Initially, accounts = " + bank.getAccounts().size());

        // Step 3: Create 2 accounts and associate with customer & bank
        Account account1 = new Account(1000f, customer, bank);
        System.out.println("Account 1 created with initial balance 1000. "
                + "It is in composition with Customer '" + customer.getName()
                + "' and Bank. [Bank.addAccount() was called]");

        Account account2 = new Account(2000f, customer, bank);
        System.out.println("Account 2 created with initial balance 2000. "
                + "It is in composition with Customer '" + customer.getName()
                + "' and Bank. [Bank.addAccount() was called]");

        System.out.println("Bank now has " + bank.getAccounts().size() + " accounts.");
        System.out.println("Customer now has "+customer.getAccounts().size()+" accounts");
        System.out.println("Relation: One Customer can have many Accounts (1:n).");
        System.out.println("Relation: One Bank can have many Accounts (1:n).");

        // Step 4: Transactions on Account 1
        System.out.println("\n--- Transactions on Account 1 ---");

        System.out.println("Calling deposit(500) on Account 1...");
        account1.deposit(500);
        System.out.println("Deposit transaction created (composition with Account).");

        System.out.println("Calling getBalance() on Account 1...");
        System.out.println("Balance of Account 1 = " + account1.getBalance());

        System.out.println("Calling withdraw(300) on Account 1...");
        account1.withdraw(300);
        System.out.println("Withdraw transaction created (composition with Account).");

        System.out.println("Calling getBalance() on Account 1...");
        System.out.println("Balance of Account 1 = " + account1.getBalance());

        System.out.println("Account 1 has " + account1.getTransactions().size()
                + " transactions. (1:n relation between Account and Transactions)");

        // Step 5: Transactions on Account 2 using UPI (Inheritance demo)
        System.out.println("\n--- Transactions on Account 2 (Inheritance with UPI) ---");

        System.out.println("Calling deposit(1000, \"Harsh@upi\") on Account 2...");
        account2.deposit(1000, "Harsh@upi");
        System.out.println("UPITransaction created (composition with Account + Inheritance from Transaction).");

        System.out.println("Calling getBalance() on Account 2...");
        System.out.println("Balance of Account 2 = " + account2.getBalance());

        // Final summary
        System.out.println("\n===== SUMMARY =====");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Bank accounts: " + bank.getAccounts().size());
        System.out.println("Account 1 balance: " + account1.getBalance() + " with "
                + account1.getTransactions().size() + " transactions.");
        System.out.println("Account 2 balance: " + account2.getBalance() + " with "
                + account2.getTransactions().size() + " transactions (including UPI).");
    }
}