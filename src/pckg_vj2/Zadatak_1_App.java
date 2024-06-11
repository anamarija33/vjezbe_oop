package pckg_vj2;

import java.util.Scanner;

public class Zadatak_1_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string1 = {"Vasa", "vana plurimum", "sonant"};
        String[] string2 = new String[4];
        for (int i = 0; i < string2.length; i++) {
            System.out.println("Upušite "+(i+1)+". string: ");
            string2[i] = scanner.next();
        }
        for (String s : string1) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : string2) {
            System.out.println(s);
        }
    }
}
