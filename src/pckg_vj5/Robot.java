package pckg_vj5;

public class Robot implements CommonActions{
    private String name;
    private int id;
    private static int cnt = 100;

    public Robot() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk(String s, int n) {
        System.out.println("Robot is walking "+ s+", for "+n+" meters.");
    }

    @Override
    public String talk() {
        System.out.println("This robot can't speak!");
        return "";
    }

    @Override
    public void think(String s) {
        System.out.println("Thinking about "+s);
        System.out.println("Thinking ...");
    }

    @Override
    public int calculate(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        return n*calculate(n-1);

    }

    @Override
    public void infoPerson() {
        System.out.println("Name of robot: "+name+", id: "+id);
    }
}
