package pckg_vj1;

import java.util.Scanner;

public class Zadatak_4_2_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long num = sc.nextLong();
        while (num > Integer.MAX_VALUE) {
            System.out.println("Enter an integer: ");
            num = sc.nextLong();
        }
        long add_nums = 0;
        for (int i = 0; i < num+1; i++) {
            add_nums+=i;
        }
        System.out.println("Addition of " + num + " numbers is " + add_nums);
    }
}
