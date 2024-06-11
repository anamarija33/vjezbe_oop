package pckg_vj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("auto");
        lista.add("svemirski brod");
        lista.add("avion");
        lista.add("helikopter");
        lista.add("jedrilica");
        lista.add("gliser");
        lista.add("romobil");
        lista.add("bicikla");

        System.out.println(lista);
        Collections.sort(lista, new SilazniNiz());
        System.out.println(lista);


    }
    private static class SilazniNiz implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            Integer l1 = o1.length();
            Integer l2 = o2.length();
            return -l1.compareTo(l2);
        }
    }
}
