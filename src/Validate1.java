import java.util.Scanner;

public class Validate1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month as an integer (1=Jan, 2=Feb, etc...): ");
        int month = in.nextInt();

        if (month > 0 && month < 13)
        {
            System.out.println(month + " is a valid month");
        }
        else
        {
            System.out.println(month + " is not a valid month");
        }

    }
}
