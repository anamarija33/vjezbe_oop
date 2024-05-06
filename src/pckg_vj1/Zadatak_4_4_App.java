package pckg_vj1;

import java.util.Scanner;

public class Zadatak_4_4_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char confirmation = 'y';
        String string;
        while(confirmation == 'y') {
            System.out.println("Enter a string: ");
            string = scanner.next();
            System.out.println(string);
            System.out.println("Do you want to continue? Type y for yes. ");
            confirmation = scanner.next().charAt(0);
        }
        System.out.println("You chose to exit the program!");
    }
}
