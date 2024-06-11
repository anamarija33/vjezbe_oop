package pckg_vj6;

public class Robot {
    private int id;
    private String description;

    public Robot(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
