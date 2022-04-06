/* The program asks the user for any
number of item prices and calculate and
apply a 7% sales tax then output subtotal,
tax amount, and final cost
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class SellItems {

    public static void main(String[] args) {

        //Asks user for total items to be calculated
        System.out.print("How many items do you need totaled? ");
        Scanner kb = new Scanner(System.in);
        int numberOfItems = kb.nextInt();
        double []items = new double[numberOfItems];
        double subTotal = 0, tax = 0.07;

        //Asks for prices of the amount of total items
        for (int i=0; i<items.length; i++) {
            System.out.print("Enter item #" + (i+1) +"'s price: ");
            items[i] = kb.nextDouble();
            subTotal = subTotal + items[i];
        }
        //Sets output's format to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        //Calculates total tax of items
        double totalTax = subTotal * tax;

        for(int i = 0; i < items.length; i++) {
            System.out.println(i+1 + "." + "$" + df.format(items[i]));
        }
        System.out.println("Subtotal: $" + df.format(subTotal));
        System.out.println("Tax: $" + df.format(totalTax));
        System.out.println("Grand Total: $" + df.format((subTotal + totalTax)));
        System.out.println("Have a nice day!");
    }
}
