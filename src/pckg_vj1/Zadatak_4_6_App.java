package pckg_vj1;

import java.util.Scanner;

public class Zadatak_4_6_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dobro = "dobro";
        String bolje = "bolje";
        String najbolje = "najbolje";
        System.out.println("Kako ste? ");
        String unos = scanner.next();
        switch (unos){
            case "dobro":
                System.out.println("Hvala, danas sam: "+dobro);
                break;
            case "bolje":
                System.out.println("Hvala, danas sam: "+bolje);
                break;
            case "najbolje":
                System.out.println("Hvala, danas sam: "+najbolje);
                break;
            default:
                System.out.println("Sigurno će biti bolje \uD83D\uDE03");
        }
    }
}
