package pckg_vj7;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Zadatak5 {
    private static String[] vehicles = {"car", "helicopter", "electronic bike", "truck", "motorcycle", "carriage"};
    public static void main(String[] args) {

        LinkedList<String> vehs = new LinkedList<>();
        // dodaje sve elemente iz niza vehicles u linked listu vehs
        Collections.addAll(vehs, vehicles);
        printList(vehs);
        Iterator<String> iter = vehs.iterator();
        printList(iter);
        System.out.println(vehs);
        ListProcessing.insertVeh(vehs,"bike");
        printList(vehs);
    }

    private static void printList(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
    private static void printList(Iterator<String> listIterator){
        System.out.println("_______________________________________");
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println(next);
            if (next.equals("carriage")) {
                listIterator.remove();
                System.out.println("Removed carriage from list");
            }
            System.out.println(next);

        }
    }

    private static class ListProcessing implements ListIterator<String> {
        private static ListIterator<String> lista;

        public static void insertVeh(LinkedList<String> list,  String newVeh) {
            lista = list.listIterator();
            while(lista.hasNext()) {
                String veh = lista.next();
                if(veh.equals("electronic bike")) {
                    lista.add(newVeh);
                    break;

                }

            }

        }


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            if(lista.hasNext()) {
                return lista.next();
            }else{
                return null;
            }
        }

        @Override
        public boolean hasPrevious() {
            if(lista.hasPrevious()) {
                return true;
            }else{
                return false;
            }
        }

        @Override
        public String previous() {
            return "";
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(String s) {

        }

        @Override
        public void add(String s) {
            lista.add(s);
        }
    }
}
