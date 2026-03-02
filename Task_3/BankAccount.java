public class BankAccount 
{

    private double balance;

    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
    }

    public void deposit(double amount) 
  {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposit successful!");
        } 
        else 
        {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) 
  {
        if (amount <= balance && amount > 0) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
        else 
        {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
