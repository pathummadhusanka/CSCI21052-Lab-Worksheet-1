// Lab worksheet 01 - Question 01
public class Q1 {
  public static void main(String[] args) {

    for(int i = 10; i < 50; i++) {

      // Go to a new line
      if(i % 10 == 0) {
        System.out.println();
      }

      // Print numbers
      System.out.print(i + " ");
    }
    
    // Print final new line for readability in terminal
    System.out.println();
  }
}
