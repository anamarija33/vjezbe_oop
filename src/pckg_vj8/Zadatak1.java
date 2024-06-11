package pckg_vj8;

import java.io.*;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        String fileName = "/home/sy/Documents/sve_za_faks/faks_p/drugi_semestar/vjezbe_oop/src/pckg_vj8/randText.txt";
        System.out.println("******************** Reading with Scanner *************************");
        FileHandling.readFileScanner(fileName);
        System.out.println("\n******************** Reading with BufferedReader *************************");
        FileHandling.readFileBufferedReader(fileName);
        System.out.println("\n******************** Writing to file *************************");
        FileHandling.write2File("nova.txt");
        System.out.println("\n******************** Ask user for file name *************************");
        FileHandling.askUser4File();

    }
}
