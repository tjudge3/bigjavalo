import java.util.Scanner;

public class WallArea {
    public static void main(String[] args)
    {
        // Declare a scanner
        Scanner s = new Scanner(System.in);
        //Prompt for and read the width and height
        //and the number of windows
        System.out.print("Please enter the width and height and number of windows: ");
        int width = s.nextInt();
        int height = s.nextInt();
        int windows = s.nextInt();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Windows: " + windows);

        // Computer the area of the wall without windows
        int area = width * height;
        System.out.println("Area: " + area);
    }
}
