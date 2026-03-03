import java.util.HashMap;

public class CurrencyConverter 
{

    private HashMap<String, Double> exchangeRates;

    public CurrencyConverter() 
  {
        exchangeRates = new HashMap<>();

        exchangeRates.put("USD", 1.0);
        exchangeRates.put("INR", 83.0);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("GBP", 0.78);
        exchangeRates.put("JPY", 150.0);
    }

    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) 
  {

        if (!exchangeRates.containsKey(baseCurrency) ||
            !exchangeRates.containsKey(targetCurrency)) 
        {
            return -1;
        }

        double baseRate = exchangeRates.get(baseCurrency);
        double targetRate = exchangeRates.get(targetCurrency);

        double amountInUSD = amount / baseRate;

        return amountInUSD * targetRate;
    }
}
