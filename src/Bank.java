import java.util.ArrayList;
import java.util.List;

public class Bank<T extends Account> {
    private List<T> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // Create a method addAccount with a generic parameter called account,
    // to add an account to the bank's list.

    public void addAccount(T account) {
        accounts.add(account);
    }

    // Provide a function for getAccounts to get the private account variable.

    public List<T> getAccounts() {
        return accounts;
    }

    // Get total balance across all accounts
    public double getTotalBalance(List<T> accounts) {
        double total = 0;
        for (T account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    // Perform a transaction on a specific account
    public void performTransaction(T account, double amount) {
        try {
            if (amount > 0) {
                account.deposit(amount);
                System.out.println("Deposited $" + amount + " into account " + account.getAccountNumber());
            } else {
                account.withdraw(-amount);
                System.out.println("Withdrew $" + (-amount) + " from account " + account.getAccountNumber());
            }
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }

    // Overload the performTransaction method to allow for transactions with
    // additional
    // parameter fees to handle fees when a withdrawal is happening.

    public void performTransaction(T account, double amount, double fees) {
        try {
            if (amount > 0) {
                account.deposit(amount);
                System.out.println("Deposited $" + amount + " into account " + account.getAccountNumber());
            } else {
                account.withdraw(-amount + fees);
                System.out.println("Withdrew $" + (-amount) + " from account " + account.getAccountNumber());
            }
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }

    // List all accounts in the bank
    public void listAccounts(List<T> accounts) {
        System.out.println("Accounts in the Bank:");
        for (T account : accounts) {
            System.out.println(account);
        }
    }

    // Implement a method getTotalBalance() to calculate and return the total
    // balance across all accounts.
    // Use a generic wildcard to represent the account types totaling from.

    public double calculateTotalBalance() {
        double total = 0;
        for (T account : accounts) {
            total += account.balance;
        }

        return total;
    }
}
