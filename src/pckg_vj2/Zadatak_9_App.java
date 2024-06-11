package pckg_vj2;

public class Zadatak_9_App {
    public static void main(String[] args) {
        float[] nums = {2.44f, 4.55f, 7.88f, 44.32f, 51.11f};
        int indx = 0;
        for(float n: nums){
            System.out.println("Index: " + indx + " <-> Value: " + n );
            indx++;
        }
    }
}
