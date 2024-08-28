import java.util.Scanner;

public class Task3 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the amount
        System.out.print("Enter the amount in source currency: ");
        double amount = scanner.nextDouble();

        // Prompt user for the exchange rate
        System.out.print("Enter the exchange rate (source to target currency): ");
        double exchangeRate = scanner.nextDouble();

        // Perform the conversion
        double convertedAmount = convertCurrency(amount, exchangeRate);

        // Display the result
        System.out.printf("%.2f in the source currency is equivalent to %.2f in the target currency.%n", amount, convertedAmount);

        // Close the scanner
        scanner.close();
    }

    /**
     * Converts an amount from one currency to another using a given exchange rate.
     *
     * @param amount        the amount of money to convert
     * @param exchangeRate  the exchange rate from the source currency to the target currency
     * @return              the converted amount in the target currency
     */
    public static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}

