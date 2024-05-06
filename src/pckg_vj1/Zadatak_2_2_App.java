package pckg_vj1;

import java.util.Scanner;

public class Zadatak_2_2_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi cijeli broj: ");
        int unos1 = sc.nextInt();
        System.out.println("Unesi drugi cijeli broj: ");
        int unos2 = sc.nextInt();
        System.out.println("Zbroj tih brojeva je: "+ (unos1+unos2));
        System.out.println("Razlika tih brojeva je: " + (unos1-unos2));
        System.out.println("Umnožak tih brojeva je: " + (unos1*unos2));
        System.out.println("Količnik tih brojeva je: " + (unos1/unos2));
        System.out.println("Ostatak dijeljenja tih brojeva: "+ (unos1%unos2));
        System.out.println("Unesi decimalni broj: ");
        float unos3 = sc.nextFloat();
        System.out.println("Korijen tog broja je: "+(Math.sqrt(unos3)));
        System.out.println("Apsolutna vrijednost tog broja je: "+ (Math.abs(unos3)));


    }
}
