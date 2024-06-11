package pckg_vj9;

import java.io.Serializable;
import java.util.ArrayList;

public class SpaceScientist implements Serializable {
    private String name;
    private int id;
    private static int cnt = 0;
    private String specialization;
    private ArrayList<String> equipment;
    private transient Species spec;

    public SpaceScientist(String name, String specialization, ArrayList<String> equipment, Species spec) {
        this.name = name;
        this.id = cnt++;
        this.specialization = specialization;
        this.equipment = equipment;
        this.spec = spec;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public String getSpec() {
        return "transient";
    }

    @Override
    public String toString() {
        return "SpaceScientist{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", specialization='" + specialization + '\'' +
                ", equipment=" + equipment +
                ", spec=" + spec +
                '}';
    }
}
