import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = in.nextInt();
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;
        if (fizz && !buzz)
        {
            System.out.println("fizz");
        }
        else if (buzz && ! fizz)
        {
            System.out.print("buzz");
        }
        else if (fizz && buzz)
        {
            System.out.print("fizzbuzz");
        }
        else
        {
            System.out.print(n);
        }
        System.out.println();
    }
}
