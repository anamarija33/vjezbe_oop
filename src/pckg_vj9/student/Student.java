package pckg_vj9.student;

public class Student {
    private String name;
    private int bodovi;
    private int aktivnosti;
    private int radovi;
    private boolean redovit_upis;
    private String napomena;

    public Student(String name, int bodovi, int aktivnosti, int radovi, boolean redovit_upis, String napomena) {
        this.name = name;
        this.bodovi = bodovi;
        this.aktivnosti = aktivnosti;
        this.radovi = radovi;
        this.redovit_upis = redovit_upis;
        this.napomena = napomena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bodovi=" + bodovi +
                ", aktivnosti=" + aktivnosti +
                ", radovi=" + radovi +
                ", redovit_upis=" + redovit_upis +
                ", napomena='" + napomena + '\'' +
                '}';
    }
}
