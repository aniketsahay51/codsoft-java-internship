import java.util.Scanner;

public class curr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double convertedAmount = 0;

        switch (choice) {
            case 1:
                convertedAmount = amount / 86.0; // 1 USD ≈ 86 INR
                System.out.println("Converted Amount: $" + convertedAmount);
                break;

            case 2:
                convertedAmount = amount * 86.0;
                System.out.println("Converted Amount: ₹" + convertedAmount);
                break;

            case 3:
                convertedAmount = amount / 98.0; // 1 EUR ≈ 98 INR
                System.out.println("Converted Amount: €" + convertedAmount);
                break;

            case 4:
                convertedAmount = amount * 98.0;
                System.out.println("Converted Amount: ₹" + convertedAmount);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}