import java.util.Date;

public final class Student {

	private int id;
	private BirthDate birthDate;

	public Student (int studentNo, int year, int month, int day) {
		id = studentNo;
		birthDate = new BirthDate(year, month, day);
      }  

	public int getId() {
		return id;
	}

	public BirthDate getBirthDate() {
		return birthDate;
	}
} 