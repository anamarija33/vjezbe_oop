package pckg_vj2;

public class Zadatak_7_App {
    public static void main(String[] args) {
        int[][] niz = {{1,2,3,12},{4,5,6,43},{7,8,9,22}};
        int max = 0;
        for(int[] rw: niz){
            for(int el: rw){
                if(el > max){
                    max = el;
                }
            }
        }
        System.out.println("Max element: "+max);
    }
}
