public class Main {
    public static void main(String [] args)
    {
        double SALES_TAX = .05;
        double itemPrice = 10.50;
        double tax = 0.0;
        double totalPrice = 0;


        tax = itemPrice * SALES_TAX;
        totalPrice = tax + itemPrice;


        System.out.println("The sales tax for the item is " + tax + " and the price of the item is " + itemPrice);
        System.out.println("The total price is " + totalPrice);
    }
}