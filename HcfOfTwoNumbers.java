import java.util.Scanner;

public class HcfOfTwoNumbers {
  //Method for finding HCF
    static int hcf(int a, int b) {
        if (b == 0)
            return a;   // Base case
        else
            return hcf(b, a % b);  // Recursive case
    }

    public static void main(String[] args) {
      //Creating Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
      //taking input
       System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = hcf(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + result);//print result
    }
}
