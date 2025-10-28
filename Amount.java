import java.util.Scanner;

public classimport java.util.Scanner;

public class Amount {

   //method for  Calculating Amount and Simple interest
    public static void simpleInterest(float p,float r, int t){
        // displaying data
        System.out.println("Principal: "+p+ " Rs");
        System.out.println("Rate: "+r+"%");
        System.out.println("Time: "+t+"Years");

        System.out.println("------------------------");
        //calculating Simple Interest
        float si=(p*r*t)/100;
        System.out.println("Simple Interest : "+si);
        //calculating Amount
        float amt=p+si;
        System.out.println("Amount is : "+amt +"Rs");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking inputs from the user
        System.out.println("Enter the Principal (in Rupees):");
        float principal=sc.nextFloat();
        System.out.println("Enter the Rate (in %):");
        float rate=sc.nextFloat();
        System.out.println("Enter the Time (in Years):");
        int time=sc.nextInt();
        sc.close(); //closing scanner object
        //calling simpleInterest method
        simpleInterest(principal,rate,time);
    }
}
