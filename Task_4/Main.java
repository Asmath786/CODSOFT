import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
  {

        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("=================================");
        System.out.println("        CURRENCY CONVERTER       ");
        System.out.println("=================================");

        System.out.println("Available Currencies:");
        System.out.println("USD - US Dollar");
        System.out.println("INR - Indian Rupee");
        System.out.println("EUR - Euro");
        System.out.println("GBP - British Pound");
        System.out.println("JPY - Japanese Yen");

        System.out.print("\nEnter Base Currency: ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter Target Currency: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter Amount to Convert: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) 
        {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        double result = converter.convertCurrency(baseCurrency, targetCurrency, amount);

        if (result == -1) 
        {
            System.out.println("Invalid Currency Selected!");
        } 
        else 
        {
            System.out.println("\n---------------------------------");
            System.out.println("Converted Amount: " + result + " " + targetCurrency);
            System.out.println("---------------------------------");
        }

        scanner.close();
    }
}
