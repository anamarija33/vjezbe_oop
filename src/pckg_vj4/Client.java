package pckg_vj4;

public class Client {
    public static void main(String[] args) {
        Semafor smf = new Semafor();
        Haker haker = new Haker(smf);
        int probni = 2;
        smf.stanje(probni);
        haker.manualProgrammingSemafor();

    }
}
