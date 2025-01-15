// Transaction.java

/*
Define a class named Transaction that takes a generic type (representing an account)
and includes instance variables for the account and the transaction amount.
Ensure account is generic.

Create a constructor for Transaction that accepts the account and amount as parameters.

Implement a method named execute() that performs the transaction.
If the amount is positive, it should deposit the amount into the account.
If the amount is negative, it should withdraw the amount. Handle exceptions properly.

Add an overloaded execute() method that takes an additional fee parameter for withdrawal
transactions.
 */

import java.io.EOFException;

public class Transaction<T extends Account> {
    T account;
    double transactionAmount;

    Transaction(T account, double transactionAmount) {
        this.account = account;
        this.transactionAmount = transactionAmount;
    }


    public void execute(){
        if (transactionAmount > 0) {
            account.balance += transactionAmount; 
        } else {
            if (Math.abs(transactionAmount) > account.balance) {
                
            }
        }
    }

 }