package pckg_vj6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zadatak3 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        TreeSet<String> set3 = new TreeSet<>();

        popuniSet(set1);
        popuniSet(set2);
        popuniSet(set3);

        System.out.println("************ Hash Set ***************");
        printSet(set1);
        System.out.println("************ Linked Hash Set ***************");
        printSet(set2);
        System.out.println("************ Tree Set ***************");
        printSet(set3);
        System.out.println("************ Test za Hash Set ***************");
        imaLiElementa(set1, "Nema ga");

        System.out.println("************ Ispis Hash Set ***************");
        printSet(set1);

        System.out.println("*********** Ponovno dodavanje elementa 'Nema ga' u hash set **********");
        set1.add("Nema ga");
        printSet(set1);
        // ne dodaju se duplicirani elementi

        // Print u Hash set i u linked hash set ispisuju elemente po redu kako su  dodani, a tree set ih ispisuje po abecednom redu

        izbrisiElement(set1, "eleee");
        printSet(set1);
        izbrisiElement(set1, "eleee");
        printSet(set1);
    }

    public static void izbrisiElement(Set<String> set, String el) {
        if (imaLiElementa(set,el)) {
            System.out.println("Brišem element "+el+" iz skupa");
            set.remove(el);
        }else{
            System.out.println("Dodajem element u skup");
            set.add(el);
        }
    }

    public static void printSet(Set<String> set) {
        for(String str : set) {
            System.out.println(str);
        }
    }

    public static boolean imaLiElementa(Set<String> set, String el) {
        if (set.contains(el)) {
            System.out.println("Element "+el+" postoji u skupu");
            return true;
        }else{
            System.out.println(el+" element ne postoji");
            //System.out.println("Dodaje se element "+el+" u skup");
            //set.add(el);
            return false;
        }

    }

    public static void popuniSet(Set<String> nekiSet){
        nekiSet.add("Otvoreni");
        nekiSet.add("Kod");
        nekiSet.add("Kriptografija");
        nekiSet.add("Linux");
        nekiSet.add("Nešto");
    }
}
