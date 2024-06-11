package pckg_vj7;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        try{
            queue.add(6);
        }catch (IllegalStateException e){
            System.out.println("Queue is full");
        }

        boolean obrada = obrada(queue, 1);
        ubaciElement(queue,obrada,22);
        obrada = obrada(queue,0);
        ubaciElement(queue,obrada,23);



    }

    private static void ubaciElement(ArrayBlockingQueue<Integer> queue, boolean flag, Integer elem) {
        if (flag) {
            queue.add(elem);
            System.out.println(queue);
        } else {
            System.out.println("Red je u čekanju");
        }
    }

    private static boolean obrada(ArrayBlockingQueue<Integer> queue, int flag) {
        if(flag == 1){
            System.out.println("Element je u obradi");
            queue.remove();
            return true;
        }else if(flag == 0){
            System.out.println("Red je u čekanju");

        }
        return false;
    }
}
