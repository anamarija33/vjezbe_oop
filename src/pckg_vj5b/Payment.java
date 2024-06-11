package pckg_vj5b;

import java.util.Scanner;

public class Payment {
    Scanner scanner = new Scanner(System.in);

    private void possiblePaymentMethods(){
        System.out.println("Possible payment methods are: ");
        System.out.println("1. Credit card");
        System.out.println("2. PayPal");
        System.out.println("3. Bank transfer");
    }
    void payPackage(Package packageToPay){
        possiblePaymentMethods();
        System.out.println("Enter the number of the payment method you want to use: ");
        int paymentMethod = scanner.nextInt();
        switch (paymentMethod){
            case 1:
                System.out.println("You have chosen to pay with credit card.");
                break;
            case 2:
                System.out.println("You have chosen to pay with PayPal.");
                break;
            case 3:
                System.out.println("You have chosen to pay with bank transfer.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
