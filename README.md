# SELabBankingSystem

A simple **Java banking system project** demonstrating **Object-Oriented Programming (OOP) concepts** including *encapsulation, association, composition, aggregation, and inheritance*. This project simulates core banking operations with customers, accounts, transactions, and UPI-based payments.

---

### Features
- Create a **Bank** and associate multiple accounts.
- Create **Customers** who can own multiple accounts.
- Perform **Deposits** and **Withdrawals** (with or without UPI).
- Maintain a record of **Transactions** for each account.
- Demonstrates **Inheritance** (UPI extends Transaction).
- Demonstrates relationships:
    - One Bank ↔ Many Accounts (1:n)
    - One Customer ↔ Many Accounts (1:n)
    - One Account ↔ Many Transactions (1:n)

---

### Project Structure

```
SELabBankingSystem/
│── SELabBankingSystem.iml
│── src/
│   └── com/
│       └── Banking/
│           ├── Main/
│           │   └── Main.java
│           └── Models/
│               ├── Account.java
│               ├── Bank.java
│               ├── Customer.java
│               ├── Transaction.java
│               └── UPI.java
│
└── out/ (compiled .class files)
```

---

### Class Overview

#### Bank
- Maintains a list of accounts.
- Functions: `addAccount()`, `removeAccount()`.

#### Customer
- Holds customer details (`name`, `customerID`).
- Manages one-to-many relationship with **Accounts**.

#### Account
- Fields: `balance`, `transactions`, `customer`, `bank`.
- Functions:
    - `deposit(amount)` (normal)
    - `deposit(amount, upiId)` (via UPI)
    - `withdraw(amount)` (normal)
    - `withdraw(amount, upiId)` (via UPI).

#### Transaction
- Stores details of each transaction (`amount`, `type`, `date`, `account`).

#### UPI (extends Transaction)
- Inherits transaction fields.
- Adds UPI-specific field: `upiId`.

---
## How to Run

### Step 1: Navigate to Project Directory
```bash
cd path/to/SELabBankingSystem
```

### Step 2: Compile the Project
```bash
javac -d out $(find src -name "*.java")
```

### Step 3: Run the Application
```bash
java -cp out com.Banking.Main.Main
```