package pckg_vj10.zd2;

import java.util.ArrayList;
import java.util.EventObject;

public class FormEvent extends EventObject {
    private float kreda;
    private float kamata;
    private int nacin;
    private int godina;
    private ArrayList<Calculation> calculations;


    public FormEvent(Object source) {
        super(source);
        calculations = new ArrayList<>();
    }

    public FormEvent(Object source, float kreda, float kamata, int nacin, int godina, ArrayList<Calculation> calculations) {
        super(source);
        this.kreda = kreda;
        this.kamata = kamata;
        this.nacin = nacin;
        this.godina = godina;
        this.calculations = calculations;
    }

    public float getKreda() {
        return kreda;
    }

    public void setKreda(float kreda) {
        this.kreda = kreda;
    }

    public float getKamata() {
        return kamata;
    }

    public void setKamata(float kamata) {
        this.kamata = kamata;
    }

    public int getNacin() {
        return nacin;
    }

    public void setNacin(int nacin) {
        this.nacin = nacin;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public ArrayList<Calculation> getCals() {
        return this.calculations;
    }

    public void setCals(Calculation calcs) {
        this.calculations.add(calcs);
    }


}
