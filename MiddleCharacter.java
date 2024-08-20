// Question 01

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter an odd-length word:");

        String userWord = scanner.nextLine(); // Get user input

        scanner.close();  // Close the scanner

        int userWordLen = userWord.length(); // Word length

        // If word is non-empty
        if(userWordLen != 0) {

            // If word is odd-length
            if(userWordLen % 2 != 0) {
                System.out.println("Middle character is: " + userWord.charAt(userWordLen / 2));
                
            // If word is even-length
            }else {
                System.out.println("You have entered an even-length word!");
            }

        // If word is empty
        }else {
            System.out.println("Please enter a word!");
        }
    }
}