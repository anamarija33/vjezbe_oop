package pckg_vj5b;

public class Sneakers extends Item {
    public Sneakers(float itemInitPrice, int quantity, String itemDescription) {
        this.itemInitPrice = itemInitPrice;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
    }
    @Override
    protected void changeItemDescription() {
        System.out.println("Sneakers changed Description.");
    }

    @Override
    protected void setItemPrice(float percentage) {

    }
    @Override
    public String toString() {
        return "Sneakers{" +
                "quantity=" + quantity +
                ", itemInitPrice=" + itemInitPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemID=" + itemID +
                '}';
    }


}
