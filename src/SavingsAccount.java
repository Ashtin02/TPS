// SavingsAccount.java
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder);
        this.interestRate = interestRate;
    }

    /*
    Overload the withdraw method to check if the withdrawal exceeds the overdraft limit.
    Use assertions.
    Overload the deposit method to check if the deposit is greater than 0.
    Use assertions.
     */

    public void withdraw(double amount) {
        double total = amount;
        assert total < balance;

        balance -= total;
    }
        
    public void deposit(double amount) {
        assert amount > 0;
        balance += amount;
    }

    public double getInterestRate() {
        return interestRate;
    }
}