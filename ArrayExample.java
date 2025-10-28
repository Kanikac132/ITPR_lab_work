package project1;
import java.util.Scanner; //importing Scanner class for user input
/*----- Defining a class for Addition ----*/
class SumCalculator
{
	int[] numbers;// declaration of array to store numbers
	//Constructor
	public SumCalculator()
	{
		//initializing number of elements to be stored
		numbers = new int[10];
		
		//Creating object of Scanner class to initialize elements into the array
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any 10 number : ");
		for(int index = 0;index < numbers.length;index++)
		{
			numbers[index] = sc.nextInt(); //Reading input and storing number at given index in array
		}
		System.out.println("--------------------------------------------");
		sc.close();//closing scanner object to avoid resource leak
	}
	
	//method to calculate sum of elements of the array
	private void calculateSum()
	{
		int sum = 0;
		for(int index = 0 ; index < numbers.length ; index++)
		{
			sum = sum + numbers[index]; // calculating sum
		}
		System.out.println(" Sum = "+sum);
	}
	
	//method to display data
	public void displayData()
	{
		//Displaying numbers to the user
		System.out.println("Numbers are : ");
		for(int index = 0 ; index < numbers.length ; index++)
		{
			System.out.print(numbers[index] + " , ");
		}
		System.out.println("\n ----------------------------------");
		//method for calculating sum 
		calculateSum();
	}
}
/*------------------------*/
public class ArrayExample {

	public static void main(String[] args) {
		// Creating object
		SumCalculator sum = new SumCalculator();
		sum.displayData();

	}

}
