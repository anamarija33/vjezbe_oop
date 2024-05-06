package pckg_vj2;

import java.util.Scanner;

public class Zadatak_1_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string1 = {"Vasa", "vana plurimum", "sonant"};
        String[] string2 = new String[4];
        for (int i = 0; i < string2.length; i++) {
            string2[i] = scanner.next();
        }
        for (int i = 0; i<string1.length;i++){
            System.out.print(string1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < string2.length; i++){
            System.out.println(string2[i]);
        }
    }
}
