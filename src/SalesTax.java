//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalesTax {
    public static void main(String[] args) {

        // I declared one variable and the tax rate as a constant in order to multiply them for the sales tax
        double purchasePrice = 19.99;
        double TAX_RATE = .05;

        // Outputed the purchase price and then multiplied the price and tax rate to get the sales tax
        System.out.println("The price of the purchase is " + purchasePrice + ".");
        System.out.println("A 5% sales tax on the price is " + purchasePrice * TAX_RATE + ".");
    }
}