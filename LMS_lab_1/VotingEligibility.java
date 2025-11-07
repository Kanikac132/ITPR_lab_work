// Program to check if a person is eligible for voting or not
import java.util.Scanner;

// Custom Exception class for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age of person: ");
            int age = sc.nextInt();

            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative!");
            } else if (age >= 18) {
                System.out.println("Person is eligible for voting.");
            } else {
                System.out.println("Person is NOT eligible for voting.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
