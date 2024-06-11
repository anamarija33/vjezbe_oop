package pckg_vj5b;

public abstract class Item {
    protected int quantity;
    protected float itemInitPrice;
    protected String itemDescription;
    protected int itemID;

    public Item(){
    }

    protected void decreaseItemQuantity(int num) {
        this.quantity -= num;

    }

    protected abstract void changeItemDescription();

    protected float getItemCurrentPrice(){
        return itemInitPrice;
    }
    protected String getItemDescription(){
        return this.itemDescription;
    }

    protected int getItemID(){
        return this.itemID;
    }

    protected float getItemPrice(){
        return this.itemInitPrice;
    }

    protected int getQuantity(){
        return this.quantity;
    }

    protected void setAdditionalQuantity(int quantity){
        this.quantity = quantity;
    }

    protected abstract void setItemPrice(float percentage);


    protected int additionalQuantity() {
        return this.quantity;
    }
}
