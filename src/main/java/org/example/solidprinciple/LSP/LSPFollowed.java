package org.example.solidprinciple.LSP;
import java.util.ArrayList;
import java.util.List;

// 1. DepositOnlyAccount interface: only allows deposits
interface DepositOnlyAccount {
    void deposit(double amount);
}

// 2. WithdrawableAccount interface: allows deposits and withdrawals
interface WithdrawableAccount extends DepositOnlyAccount {
    void withdraw(double amount);
}

class SavingAccountB implements WithdrawableAccount {
    private double balance;

    public SavingAccountB() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in Savings Account. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Savings Account. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account!");
        }
    }
}

class CurrentAccountB implements WithdrawableAccount {
    private double balance;

    public CurrentAccountB() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in Current Account. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Current Account. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current Account!");
        }
    }
}

class FixedTermAccountB implements DepositOnlyAccount {
    private double balance;

    public FixedTermAccountB() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in Fixed Term Account. New Balance: " + balance);
    }
}

class BankClientB {
    private List<WithdrawableAccount> withdrawableAccounts;
    private List<DepositOnlyAccount> depositOnlyAccounts;

    public BankClientB(List<WithdrawableAccount> withdrawableAccounts,
                      List<DepositOnlyAccount> depositOnlyAccounts) {
        this.withdrawableAccounts = withdrawableAccounts;
        this.depositOnlyAccounts = depositOnlyAccounts;
    }

    public void processTransactions() {
        for (WithdrawableAccount acc : withdrawableAccounts) {
            acc.deposit(1000);
            acc.withdraw(500);
        }
        for (DepositOnlyAccount acc : depositOnlyAccounts) {
            acc.deposit(5000);
        }
    }
}

public class LSPFollowed {
    public static void main(String[] args) {
        List<WithdrawableAccount> withdrawableAccounts = new ArrayList<>();
        withdrawableAccounts.add(new SavingAccountB());
        withdrawableAccounts.add(new CurrentAccountB());

        List<DepositOnlyAccount> depositOnlyAccounts = new ArrayList<>();
        depositOnlyAccounts.add(new FixedTermAccountB());

        BankClientB client = new BankClientB(withdrawableAccounts, depositOnlyAccounts);
        client.processTransactions();
    }
}