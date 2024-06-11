package pckg_vj6;

import java.util.ArrayList;
import java.util.LinkedList;

public class Zadatak1 {


    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        LinkedList<String> lista2 = new LinkedList<>();
        for(int i = 1; i < 6; i++){
            lista.add("element "+String.valueOf(i));
        }
        System.out.println("******************** Array List *******************");
        System.out.println("Array list: " + lista);
        for(int i = 0; i < 5; i++){
            lista2.add(lista.get(i));
        }
        System.out.println("******************** Linked List *******************");
        System.out.println("Linked list: "+lista2);
        lista2.add("proizvoljni element");
        System.out.println("******************** Linked List *******************");
        System.out.println("Linked list: "+lista2);

        lista2.addFirst("novi početak");
        lista2.add("novi kraj");

        System.out.println("******************** Ext List *******************");
        for (String el : lista2) {
            System.out.println(el);
        }
        System.out.println();

        zamijeniElement(lista2, 5, "novielem");





    }
    private static void zamijeniElement(LinkedList<String> lista, int index, String elem){
        String e = lista.remove(index);
        lista.add(index, elem);
        System.out.println("******************** After Method ********************");
        System.out.println(lista);
        System.out.println("izbrisani element: " + e);
    }
}
