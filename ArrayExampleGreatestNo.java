import java.util.Scanner; //importing Scanner class for user input

/----- Defining a class for Greatest Number Finder ----/
class GreatestNumberFinder
{
	int[] numbers; // declaration of array to store numbers
	
	//Constructor
	public GreatestNumberFinder()
	{
		//initializing number of elements to be stored
		numbers = new int[15];
		
		//Creating object of Scanner class to initialize elements into the array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any 15 numbers: ");
		for(int i = 0; i < 15; i++)
		{
			numbers[i] = sc.nextInt(); //Reading input and storing number at given index in array
		}
		System.out.println("--------------------------------------------");
		sc.close(); //closing scanner object to avoid resource leak
	}
	
	//method to find greatest number
	private int findGreatest()
	{
		int greatest = numbers[0]; //assuming first element as greatest initially
		for(int i = 1; i < 15; i++)
		{
			if(numbers[i] > greatest)
			{
				greatest = numbers[i]; //updating greatest value
			}
		}
		return greatest;
	}
	
	//method to display all data
	public void displayData()
	{
		//Displaying all numbers entered by user
		System.out.println("Numbers entered are: ");
		for(int i = 0; i < 15; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n--------------------------------------------");
		
		//Displaying greatest number
		System.out.println("Greatest number is: " + findGreatest());
		System.out.println("--------------------------------------------");
	}
}

/------------------------/
public class ArrayExampleGreatestNo {

	public static void main(String[] args) {
		// Creating object
		GreatestNumberFinder greatest = new GreatestNumberFinder();
		greatest.displayData();
	}
}
