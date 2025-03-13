 import java.util.Scanner;
 
	public class lottoNumbers{
		public static void main(String[] args){
			int[] tests = new int[10];
			//int test;
			int count;

			try (Scanner scan = new Scanner(System.in)) {
				do {
					System.out.print("How many numbers do you want to enter(1 - 10)? ");
					count = scan.nextInt();

				// Ensure the count does not exceed 10 numbers (size of array)
				if (count < 1 || count > 10) {
					System.out.println("You can only enter a number up to 10 numbers.");
				}
			} while(count < 1 || count > 10);
				
				for (int i = 0 ; i < count; i++){
					// Option to inform the user that the number range is between [1-10]
					 System.out.print("Please type a number: ");
					// test  = scan.nextInt();
					 tests[i] = scan.nextInt();
				}

				// Display the stored numbers
				System.out.println("You entered: ");
				for (int i = 0; i < count; i++) {
						System.out.print(tests[i] + " ");
				}
			}
		}
 }
