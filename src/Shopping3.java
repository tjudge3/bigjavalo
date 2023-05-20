import java.util.Scanner;

/**
 *  A program to computer shipping costs.
 */

public class Shopping3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the state or province: ");
        String state = in.next();

        System.out.print("Enter the country: ");
        String country = in.next();

        double shippingCost;

        if (country.equals("USA"))
        {
            if (state.equals("AK") || state.equals("HI"))
              // See Section 3.7 for the || (or) operator
            {
                shippingCost = 10;
            }
            else
            {
                shippingCost = 5;
            }
        }
        else
        {
            shippingCost = 10;
        }

        System.out.printf("Shipping cost to %s, %s: $%.2f%n",
                state, country, shippingCost);
    }
}
