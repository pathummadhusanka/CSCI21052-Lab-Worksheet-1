import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    // Get the row count
    System.err.print("How many rows: ");
    int rowCount = myScanner.nextInt();
    myScanner.close();

    for(int row = 1; row <= rowCount; row++) {

      for(int space = rowCount - row; space >= 0; space--) {
        System.err.print(" ");
      }

      for(int ast = 0; ast < row; ast++) {
        System.err.print("*");
        System.err.print(" ");
      }

      System.err.println();
    }
  }
}
