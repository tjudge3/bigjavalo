import java.util.Scanner;

/**
 * Reads a word and says whether
 * A) it is short (fewer than 5 letters)
 * B) it is long (at least 10 letters)
 * C) it ends with the letter y
 */


public class WordProperties {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
//        int cword = word.length();
//        String fletter = word.substring(word.length()- 1);

        if(word.length() < 5)
        {
            System.out.println(word + " is short");
        }

        if(word.length() > 10)
        {
            System.out.println(word + " is long");
        }

        if(word.endsWith("y"))
        {
            System.out.println(word + " ends in a y");
        }
    }
}
