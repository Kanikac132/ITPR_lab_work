// Java program to create an array of 10 numbers and arrange them in ascending order
import java.util.Scanner;  // Importing Scanner class for user input

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for input

        int[] arr = new int[10];  // Declare an array of size 10

        // Taking 10 numbers as input from user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array in ascending order using simple bubble sort
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] > arr[j]) {  // Swap if element is greater than next one
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Numbers in ascending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();  // Closing the Scanner object
    }
}
