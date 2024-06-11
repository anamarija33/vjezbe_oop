package pckg_vj5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Paket {
    private int idPackage;
    private static int cntPckg = 0;
    private String destination;
    private Customer customer;
    private float pricePackage;
    private int totalKom;
    private String webShop;
    private String destination4Package;
    private Scanner sc;
    private List<Item> items;
    private static float MINI = 10;
    private static float MAXI = 100;
    private static int KOMS = 10;
    boolean validPaymentMethod;
    String paymentMethod;


    public Paket(String destination, Customer customer, String webShop, Scanner sc) {
        this.destination = destination;
        this.customer = customer;
        this.webShop = webShop;
        this.sc = sc;
        this.idPackage = ++cntPckg;
        this.pricePackage = 0;
        this.totalKom = 0;
        this.items = new ArrayList<>();
        this.destination4Package = "";
        validPaymentMethod = false;
        paymentMethod = "";
    }
    public void putContent(){
        int choice;
        while (true) {
            System.out.println("1 - T_Shirt\n2 - Pant\n3 - Helmet\n4 - Sneakers");
            System.out.println("Please enter your choice:");
            switch (sc.nextInt()) {
                case 1:
                    items.add(new T_Shirt(randFloatPrice(), randIntKom()));
                    System.out.println("T-Shirt is ordered!");
                    break;
                case 2:
                    items.add(new Pants(randFloatPrice(), randIntKom()));
                    System.out.println("Some pants are ordered!");
                    break;
                case 3:
                    items.add(new Helmet(randFloatPrice(), randIntKom()));
                    System.out.println("Helmet is ordered!");
                    break;
                case 4:
                    items.add(new Sneakers(randFloatPrice(), randIntKom()));
                    System.out.println("Sneakers are ordered!");
                    break;
                default:
                    System.out.println("Wrong menu input!");
            }
            sc.nextLine();
            System.out.println("To continue shopping press 'y' - any other to exit!");
            String cont = sc.nextLine();
            if (!cont.toLowerCase().equals("y")) {
                System.out.println("-------------------------------------------------");
                System.out.println("Finished shopping - payment need to be defined!");
                if (checkPaymentPackage()) {
                    System.out.println("All is completed for this purchase...");
                    System.out.println("See package info for order details!");
                }
                break;
            } else {
                System.out.println("You have choose to continue shopping!");
            }
        }
    }

    public boolean checkPaymentPackage(){
        class PaymentMedia {

            final String POU = "POU";
            final String CP = "CP";
            final String OPS = "OPS";

            void paymentPossible() {

                System.out.println("Possible payment methods:");
                System.out.println(POU);
                System.out.println(CP);
                System.out.println(OPS);

            }

            boolean payPackage() {

                try {
                    switch (paymentMethod) {

                        case POU:
                            System.out.println("Payment will be made to a courier service ... ");
                            System.out.println("Package with id: " + idPackage + ", payed by customer with id: " + customer.customerID());
                            System.out.println("\n");
                            return true;
                        case CP:
                            System.out.println("Payment is done with credit card ...");
                            System.out.println("Package with id: " + idPackage + ", payed by customer with id: " + customer.customerID());
                            System.out.println("\n");
                            return true;
                        case OPS:
                            System.out.println("Payment is done by online payment service ...");
                            System.out.println("Package with id: " + idPackage + ", payed by customer with id: " + customer.customerID());
                            System.out.println("\n");
                            return true;
                        default:
                            System.out.println("Please choose a valid payment method ...");
                            System.out.println("\n");
                            return false;
                    }
                } catch (NullPointerException npe) {
                    /*paymentPossible();*/
                    return false;
                }

            }

            boolean paymentApproved() {

                if(validPaymentMethod){
                    return true;
                }else{
                    this.paymentPossible();
                    System.out.println("Please enter valid payment method:\t");
                    paymentMethod = sc.nextLine();
                    validPaymentMethod = payPackage();
                    return paymentApproved();
                }

            }

        }

        PaymentMedia pm = new PaymentMedia();
        validPaymentMethod = pm.paymentApproved();
        return validPaymentMethod;

    }

    private float randFloatPrice(){
        Random rand = new Random();
        return MINI + rand.nextFloat()*(MAXI-MINI);
    }

    private int randIntKom(){
        return ThreadLocalRandom.current().nextInt(1,KOMS);
    }

    public void calculateTotalPackagePrice(){

    }

    public void packageInfo(){

    }




    abstract class Item {

        abstract float itemPrice();

        abstract float getPrice();

        abstract int getKom();

    }

    private class T_Shirt extends Item {

        float tshirtPrice;
        int komTshirt;

        T_Shirt(float price, int kom) {
            this.komTshirt = kom;
            this.tshirtPrice = price;
        }

        float getPrice() {
            return tshirtPrice;
        }

        int getKom() {
            return komTshirt;
        }

        @Override
        float itemPrice() {
            return komTshirt * tshirtPrice;
        }
    }

    private class Pants extends Item {
        float pantPrice;
        int komPant;

        Pants(float price, int kom) {
            this.komPant = kom;
            this.pantPrice = price;
        }

        float getPrice() {
            return pantPrice;
        }

        int getKom() {
            return komPant;
        }

        @Override
        float itemPrice() {
            return komPant * pantPrice;
        }
    }

    private class Helmet extends Item {

        float helmetPrice;
        int komHelmet;

        Helmet(float price, int kom) {
            this.helmetPrice = price;
            this.komHelmet = kom;
        }

        float getPrice() {
            return helmetPrice;
        }

        int getKom() {
            return komHelmet;
        }

        @Override
        float itemPrice() {
            return komHelmet * helmetPrice;
        }
    }

    private class Sneakers extends Item {

        float sneakersPrice;
        int komSneakers;

        Sneakers(float price, int kom) {
            this.komSneakers = kom;
            this.sneakersPrice = price;
        }

        float getPrice() {
            return sneakersPrice;
        }

        int getKom() {
            return komSneakers;
        }

        @Override
        float itemPrice() {
            return komSneakers * sneakersPrice;
        }
    }
}
