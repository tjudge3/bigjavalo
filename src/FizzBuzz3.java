public class FizzBuzz3 {
    public static void main(String[] args)
    {
        int n;
        for(n=1; n<=100; n++)
        {
            if (n%3==0 && n%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if (n%5==0)
            {
                System.out.println("Buzz");
            }
            else if (n%3==0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(n);
            }
        }
    }




}
