package pckg_vj1;

import java.util.Scanner;

public class Zadatak_2_1_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int unos = sc.nextInt();
        int kvadrat = (int) Math.pow(unos,2);
        int kub = (int) Math.pow(unos,3);
        System.out.println("Kvadrat od "+unos + " je: "+ kvadrat);
        System.out.println("Kub od " + unos + " je: "+ kub);
        sc.close();
    }
}
