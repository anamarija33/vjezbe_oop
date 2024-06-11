package pckg_vj1;

import java.util.Scanner;

public class Zadatak_3_1_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cijeli broj: ");
        int num = sc.nextInt();
        double res;
        if(num < 0){
            res = Math.abs(num);
            System.out.println("Apsolutna vrijednost je: " + res);
        } else if(num > 0){
            res = Math.cbrt(num);
            System.out.println("Kubni korijen je: " + res);
        } else {
            System.out.println("Unijeli ste nulu!");
        }
        sc.close();
    }
}
