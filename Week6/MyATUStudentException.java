import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class MyATUStudentException extends Exception {


//Part 5  - Come back here and Create 2 constructors, one that is empty and one that will parse a message


//Part 1  - Put a try/catch block around the code to handle the InputMismatchException exception.
//          The program should end gracefull with an error message instead of thowing an exception.
    public static void part1(){
        Scanner scan = new Scanner(System.in);
          
        int num = 0;     
        

            do {
                try{
                    System.out.println("Enter a number between 1 and 10");    
                    num = scan.nextInt();
                }

         
                catch(InputMismatchException e){ 
                    System.out.println("Divide by zero"); 
                    break;

            } 

    
                // if (num < 1 || num > 10){
                    System.out.println("Illegal value, " +num+ " entered. Please try again.");
              //  }
                      
            }while (num < 1 || num > 10);                       
                System.out.println("Value correctly entered! Thank you.");      

    }                 

//Part 2  - Handle the Arithmetic Exception.
    public static void part2(){
        try {
            System.out.println(3/0);
        }
     
 catch(ArithmeticException e){ 
               System.out.println("Divide by zero"); 
          } 
        //   y = a / (b+c); //(  10/(5+5)  )
        //   System.out.println("y = " + y); 
      } 



//Part 3  - Catch multiple Exceptions.  
    public static void part3(){
        // Enter the following values and see what exception is caught:     0, character, <no value>

            String value = JOptionPane.showInputDialog(null, "Enter value:");

            int divisor = Integer.parseInt(value);

            System.out.println(3/divisor);

    }

//Part 4 - Using the built in methods of the Exceptions.  
    public static void part4(){
        try {
            throw new Exception("*****My Homemade Exception Message That I made up!"); //change the text to create your own message
        } catch (Exception e) {
            System.err.println("EXCEPTION CAUGHT");
            // add more print statements..
        }   
    }


//Part 5 - Create your own Exception  
//          Go to the top and create the constructors for this class

    public static void fakeMethod() throws MyATUStudentException {
        //Can you complete this using the empty constructor?

    }
            
    public static void anotherFakeMethod() throws MyATUStudentException {
        //Can you complete this using the constructor with a message?

    }
        
    public static void part5(){
        // uncomment these lines and add a try catch to each one
    
        //fakeMethod();

        //anotherFakeMethod();
   
    }


//Part 6  - Finallly
    public static void part6(){
        int count = 0;
        while (true) {
            try {
                // Post-increment is zero first time:
                if (count++ == 0) 
                    throw new MyATUStudentException();
                    System.out.println("No exception thrown ");
            } catch (MyATUStudentException e) {
                System.out.println("MyATUException : Exception has happened...");
            }
           //add finally method and stop loop
        }
    }


    public static void main(String[] args) {
       //part1();
        part2();
       // part3();
       // part4();
       // part5();
       // part6();
    }

}
