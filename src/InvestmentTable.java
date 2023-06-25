import java.util.Scanner;

public class InvestmentTable {
    public static void main(String[] args)
    {
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;
        double balance = INITIAL_BALANCE;

        System.out.print("Enter number of years: ");
        Scanner in = new Scanner(System.in);
        int nyears = in.nextInt();

        for (int year = 1; year <= nyears; year++)
        {
            double interest = balance * RATE /100;
            balance = balance +interest;
            System.out.printf("%4d %10.2f%n", year, balance);
        }
    }
}
