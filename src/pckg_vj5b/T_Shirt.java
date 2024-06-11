package pckg_vj5b;

public class T_Shirt extends Item {
    public T_Shirt(float itemInitPrice, int quantity, String itemDescription) {
        this.itemInitPrice = itemInitPrice;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
    }

    @Override
    protected void changeItemDescription() {
        System.out.println("Changed TShirt description");
    }

    @Override
    protected void setItemPrice(float percentage) {

    }
    @Override
    public String toString() {
        return "T_Shirt{" +
                "itemID=" + itemID +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemInitPrice=" + itemInitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
