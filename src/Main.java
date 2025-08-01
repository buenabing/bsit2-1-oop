import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        int totalNumber = 0; // Initialize total

        // Loop to get 5 numbers from the user
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt(); // Read user input
            totalNumber += number; // Add number to total
        }

        // Display the total
        System.out.println("Total Number: " + totalNumber);

        scanner.close(); // Close the scanner
    }
}