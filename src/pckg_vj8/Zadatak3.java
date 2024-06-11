package pckg_vj8;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak3 {
    public static void main(String[] args) {
        int[] arr = genArr(10);

        try {
            System.out.println(arr[arr.length]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Exception: ArrayIndexOutOfBoundsException in: "+ arrayIndexOutOfBoundsException);
        }finally{
            System.out.println("Be careful -> array length is: "+ arr.length);
        }

    }


    private static int[] genArr(int arraySize) {
        int[] arr = new int[arraySize];
        while(arraySize > 0) {
            arr[arraySize-1]= ThreadLocalRandom.current().nextInt(0, 100);
            arraySize--;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
