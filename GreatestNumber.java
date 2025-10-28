import java.util.Scanner;

public class GreatestNumber {
    //method for finding greatest of two numbers
    public static void greatestOfTwo(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        } else if (a<b) {
            System.out.println(b +" is greater than "+a);
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking inputs from user
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        sc.close();  //closing scanner object
        greatestOfTwo(num1,num2); //calling greatestOfTwo method
    }
}
