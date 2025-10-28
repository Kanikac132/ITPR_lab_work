public class FirstEvenNaturalNumbers {
    public static void DisplayNaturalNumbers(int n) {

        if (n==0){ //Base Condition
            return;
        }
        else{
            DisplayNaturalNumbers(n-1);
            System.out.println(n*2); //Printing Number
        }
    }


    public static void main(String[] args) {
        //Creating Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking Input from user
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        sc.close(); // closing Scanner Object
        if (num>0){
        DisplayNaturalNumbers(num); // Calling Method
        }
        else{
            System.out.println("Natural Numbers starts from 1");
            System.out.print("Enter a Valid Number(Greater than 0)");
        }
    }
}
