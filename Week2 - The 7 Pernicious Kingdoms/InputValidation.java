import java.util.Scanner;
public class InputValidation {
	
	public static void main(String[] args) {

		try (Scanner console = new Scanner(System.in)) // try-with-resources to automatically close the Scanner when done
		{
			System.out.println("Enter test score (0 - 100): ");

			int grade = getValidNum(console, 0, 100); // Call the getValidNum method to get a valid input between 0 and 100

			// Determine and print the grade based on the score
			if (grade >= 90)
				System.out.println("Your grade is A"); 
			else if (grade >= 80)
				System.out.println("Your grade is B");
			else if (grade >= 70)
				System.out.println("Your grade is C");
			else if (grade >= 60)
				System.out.println("Your grade is D");
			else
				System.out.println("Your grade is F");
		}
	}

	// Method to get a valid integer input within a specified range
	static int getValidNum(Scanner console, int min, int max)
	{
			int value = 0; // Stores the user's input
			boolean validInput = false; // Flag to check if the input is valid

			while (!validInput) // loop while it is still an invalid input
			{
				if (console.hasNextInt()) // check if the input is an integer
				{	
					value = console.nextInt(); // read the integer input
					
					// the value is greater than or equal to 0
					// and it's less than or equal to 100
					// therefore only accept values between 0 and 100 (inclusive)
					if(value >= min && value <= max) // Check if the input is within the valid range
					{
						validInput = true; // input is valid, exit loop
					}
					else
					{
						System.out.println("Invalid input! Please enter a number between "+ min + " and " + max + ": ");
					}
			  }
				else{
							System.out.println("Invalid entry! Please enter a valid integer: ");
							console.next(); // consume invalid input to avoid infinite loop
						}	
		  }
			return value; // Return the valid input
	}
}
