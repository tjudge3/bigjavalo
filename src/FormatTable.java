import java.util.Scanner;

public class FormatTable {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Unit price: "); // 19.95, 249.97,0.009
        double price = in.nextDouble();

        System.out.println("Quantity     Price");
        int quantity = 1;
        System.out.printf("%8d%10.2f", quantity, quantity * price);
        quantity = 12;
        System.out.printf("%n%8d%10.2f", quantity, quantity * price);
        quantity = 100;
        System.out.printf("%n%8d%10.2f", quantity, quantity * price);
    }
}
