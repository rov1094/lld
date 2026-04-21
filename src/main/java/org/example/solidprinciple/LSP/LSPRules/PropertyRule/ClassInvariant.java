package org.example.solidprinciple.LSP.LSPRules.PropertyRule;


class Account{
    public double balance;

    Account(double balance){
        if(balance<0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    /**
     * Withdraw balance from account and return the remaining balance
     * @param amount
     * @return
     */
    public double withdraw(double amount){
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        return balance;
    }
}

class CheatAccount extends Account{

    CheatAccount(double balance){
        super(balance);
    }

    /**
     * Withdraw balance from account and return the remaining balance
     * @param amount
     * @return
     */
    public double withdraw(double amount){
        //Cheat by allowing withdrawal even if balance is insufficient, and
        // this break LSP as it violates the class invariant of Account class which states that balance cannot be negative
        balance -= amount;
        return balance;
    }
}

public class ClassInvariant {

    public static void main(String[] args) {
        Account account = new Account(10);
        Account account2 = new CheatAccount(10);
        System.out.println(account.withdraw(10));
        System.out.println(account2.withdraw(20));
    }
}
