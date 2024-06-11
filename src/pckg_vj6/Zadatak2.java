package pckg_vj6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zadatak2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(21, "Stipe");
        hashMap.put(159, "Divna");
        hashMap.put(985, "Etna");
        hashMap.put(455, "Petar");
        hashMap.put(5788, "Vlatka");

        for( Integer key : hashMap.keySet() ) {
            System.out.println("id  = " + String.valueOf(key) + ", Name = "+hashMap.get(key));
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "Stipe");
        treeMap.put(159, "Divna");
        treeMap.put(985, "Etna");
        treeMap.put(455, "Petar");
        treeMap.put(5788, "Vlatka");

        System.out.println("*************** Tree Map **************");
        printMap(treeMap);

        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(21, "Stipe");
        linkedMap.put(159, "Divna");
        linkedMap.put(985, "Etna");
        linkedMap.put(455, "Petar");
        linkedMap.put(5788, "Vlatka");
        System.out.println("*************** Linked Map **************");
        printMap(linkedMap);
    }

    public static void printMap(Map<Integer, String> map) {
        for( Integer key : map.keySet() ) {
            System.out.println("id  = " + String.valueOf(key) + ", Name = "+map.get(key));
        }
    }
}
