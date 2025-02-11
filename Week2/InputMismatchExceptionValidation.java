// o What variable should be validated and what should you be checking for?
// The user has been asked to enter in 10 integers
// what if the user does not enter an integer (validate the age variable to ensure input is a valid integer)
import java.util.Scanner;

public class InputMismatchExceptionValidation
{
  public static void main(String[] args)
  {
    try (Scanner console = new Scanner(System.in)) {
        int age;
        int total = 0;

        System.out.println("Please enter 10 ages: ");
        for (int i = 0; i < 10; i++){
            while(true)
            {   
                if (console.hasNextInt()) // check if the input is an integer
                {	
                    age = console.nextInt(); // valid age input, read the age
                    
                    // Check if the age is reasonable
                    if (age > 0 && age <= 120) 
                    {
                        total += age; // Add the valid age to the total
                        break; // Exit the loop when valid age  entered
                    } 
                    else {
                        System.out.println("Invalid age! Please enter a valid age between 1 and 120: ");
                    }              
                }
                else{
                        // while the input is still not an integer, prompt the user again
                        System.out.println("Invalid input! Please enter a valid integer for age: ");
                        console.next(); // Consume the invalid input
                    }
            }
        }
        System.out.println("Average age is: " + (float)total/10);
    }
  }
}
