import java.util.Calendar;
import java.util.Date;

public class CourseTester {
    public static void main(String[] args) {
        // Using Calendar to avoid deprecated Date constructor
        Calendar startCal = Calendar.getInstance();
        startCal.set(2025, Calendar.AUGUST, 20);
        Date startDate = startCal.getTime();

        Course course = new Course("Applied Computing", startDate);

        System.out.println("My course name before: " + course.getCourseName());
        System.out.println("My course start date before: " + course.getStartDate());

        Course myCourse = new Course("dd", startDate);
        System.out.println("My course name after: " + myCourse.getCourseName());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.DECEMBER, 19);

        System.out.println("My course date after: " + calendar.getTime());

        // If courseName is final, you can't change it:
        // myCourse.courseName = "dD"; // This will throw an error
    }
}
