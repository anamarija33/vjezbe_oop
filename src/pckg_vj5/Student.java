package pckg_vj5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {
    private static DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    protected static int cntStudents = 100;
    private static Scanner sc = new Scanner(System.in);

    protected void setEnrollmentDate() throws ParseException {
        System.out.println("Please enter enrollment data in the format dd-MM-yyyy: ");
        String date = sc.nextLine();
        this.enrolmentDate = DATE_FORMAT.parse(date);
    }

    protected void infoStudent(){
        System.out.println("Student: " + this.name + " - id: " + this.idStudent);
        System.out.println("Student enrolment date - " + enrolmentDate.toString());
        System.out.println("Student is on the: " + getClass().getSimpleName() + " programme!");
    }

    protected abstract void completedStudy(int num);


}
