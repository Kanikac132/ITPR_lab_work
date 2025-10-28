import java.util.Scanner;

public class FactorialUsingMethod {
    //method for finding factorial of a number
    public static void factorial(int n){
        int fact=1;
        if (n==1 || n==0){
            System.out.println("Factorial of "+ n + " is : "+fact);
        } else if (n<0) {
            System.out.println("Negative numbers don't have Factorial");
        } else{
        for (int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+ n+" is : "+fact);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking inputs from user
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        sc.close();  //closing scanner object
        factorial(num); //calling factorial method
    }
}
