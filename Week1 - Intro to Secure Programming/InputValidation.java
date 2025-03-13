import java.util.Scanner;

public class InputValidation {

   public static void main(String args[]) 
   {            
		Scanner scanner = new Scanner(System.in);
		String username = "";
		String email = "";
		String password = "";
		//int age = 0;
		//String emailRegex = "^[a-z][A-Z](.+)@(.+)$";

		boolean validInput = false;

		
		while(!validInput)
		{
				System.out.println("Please enter your username: ");
				username = scanner.nextLine();

				// Check if username is not empty
				if (username != null && !username.trim().isEmpty() && username.matches("^[a-zA-Z]{5,15}\\.[a-zA-Z]{5,15}$")) {
					validInput = true;
				} 
				else{
					System.out.println("Invalid username. Please enter username in the format 'firstname.surname'.");
				}
		}

		validInput = false;

		while(!validInput)
		{
			System.out.print("Please enter your email: ");
			email = scanner.nextLine();

				if(email.matches("^[a-zA-Z]+\\.[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}$")){
					validInput = true;
				}
				else{
						System.out.println("Invalid email. Please enter a valid email in the format 'email@example.com'.");
				}
		}
		
		validInput = false;

		while(!validInput)
		{
			System.out.print("Please enter your password: ");
			password = scanner.nextLine();
			
				if(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!*]).{8,}$")){
					validInput = true;
				}
				else{
					System.out.println("Invalid password. Your password must:");
					System.out.println("- Be at least 8 characters long");
					System.out.println("- Contain at least one lowercase letter");
					System.out.println("- Contain at least one uppercase letter");
					System.out.println("- Contain at least one number");
					System.out.println("- Contain at least one special character (@#$%^&+=!)");				}
		}
			System.out.println("\nThank You!");
			System.out.println("Username: " + username);
			System.out.println("Email: " + email);
			System.out.println("Password: " + "Hidden for Security");
			scanner.close();
	}
}
