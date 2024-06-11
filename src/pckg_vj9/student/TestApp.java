package pckg_vj9.student;

import javax.xml.crypto.Data;
import java.util.*;

public class TestApp {
    public static void main(String[] args) {
        List<String[]> data4CSV;
        data4CSV = DataHandling.readFromCSVFile("students.csv");
        for (String[] data : data4CSV) {
            System.out.println(Arrays.toString(data));
        }

        String[] names = DataHandling.getColumnData(0,data4CSV);
        System.out.println("************  NAMES **************");
        System.out.println(Arrays.toString(names));
        System.out.println("************* UNIQUE NAMES **************");
        Set<String> nameSet = DataHandling.getUniques(names);
        System.out.println(nameSet);

        Map<String, List<String[]>> students = DataHandling.returnAllFromUnique(nameSet, data4CSV, 0);
//        for(Map.Entry<String, List<String[]>> entry : students.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(Arrays.deepToString(entry.getValue().toArray()));
//        }
        DataHandling.listAllData(students);
    }
}
