package anudip;

import java.util.Scanner;

public class FactorialUsingRecursion {
    // Method for finding Factorial
    public static long FactorialRecursion(int n){
        if (n==0 || n==1){ // Base Condition
            return 1;
        }
        else{
            return (n*FactorialRecursion(n-1));
        }
    }
    public static void main(String[] args) {
        //Creating Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        sc.close(); //closing scanner object

        //checking if the number is negative or not
        if (num>=0){
        System.out.print("Factorial of "+num+ " is :"+FactorialRecursion(num));
        }
        else{
            System.out.println("Negative numbers don't have Factorial...");
        }
    }
}
