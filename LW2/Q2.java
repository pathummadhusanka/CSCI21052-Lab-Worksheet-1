import java.util.Scanner;

public class Q2 {

  // Method for return the number of digits
  public static int digitCount(int num) {
    return Integer.toString(num).length();
  } 
  public static void main(String[] args) {
    
    Scanner myScanner = new Scanner(System.in);

    while(true) {

      // Read integer from user
      System.out.print("Enter number: ");
      int num = myScanner.nextInt();

      // Jump out from loop id number is negative
      if(num < 0) {
        System.out.println("Finished!");
        break;
      }else {
        System.out.println("Digit count: " + digitCount(num));
        System.out.println();
      }
      
      myScanner.close();
    }
  }
}
