// Question 03

import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter length in centimeters:");

        double userLen = scanner.nextDouble(); // Get user input from centimeters

        scanner.close();  // Close the scanner

        userLen = userLen / 2.54; // Convert into inches

        int userFeet = (int) userLen / 12; // How many feet

        userLen = userLen % 12; // How many inches left

        System.out.println(userFeet + " feet, " + userLen + " inches"); // Output converted length
    }
}
