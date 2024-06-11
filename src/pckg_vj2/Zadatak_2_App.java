package pckg_vj2;

import java.io.PrintStream;
import java.util.Scanner;

public class Zadatak_2_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upišite broj mjerenja: ");
        int broj_mjerenja = sc.nextInt();
        float[] mjerenja = new float[broj_mjerenja];
        for (int i = 0; i < broj_mjerenja; i++) {
            System.out.println("Upišite " + (i + 1) + ". mjerenje: ");
            mjerenja[i] = sc.nextFloat();
        }
        sc.close();
        float prosjek = 0;
        int temp_ispod = 0;
        int temp_iznad = 0;

        for (float i : mjerenja) {
            prosjek += i;
        }
        prosjek = prosjek / broj_mjerenja;
        for (float temp : mjerenja) {
            if (prosjek < temp) {
                temp_iznad++;
            } else if (prosjek > temp) {
                temp_ispod++;
            }
        }
        System.out.println("Vrijednost prosječne temperature je : " + prosjek + ", a broj mjerenja je: " + broj_mjerenja);
        System.out.println("Broj mjerenja s temperaturom ispod prosjeka: " + temp_ispod + ", a broj mjerenja s temperaturom iznad prosjeka je: " + temp_iznad);


    }
}
