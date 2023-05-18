public class PiggyBank {
    public static void main(String[] args)
    {
        int pennies = 1729;
        int dollars = pennies / 100;
        int cents = pennies % 100;
        System.out.print("Dollars: ");
        System.out.println(dollars);
        System.out.print("Cents: ");
        System.out.println(cents);
    }
}
