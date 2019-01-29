import java.util.* ;
public class CustomerRecord {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Customer name: ");
        String cusName = keyboard.next();

        System.out.println("Enter Tax Code (0, 1, 2, 3) ");
        int tax = keyboard.nextInt();

        System.out.println("Enter Purchase Amount: ");
        float purAmt = keyboard.nextFloat();


        if (tax == 0){
            double taxCode = .00;
            double salesTax = (purAmt) * (taxCode);
            double total = (salesTax) + (purAmt);
            System.out.println("Customer: " + cusName);
            System.out.println("Purchase Amount: " + purAmt);
            System.out.println("Sales Tax: " + salesTax);
            System.out.println("Total: " + total);
        } else if (tax == 1){
            double taxCode = .03;
            double salesTax = (purAmt) * (taxCode);
            double total = (salesTax) + (purAmt);
            System.out.println("Customer: " + cusName);
            System.out.println("Purchase Amount: " + purAmt);
            System.out.println("Sales Tax: " + salesTax);
            System.out.println("Total: " + total);
        } else if (tax == 2){
            double taxCode = .05;
            double salesTax = (purAmt) * (taxCode);
            double total = (salesTax) + (purAmt);
            System.out.println("Customer: " + cusName);
            System.out.println("Purchase Amount: " + purAmt);
            System.out.println("Sales Tax: " + salesTax);
            System.out.println("Total: " + total);
        } else if (tax == 3){
            double taxCode = .07;
            double salesTax = (purAmt) * (taxCode);
            double total = (salesTax) + (purAmt);
            System.out.println("Customer: " + cusName);
            System.out.println("Purchase Amount: " + purAmt);
            System.out.println("Sales Tax: " + salesTax);
            System.out.println("Total: " + total);
        }
    }
}
