package pckg_vj6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Zadatak5 {
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

        for (String el : lista) {
            System.out.println(el);
        }

        Collections.sort(lista);
        System.out.println("**************************** SORTIRANO *******************");
        for (String el : lista) {
            System.out.println(el);
        }

        Collections.sort(lista, new StringLengthComparator());

        System.out.println("**************************** SORTIRANO PO DULKJINI STRINGA *******************");
        for (String el : lista) {
            System.out.println(el);
        }

    }
}
