import java.util.Scanner;

public class InandOut {
    public static void main(String[] args)
    {
        System.out.print("Please enter the number of bottles: "); // Display prompt
        Scanner in = new Scanner(System.in);
        int bottles = in.nextInt();

        System.out.print("Enter price: ");
        double price = in.nextDouble();
    }
}
