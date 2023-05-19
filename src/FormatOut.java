import java.util.Scanner;

public class FormatOut {
    public static void main(String[] args)
    {
        double price = 1.215962441314554;
        int quantity = 24;
        double total = 17.29;
        System.out.printf("%.2f", price); // Use printf for print formatting
        System.out.printf("%10.2f", price); // Format specifier
        System.out.println("");
        System.out.printf("Quantity: %d Total: %10.2f", quantity, total);
    }
}
