package pckg_vj5;

import java.text.ParseException;
import java.util.Scanner;

public class Client {
private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        PDS_Student pds_student = new PDS_Student("Majo");
        pds_student.setEnrollmentDate();
        pds_student.completedStudy(3);
        pds_student.infoStudent();
    }
}
