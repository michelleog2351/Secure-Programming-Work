public class BirthDate {
	
	private int year;
	private int month;
	private int day;

	public BirthDate (int newYear, int newMonth, int newDay){
		year = newYear;
		month = newMonth;
		day = newDay;
	}

	public void setYear(int updateYear) {
		year = updateYear;
	}

	public String toString() {
		return "Year " + year + " Month " + month + " Day " + day;
	}


}