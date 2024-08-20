// Question 02

import java.util.Scanner;

public class NameFormatter {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter your name: (first middle last)");

        String userFullName = scanner.nextLine(); // Get user's full name

        scanner.close();  // Close the scanner

        String[] nameParts = userFullName.split("\\s"); // Split full name

        System.out.println(nameParts[2] + ", " + nameParts[0] + " " + nameParts[1].charAt(0) + "."); // Output formatted name

    }
}
