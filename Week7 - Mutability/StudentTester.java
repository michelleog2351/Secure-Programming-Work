public class StudentTester {
	
public static void main(String [] args) {
		
	Student student = new Student( 00123456, 2001, 12,2);
     
	BirthDate date = student.getBirthDate();
	System.out.println("!!!Student Birthdate 1 : " + student.getBirthDate());

	date.setYear(1970);   //!!!
    System.out.println("!!!Student Birthdate CHANGED : " + student.getBirthDate());

	}

}