import java.util.Scanner;

public class Countdown {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer ");
        int n = in.nextInt();

        for (n=n; n >= 0; n--)
            System.out.print(n + "...");
        System.out.print("Liftoff");
    }
}
