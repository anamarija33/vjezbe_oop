package pckg_vj9;

public class Species {
    private String name;
    private String homeWorld;


    public Species(String name, String homeWorld) {
        this.name = name;
        this.homeWorld = homeWorld;


    }

    public String getName() {
        return name;
    }

    public String getHomeWorld() {
        return homeWorld;
    }


    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", homeWorld='" + homeWorld + '\'' +
                '}';
    }
}
