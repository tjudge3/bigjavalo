import java.util.Scanner;
/**
 * Program to simulate the skipping of the 13th floor
*/
public class IfStates {
    public static void main(String[] args)
    {
        int actualFloor;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a floor: ");
        int floor = in.nextInt();
        if (floor > 13)
        {
            actualFloor = floor - 1;
        }
        else
        {
            actualFloor = floor;
        }
        System.out.println("The actual floor is: " + actualFloor);
    }
}
