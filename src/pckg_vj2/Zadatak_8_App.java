package pckg_vj2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak_8_App {
    public static void main(String[] args) {

        double minDo = 25.78; double maxDo = 2400.89;
        double[] niz = new double[15];
        for(int i = 0; i < 15; i++){
            niz[i]= ThreadLocalRandom.current().nextDouble(minDo, maxDo);
        }
        System.out.println("Nesortirani niz: "+Arrays.toString(niz));
        Arrays.sort(niz);
        for(int left = 0, right = niz.length-1; left<right; left ++, right--){
            double temp = niz[left]; niz[left] = niz[right]; niz[right] = temp;
        }
        System.out.println("Sortirani niz: ");
        System.out.println(Arrays.toString(niz));

    }
}
