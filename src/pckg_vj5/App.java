package pckg_vj5;

public class App {
    public static void main(String[] args) {
        Robot rob = new Robot();
        rob.setName("Roby");
        rob.setId(45126);
        Person prs = new Person("Roberta");

        prs.think("Life");
        rob.think("Life");
        prs.walk("North", 50);
        rob.walk("South", 123);
        System.out.println("********** Calculations **************");

        System.out.println(prs.calculate(9));
        System.out.println(rob.calculate(9));
    }
}
