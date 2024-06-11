package pckg_vj9;

import java.util.ArrayList;
import java.util.List;

public class Appclient {

    public static void main(String[] args) {
        List<Gunslinger> gunsSave = new ArrayList<>();
        Gunslinger gn1 = new Gunslinger("Wyatt Earp", "right", true, 1845);
        gunsSave.add(gn1);
        Gunslinger gn2 = new Gunslinger("Billy the Kid", "left", false, 1830);
        gunsSave.add(gn2);
        Gunslinger gn3 = new Gunslinger("Wild Bill Hickok", "both", true, 1820);
        gunsSave.add(gn3);
        List<Gunslinger> gunsRead;
        List<String[]> gunsCSV;
        List<Gunslinger> reconstructGuns;

        ObjectsHandling.saveObj2File("gunFighters.bin", gunsSave);

        gunsRead = ObjectsHandling.readFromFile("gunFighters.bin");
        checkReadContent(gunsRead);

        ObjectsHandling.writeIntoTxt("gunFighters.csv", (ArrayList<Gunslinger>) gunsSave);
        gunsCSV = ObjectsHandling.readFromCSVFile("gunFighters.csv");
        System.out.println("\n");
        ObjectsHandling.listAllDataFromFile(gunsCSV);
        reconstructGuns = ObjectsHandling.recreateObjFromTxtFile(gunsCSV);
        System.out.println("******************************** Reconstruction from csv file -> all objects ***************************");
        checkReadContent(reconstructGuns);
    }

    private static <T> void checkReadContent(List<T> list) {
        list.forEach(T -> {
//            System.out.println("****************************************************************");
//            System.out.println(T.toString());
            System.out.println("\n");
            System.out.println(T.hashCode());
            System.out.println(T.toString());
        });
    }
}
