package pckg_vj3;

import java.util.Arrays;
import java.util.Scanner;

public class Robot {
    private Scanner sc = new Scanner(System.in);
    private int ID;
    private String name;
    private int[][] polje = new int[5][4];
    public void walk(){
        System.out.println("I roboti znaju hodati");
    }

    public void fillArr(){
        for (int i = 0; i < polje.length; i++) {
            for (int j = 0; j < polje[i].length; j++) {
                System.out.println("Upiši broj: ");
                polje[i][j] = sc.nextInt();
            }
        }
    }

    public void printArr(){
        for (int[] rw : polje){
            System.out.println(Arrays.toString(rw));
        }
    }

    public void factJel(int fakt){
        int fact = 1;
        for(int i = 1; i <= fakt; i++){
            fact *= i;
        }
        System.out.println("Faktorijela broja "+ fakt + " je : "+fact);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
