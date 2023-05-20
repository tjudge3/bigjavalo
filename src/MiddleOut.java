import java.util.Scanner;

public class MiddleOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.next();

        int position;
        int length;
        int totalLength = str.length();
        String eyo;

        if (str.length() % 2 == 1)
        {
            position = str.length() / 2;
            length = 1;
            eyo = "Odd";
        }
        else
        {
            position = str.length() / 2 - 1;
            length = 2;
            eyo = "Even";
        }
        String result = str.substring(position, position + length);

        System.out.println("Length of string: " + totalLength + "\n" + "Even or Odd: " + eyo + "\n" +"Middle: " + result);
    }
}
