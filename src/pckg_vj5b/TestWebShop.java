package pckg_vj5b;

public class TestWebShop {
    public TestWebShop() {

    }
    public static void main(String[] args) {
        WebShop ws = new WebShop("WEB_BEST_OFF");
        ws.addItemInWebShop(new Jacket(550, 35, "JACKET-MODEL_AS"));
        ws.addItemInWebShop(new T_Shirt(190, 100, "TS-CCD100"));
        ws.addItemInWebShop(new Sneakers(450, 15, "SNKRS-XW"));
        Customer c1 = new Customer("John - Zagreb");
        ws.listAllItems();






    }
}
