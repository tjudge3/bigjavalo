import java.util.Scanner;

public class FizzBuzz1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number (eg 100): ");
        int n = in.nextInt();
        if(n % 3 == 0 && n % 15 !=0 )
        {
            System.out.println("fizz");
        }
        if( n % 5 == 0 && n % 15 !=0 )
        {
            System.out.println("buzz");
        }
        if( n % 3 == 0 && n % 5 == 0)
        {
            System.out.println("fizzbuzz");
        }
        if(n % 3 != 0 && n % 5 != 0)
        {
            System.out.println(n);
        }
    }
}
