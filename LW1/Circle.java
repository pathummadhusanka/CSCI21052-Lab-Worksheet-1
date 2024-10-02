import java.util.Scanner;

public class Circle {
    double radius;

    // Constructor for set radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method for area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method for circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Get radius of circles
        System.out.print("Inner radius (ri): ");
        double ri = scanner.nextDouble();
        System.out.print("Outer radius (ro): ");
        double ro = scanner.nextDouble();

        scanner.close(); // Close the scanner

        Circle innerCir = new Circle(ri);
        Circle outerCir = new Circle(ro);

        // Areas
        double innerAr = innerCir.computeArea();
        double outerAr = outerCir.computeArea();

        double shadedAr = outerAr - innerAr; // Calculate shaded area

        System.out.printf("Shaded area : %.2f\n", shadedAr); // Output shaded area
    }
}
