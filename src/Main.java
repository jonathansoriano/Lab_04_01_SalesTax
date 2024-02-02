public class Main {
    public static void main(String [] args)
    {
        double salesTax = .05;
        double itemPrice = 10.50;
        double tax = 0.0;

        tax = itemPrice * salesTax;


        System.out.println("The sales tax for the item is " + tax + " and the price of the item is " + itemPrice);
    }
}