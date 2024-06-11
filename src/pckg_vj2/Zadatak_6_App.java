package pckg_vj2;

import java.util.Arrays;

public class Zadatak_6_App {
    public static void main(String[] args) {
        int[] niz = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] niz2 = Arrays.copyOf(niz,niz.length);
        boolean isEqual = Arrays.equals(niz2,niz);
        if(isEqual){
            System.out.println("Nizovi su jednaki.");
        }else {
            System.out.println("Nizovi nisu jednaki.");
        }
    }
}
