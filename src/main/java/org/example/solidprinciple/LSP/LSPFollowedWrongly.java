package org.example.solidprinciple.LSP;

import java.util.ArrayList;
import java.util.List;

// AccountA interface
interface AccountA {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingAccountA implements AccountA {
    private double balance;

    public SavingAccountA() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in Savings AccountA. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Savings AccountA. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings AccountA!");
        }
    }
}

class CurrentAccountA implements AccountA {
    private double balance;

    public CurrentAccountA() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in Current AccountA. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Current AccountA. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current AccountA!");
        }
    }
}

class FixedTermAccountA implements AccountA {
    private double balance;

    public FixedTermAccountA() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in Fixed Term AccountA. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawal not allowed in Fixed Term AccountA!");
    }
}

class BankClientA {
    private List<AccountA> AccountAs;

    public BankClientA(List<AccountA> AccountAs) {
        this.AccountAs = AccountAs;
    }

    public void processTransactions() {
        for (AccountA acc : AccountAs) {
            acc.deposit(1000);

            // Checking AccountA type explicitly
            if (acc instanceof FixedTermAccountA) {
                System.out.println("Skipping withdrawal for Fixed Term AccountA.");
            } else {
                try {
                    acc.withdraw(500);
                } catch (UnsupportedOperationException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
        }
    }
}

public class LSPFollowedWrongly {
    public static void main(String[] args) {
        List<AccountA> AccountAs = new ArrayList<>();
        AccountAs.add(new SavingAccountA());
        AccountAs.add(new CurrentAccountA());
        AccountAs.add(new FixedTermAccountA());

        BankClientA client = new BankClientA(AccountAs);
        client.processTransactions();
    }
}