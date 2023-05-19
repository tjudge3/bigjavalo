import java.util.Scanner;

public class nameCon {
    public static void main(String[] args)
    {
        String fname = "Harry";
        String lname = "Morgan";
        String name = fname + lname;
        System.out.print(name);
        System.out.println();
        String fullName = fname + " " + lname;
        System.out.print(fullName);
        System.out.println();

        String jobTitle = "Agent";
        int employeeId = 7;
        String bond = jobTitle + employeeId;
        System.out.println(bond);

        int total = 12;
        System.out.print("The total is ");
        System.out.println(total);
        System.out.println();

        System.out.println("The total is " + total);
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String cfname = in.next();
        String clname = in.next();
        System.out.println(cfname);
        System.out.println(clname);
        System.out.println();
        System.out.println(clname + "," + "" + cfname);

    }
}
