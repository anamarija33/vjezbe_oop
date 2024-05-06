package pckg_vj1;

import java.util.Scanner;

public class Zadatak_4_5_App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers 1, 2 or 3: ");
        int var = scanner.nextInt();

        switch (var){
            case 1:
                System.out.println("You entered number 1.");
                break;
            case 2:
                System.out.println("You entered number 2.");
                break;
            case 3:
                System.out.println("You entered number 3.");
                break;
            default:
                System.out.println("You did not enter one of the 3 numbers.");
                break;
        }
    }
}
