package pckg_vj5;

import java.util.Scanner;

public class ClientApp {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Customer customer = new Customer("CUSTOMER_A");
        Paket pckg = new Paket("WEB-11", customer,"Zadar", sc);
        pckg.putContent();
        pckg.calculateTotalPackagePrice();
        pckg.packageInfo();
    }
}
