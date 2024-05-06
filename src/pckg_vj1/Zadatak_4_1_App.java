package pckg_vj1;

import java.util.Scanner;

public class Zadatak_4_1_App {
    public static void main(String[] args) {
        double volume;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius ... \t");
        double r = sc.nextDouble();
        while (r<10) {
            System.out.println("What is with the 4/3?");
            System.out.println("4 ÷ 3 gives: " + 4/3);
            volume = (4/3)*Math.PI*Math.pow(r, 3);
            System.out.println("Volume is: " + volume);
            System.out.println("Please enter a radius ... \t");
            r = sc.nextDouble();
        }
        System.out.println("Radius bigger than 10.");
    }
}
