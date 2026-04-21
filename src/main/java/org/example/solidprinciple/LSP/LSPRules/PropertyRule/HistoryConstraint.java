package org.example.solidprinciple.LSP.LSPRules.PropertyRule;

class BankAccount{
    public double balance;

    public double withdraw(double amount){
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        return balance;
    }
}

class FixedBankAccount extends BankAccount{
    @Override
    public double withdraw(double amount) {// Here it breaks History constraint and in LSP we made a different parent class for fixed bank account and we are not allowing withdrawal from it, so it is not substitutable for BankAccount class
        throw new UnsupportedOperationException("Withdrawals are not allowed from a fixed bank account");
    }
}

public class HistoryConstraint {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balance = 100;
        System.out.println(account.withdraw(50)); // This works fine

        BankAccount fixedAccount = new FixedBankAccount();
        fixedAccount.balance = 100;
        System.out.println(fixedAccount.withdraw(50)); // This will throw UnsupportedOperationException
    }
}
