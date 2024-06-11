package pckg_vj3;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setID(2);
        robot.setName("Frane");
        robot.walk();
        robot.factJel(5);
        robot.fillArr();
        robot.printArr();
    }
}
