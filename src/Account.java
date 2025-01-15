// Account.java
public abstract class Account {
    private int accountNumber;
    private String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // Implement a deposit

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public void withdraw(double amount, double fee) {
        double total = amount + fee;
        try {
            balance -= total;
        } catch (InsufficientFundsException e) {

            e.printStackTrace();
        }
        }
    

    // Overload withdraw method to accept an additional fee parameter (withdraw(double amount, double fee)):
    // Withdraw the given amount plus the fee. Use assertions and handle
    // exceptions properly.

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Override the toString() method to provide a string representation of the account.

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Account Number: ");
        str.append(accountNumber);
        str.append("\n Account Holder: ");
        str.append(accountHolder);
        str.append("\n Balance: ");
        str.append(balance);

        return str.toString();
    }
}