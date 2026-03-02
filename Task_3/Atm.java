import java.util.Scanner;

public class ATM 
{

    private BankAccount account;

    public ATM(BankAccount account) 
    {
        this.account = account;
    }

    public void start() 
  {
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } 
          while (choice != 4);

        sc.close();
    }
}
