package pckg_vj1;

import java.util.Objects;
import java.util.Scanner;

public class Zadatak_4_7_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dobro = "dobro";
        String bolje = "bolje";
        String najbolje = "najbolje";
        System.out.println("Kako ste? ");
        String unos = scanner.next();

        if(Objects.equals(unos, dobro)){
            System.out.println("Hvala, danas sam: "+dobro);
        } else if (Objects.equals(unos,bolje)) {
            System.out.println("Hvala, danas sam: "+bolje);
        } else if (Objects.equals(unos,najbolje)) {
            System.out.println("Hvala, danas sam: "+najbolje);
        }else{
            System.out.println("Sigurno će biti bolje \uD83D\uDE03");
        }
    }
}
