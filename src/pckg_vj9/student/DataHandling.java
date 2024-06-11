package pckg_vj9.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataHandling {


    public static List<String[]> readFromCSVFile(String fullPath) {

        List<String[]> data = new ArrayList<String[]>();
        File file = new File(fullPath);
        String[] rowData;
        String lnRow;

        try (FileReader fr = new FileReader(file)) {

            BufferedReader br = new BufferedReader(fr);
            while ((lnRow = br.readLine()) != null) {
                rowData = lnRow.split("\\s*,\\s*");
                data.add(rowData);
            }

            br.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return data;
    }

    //  Metoda za izdvajanje bilo kojeg stupca
    public static String[] getColumnData(int col, List<String[]> data4CSV) {

        String[] colData = new String[data4CSV.size()-1]; // do not want headers info
        int cnt  = 0;
        for(String[] row: data4CSV) {

            if(data4CSV.indexOf(row) == 0) {
                continue;
            } else {
                colData[cnt] = row[col];
                cnt++;
            }

        }
        return colData;
    }
    //  izdvajamo jedinstvene elemente
    public static Set<String> getUniques(String[] dta){

        Set<String> uniq = new TreeSet<>();
        uniq.addAll(Arrays.asList(dta));

        return uniq;
    }
    //  spremanje redaka o studentima u liste nizova za svakog jedinstvenog studenta
    public static Map<String, List<String[]>> returnAllFromUnique(Set<String> unq, List<String[]> rowDta, int col){

        Map<String, List<String[]>> allDta = new TreeMap<>();
        List<String[]> subDta;

        for (String key : unq) {

            subDta = new ArrayList<>();
            for (String[] strings : rowDta) {

                if(key.equals(strings[col])) {
                    subDta.add(strings);
                } else {
                    continue;
                }
            }
            // put into Map
            allDta.put(key, subDta);
        }
        return allDta;
    }

    public static void listAllData(Map<String, List<String[]>> dta) {

        for(String key : dta.keySet()) {
            System.out.println("-> " + key + ": ");
            for(String[] subdta : dta.get(key)) {
                System.out.println(Arrays.toString(subdta));
            }
            System.out.println("\n");
        }

    }
}


