import java.util.Scanner;

/**
 * The program simulates an elevator panel that skips the 13th floor,
 * checking for input errors
 */
public class ElevatorSimulator2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        if (in.hasNextInt())
        {
            // We know an integer was entered so we proceed here
            int floor = in.nextInt();

            if (floor == 13)
            {
                // Boo! Spooky! They enter floor 13 in search of ghosts and there is no floor 13
                System.out.println("Error there is no thirteenth floor.");
            }
            else if (floor <= 0 || floor > 20)
            {
                // Danger will Robison - They entered an int outside our range
                System.out.println("Error the floor must be between 1 and 20");
            }
            else
            {
                // We have now validated the input so we can proceed
                int actualFloor = floor;
                if (floor > 13)
                {
                    actualFloor = floor - 1;
                }

                System.out.println("The elevator will travel to the actual floor"
                        + actualFloor);
            }
        }
        else
        {
            // I'm sorry Hal, I'm afraid I can't do that - they entered something that wasn't an integer
            System.out.println("Error: Not an integer");
        }
    }
}
