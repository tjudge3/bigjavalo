public class ForLoopExplained {
    public static void main(String[] args)
    {
        int counter = 1; // Initialize the counter
        while (counter <= 10) // Check the counter
        {
            System.out.println(counter);
            counter++; // Update the counter
        }
    }
    // ABOVE is the same as BELOW
    public static void below(String[] args)
    {

        for (int counter = 1; counter <=10; counter++)
        {
            System.out.println(counter);
        }
    }



}
