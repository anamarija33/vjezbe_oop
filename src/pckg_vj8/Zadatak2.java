package pckg_vj8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

    private static Scanner sc;
    private static int inpt;

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Please enter one integer: ");
                inpt = sc.nextInt();
                System.out.println("You have entered -> " + inpt);
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input -> only integers are allowed :)");
                System.out.println("Try again -> 1 for YES and other integer for NO");
                sc.next();
                try {
                    inpt = sc.nextInt();
                    if (inpt != 1) {
                        sc.close();
                        System.out.println("User abort program execution");
                    } else {
                        flag = true;
                    }
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("User abort program execution");
                    break;
                }
            }
        }
    }

}
