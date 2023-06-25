import java.util.Scanner;

public class Countdown {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer ");
        int n = in.nextInt();

        for (int i=n; i >= 0; i--)
            System.out.print(i + "...");
        System.out.print("Liftoff");
    }
}
