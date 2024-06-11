package pckg_vj5b;

public class Jacket extends Item{

    public Jacket(float itemInitPrice, int quantity, String itemDescription) {
        this.itemInitPrice = itemInitPrice;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
    }


    @Override
    protected void changeItemDescription() {

    }

    @Override
    protected void setItemPrice(float percentage) {

    }

    @Override
    public String toString() {
        return "Jacket{" +
                "quantity=" + quantity +
                ", itemInitPrice=" + itemInitPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemID=" + itemID +
                '}';
    }
}
