package pckg_vj7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        popuniListu(list,20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(list);



    }

    private static void popuniListu(ArrayList<Integer> list, int n) {
        for(int i = 0; i < n; i++) {
            list.add(ThreadLocalRandom.current().nextInt(10,1000));
        }

    }
}
