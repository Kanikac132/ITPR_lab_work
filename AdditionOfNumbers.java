import java.util.Scanner;

public class AdditionOfNumbers {
    //method for performing addition operation
    public static void addition(int a,int b){
        System.out.println("Addition of "+a+" and "+b+" is :"+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking inputs from user
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        sc.close();  //closing scanner object
        addition(num1,num2); //calling addition method
    }
}
