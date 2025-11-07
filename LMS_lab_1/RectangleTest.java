// Program to calculate Area and Perimeter of Rectangle using Custom Exception
import java.util.Scanner;

// Custom Exception class for invalid dimensions
class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}

class Rectangle {
    private double length;
    private double breadth;

    // Constructor to initialize rectangle dimensions
    public Rectangle(double length, double breadth) throws InvalidDimensionException {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidDimensionException("Length and breadth must be positive numbers!");
        }
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter length of rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter breadth of rectangle: ");
            double breadth = sc.nextDouble();

            Rectangle rect = new Rectangle(length, breadth);

            System.out.println("Area of Rectangle = " + rect.calculateArea());
            System.out.println("Perimeter of Rectangle = " + rect.calculatePerimeter());

        } catch (InvalidDimensionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
