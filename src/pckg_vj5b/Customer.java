package pckg_vj5b;

public class Customer {
    private String address;
    private int id;
    private static int cntID = 0;
    public  Customer(String address) {
        this.address = address;
        this.id = ++cntID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}
