import java.util.Scanner;

public class WristbandChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is 21 or older
        if (age >= 21) {
            System.out.println("You get a paper wristband.");
        }

        // Close the scanner
        scanner.close();
    }
}