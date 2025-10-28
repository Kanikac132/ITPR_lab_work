import java.util.Scanner; //importing Scanner class for user input

/----- Defining a class for Even Number Finder ----/
class EvenNumberFinder
{
	int[] numbers; // declaration of array to store numbers
	
	//Constructor
	EvenNumberFinder()
	{
		//initializing number of elements to be stored
		numbers = new int[20];
		
		//Creating object of Scanner class to initialize elements into the array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any 20 numbers: ");
		for(int i = 0; i < 20; i++)
		{
			numbers[i] = sc.nextInt(); //Reading input and storing number at given index in array
		}
		System.out.println("--------------------------------------------");
		sc.close(); //closing scanner object to avoid resource leak
	}
	
	//method to display even numbers from the array
	private void displayEvenNumbers()
	{
		System.out.println("Even numbers are: ");
		for(int i = 0; i < 20; i++)
		{
			if(numbers[i] % 2 == 0) // checking even number condition
			{
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println("\n--------------------------------------------");
	}
	
	//method to display all data
	public void displayData()
	{
		//Displaying all numbers entered by user
		System.out.println("Numbers entered are: ");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n--------------------------------------------");
		
		//Calling method to display even numbers
		displayEvenNumbers();
	}
}

/------------------------/
public class ArrayExamples {

	public static void main(String[] args) {
		// Creating object
		EvenNumberFinder even = new EvenNumberFinder();
		even.displayData();
	}
}
