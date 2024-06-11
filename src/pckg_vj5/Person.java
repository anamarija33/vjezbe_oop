package pckg_vj5;

import java.util.UUID;

public class Person implements CommonActions{

    private String name;
    private int id;
    private static int cnt = 100;

    public Person(String name) {
        this.name = name;
        this.id = cnt++;
    }

    @Override
    public void walk(String s, int n) {
        System.out.println("I'm a human, and you can't command to me!");
    }

    @Override
    public String talk() {
        System.out.println("You want me to talk - ok:");
        return UUID.randomUUID().toString();
    }

    @Override
    public void think(String s) {
        System.out.println("Surely, humans are more capable of thinking then robots - aren't they?");
    }

    @Override
    public int calculate(int n) {
        return n%2;
    }

    @Override
    public void infoPerson() {
        System.out.println("Name: "+this.name+", age: ?? koji age, ni nema ga");
    }
}
