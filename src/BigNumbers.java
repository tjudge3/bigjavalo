import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args)
    {
        BigInteger oneHundred = new BigInteger("100");
        BigInteger fiftyMillion = new BigInteger("50000000");
        System.out.println(oneHundred.multiply(fiftyMillion)); // Prints 5000000000

        BigDecimal price = new BigDecimal("4.35");
        BigDecimal quantity = new BigDecimal("100");
        BigDecimal total = price.multiply(quantity);
        System.out.println(total); // Prints 435.00
    }
}
