public class charName {
    public static void main(String[] args)
    {
        String name = "Harry";
        char start = name.charAt(0);
        char last = name.charAt(4);

        System.out.println(start + " " + last);

        String fullname = "HarryMorgan";
        String sub = fullname.substring(0,6);
        System.out.println(sub);

        String greeting = "Hello, World!";
        String sub1 = greeting.substring(0,5);
        System.out.println(sub1);
        String sub3 = greeting.substring(7,12);
        System.out.println(sub3);

    }
}
