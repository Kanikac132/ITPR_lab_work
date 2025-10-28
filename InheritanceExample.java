package project1;
import java.util.Scanner; //importing Scanner class for user input
/*--- Defining a base class ---*/
class Number
{
	//member variable
	protected int num1,num2;

	
	// method for input of Number
	public void inputNumbers()
	{
		//create an object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		num1 = sc.nextInt();//reading user input
		
		System.out.print("Enter second number : ");
		num2 = sc.nextInt();//reading user input
		System.out.println("----------------------------------------------");
	}
	
	/*---- method for displaying numbers ----*/
	public void displayNumbers()
	{
		System.out.println("First No. : "+num1);
		System.out.println("Second No. : "+num2);
	}
}
/*---------------------------------------------------------------------------*/
/*----- Defining derived class -----*/
class NumericCalculation extends Number
{
	//method for addition of two numbers
	private void calculateAddition()
	{
		//calling method of base class for input of two numbers
		super.inputNumbers();
		//to add two numbers
		int sum = super.num1 + super.num2;
		//calling method of base class to display numbers
		super.displayNumbers();
		System.out.println("Sum : "+sum);
		System.out.println("---------------------------------------------");
	}
	
	//method for finding difference of two numbers
	private void calculateDifference()
	{
		//calling method of base class for input of two numbers
		super.inputNumbers();
		//finding difference
		int sub = super.num1 - super.num2;
		//displaying result of difference
		System.out.println("Difference between "+super.num1+" and "+super.num2+" is : "+sub);
		System.out.println("---------------------------------------------------");
	}
	
	//method for product of two numbers
	private void calculateProduct()
	{
			//calling method of base class for input of two numbers
			super.inputNumbers();
			//to multiply two numbers
			long product = super.num1 * super.num2;
			//calling method of base class to display numbers
			super.displayNumbers();
			System.out.println("Product : "+product);
			System.out.println("---------------------------------------------");
	}
	// method for providing menu to the user for selecting any of the above operation
	public void performNumbericOperation()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("---- Numeric Calculation ----");
			System.out.println(" 1. Addition \n 2. Difference \n 3. Product");
			System.out.println("--------------------------------------------");
			System.out.print("Select any one operation : ");
			int operation = sc.nextInt();
			switch(operation)
			{
			case 1: calculateAddition();
			break;
			case 2: calculateDifference();
			break;
			case 3: calculateProduct();
			break;
			default: System.out.println("Invalid operation");
			}
			System.out.println("-----------------------------------------------------");
			System.out.print("Press 0 to exit and any other number for continue : ");
			choice = sc.nextInt();
			System.out.println("---------------------------------------------");
		}while(choice!=0);		
	}
}
/*---------------------------------------------------------------------------*/
public class InheritanceExample {

	public static void main(String[] args) {
		// Creating object of Derived class
		NumericCalculation nc=new NumericCalculation();
		// performing numeric operation
		nc.performNumbericOperation();
	}

}
