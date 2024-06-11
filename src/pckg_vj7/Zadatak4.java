package pckg_vj7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        LinkedList<String> lsita = new LinkedList<>();
        try {
            scanner = new Scanner(new File("/home/sy/Documents/sve_za_faks/faks_p/drugi_semestar/vjezbe_oop/src/pckg_vj7/datoteka.txt"));
            while(scanner.hasNextLine()) {
                lsita.add(scanner.nextLine());
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("Nesortirana lista: "+ lsita);
        Collections.sort(lsita, new  StringLengthComparator());
        System.out.println("Sortirana lista:" + lsita);

    }
}
