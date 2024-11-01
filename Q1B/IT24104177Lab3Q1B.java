import java.util.Scanner;

public class IT24104177Lab3Q1B{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt the user for the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKgs = scanner.nextDouble();

        // Calculate the total cost
        double totalCost = pricePerKg * numberOfKgs;

        // Apply the 10% discount
        double discount = totalCost * 0.10;
        double finalAmount = totalCost - discount;

        // Display the total cost to the user
        System.out.println("The total amount you have to pay after discount is: " + finalAmount);
    }
}
