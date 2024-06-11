package pckg_vj4;

public class Semafor {
    private String crveno = "0";
    private String zuto = "2";
    private String zeleno = "1";



    public String getCrveno() {
        return crveno;
    }

    public void setCrveno(String crveno) {
        this.crveno = crveno;
    }

    public String getZuto() {
        return zuto;
    }

    public void setZuto(String zuto) {
        this.zuto = zuto;
    }

    public String getZeleno() {
        return zeleno;
    }

    public void setZeleno(String zeleno) {
        this.zeleno = zeleno;
    }

    public void stanje(int num) {
        String stanje = String.valueOf(num);
        System.out.println("Testiram stanje semafora za: " + stanje);
        System.out.println("------------------------------------");
        if (stanje.equals(zeleno)) {
            System.out.println("Kod je za zeleno svjetlo -> prolaz.");
        } else if (stanje.equals(zuto)) {
            System.out.println("Kod je za žuto svjetlo -> oprez.");
        } else if (stanje.equals(crveno)) {
            System.out.println("Kod je za crveno svjetlo -> stoj.");
        } else {
            System.out.println("Nepostojeći kod - semafor izvan upotrebe!!!");
        }
    }
}
