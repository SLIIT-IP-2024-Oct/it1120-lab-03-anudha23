import java.util.Scanner;

public class IT24104177Lab3Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Ensure the input is a five-digit number
        if (number >= 10000 && number <= 99999) {
            // Separate and print digits
            String numStr = String.valueOf(number);
            for (int i = 0; i < numStr.length(); i++) {
                System.out.print(numStr.charAt(i) + " ");
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }
        
        scanner.close();
    }
}
