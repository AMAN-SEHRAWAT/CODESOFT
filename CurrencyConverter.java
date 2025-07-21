import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] currencies = {"INR", "USD", "EUR"};
        double[][] rates = {
            {1.0, 0.012, 0.011}, // from INR
            {83.0, 1.0, 0.93},   // from USD
            {89.0, 1.07, 1.0}    // from EUR
        };

        System.out.println("Available currencies: INR, USD, EUR");

        System.out.print("Enter base currency: ");
        String base = sc.next().toUpperCase();
        System.out.print("Enter target currency: ");
        String target = sc.next().toUpperCase();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        int baseIndex = -1, targetIndex = -1;
        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i].equals(base)) baseIndex = i;
            if (currencies[i].equals(target)) targetIndex = i;
        }

        if (baseIndex == -1 || targetIndex == -1) {
            System.out.println(" Invalid currency selected.");
        } else {
            double converted = amount * rates[baseIndex][targetIndex];
            System.out.println(" Converted Amount: " + converted + " " + target);
        }

        sc.close();
    }
}
