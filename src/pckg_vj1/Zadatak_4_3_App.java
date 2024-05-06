package pckg_vj1;

import java.util.Scanner;

public class Zadatak_4_3_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cijeli broj: ");
        int number = sc.nextInt();
        System.out.println("Uneseni broj: " + number);
        while(number!=158){
            System.out.println("Unesite cijeli broj: ");
            number = sc.nextInt();
            System.out.println("Uneseni broj: " + number);
        }
        System.out.println("Unesena je tražena vrijednost.");
    }
}
