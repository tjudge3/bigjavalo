import java.util.Scanner;

public class PieSale {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Original Price: ");
        double price = in.nextDouble();
        double discountedPrice;

        if (price >= 10)
        {
            discountedPrice = price - 3.14;
        }
        else
        {
            discountedPrice = price - 1.00;
        }

        System.out.printf("Discounted price: %.2f\n", discountedPrice);
    }
}
