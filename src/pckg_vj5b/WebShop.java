package pckg_vj5b;

import java.util.ArrayList;
import java.util.List;

public class WebShop extends Item{
    private String name;
    private List<Item> items;
    private List<Package> packages;


    public WebShop(String webBestOff) {
        this.name = name;
        this.items = new ArrayList<>();
        this.packages = new ArrayList<>();
    }

    public void updateItemsOfferQuantity(Item item, int quantity){
        item.decreaseItemQuantity(quantity);
    }

    public void listAllItems(){
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public void reduceNumberOfItemsAfterSuccessfulPurchase(Item item, int quantity){
        item.decreaseItemQuantity(quantity);
    }

    public void finishAndPay(){
        System.out.println("Package finished and paid.");
    }




    public void putItemsInPackage(Customer customer){
        Package package1 = new Package(customer);
        for (Item item : items) {
            package1.putItem(item, item.additionalQuantity());
        }
        packages.add(package1);
    }
    private void updateQuantitiesAfterSuccessfulPayment(){
        for (Package package1 : packages) {
            for (int i = 0; i < package1.packageItems().size(); i++) {
                package1.packageItems().get(i).decreaseItemQuantity(package1.itemsQuantites().get(i));
            }
        }
    }
    public void addItemInWebShop(Item item){
        items.add(item);
        System.out.println(item.toString() + " added to web shop.");

    }


    @Override
    protected void changeItemDescription() {
        System.out.println("Webshop item description changed.");
    }


    @Override
    protected void setItemPrice(float percentage) {

    }
}
