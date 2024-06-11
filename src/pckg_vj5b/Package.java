package pckg_vj5b;

import java.util.ArrayList;

public class Package {
    private Customer customer;
    private ArrayList<Integer> itemsQuantities;
    private long packageID;
    private ArrayList<Item> packageItems;

    public Package(Customer customer) {
        this.customer = customer;
        this.itemsQuantities = new ArrayList<>();
        this.packageID = System.currentTimeMillis();
        this.packageItems = new ArrayList<>();
    }

    public void putItem(Item item,int quantity) {
        this.itemsQuantities.add(quantity);
        this.packageItems.add(item);
    }
    public void listAllItemsInPackage(){
        for (int i = 0; i < packageItems.size(); i++) {
            System.out.println(packageItems.get(i).toString() + " Quantity: " + itemsQuantities.get(i));
        }
    }
    public ArrayList<Integer>itemsQuantites(){
        return itemsQuantities;
    }
    public Customer customer(){
        return customer;
    }
    public ArrayList<Item> packageItems(){
        return packageItems;
    }
    public long packageID(){
        return packageID;
    }

}
