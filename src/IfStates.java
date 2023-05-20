import java.util.Scanner;

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
        System.out.println(actualFloor);
    }
}
