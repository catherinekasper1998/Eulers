import java.lang.Number;
import java.math.BigInteger;
/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 * 
 * @author Grace Kasper 
 * @version Begin:17 February 2017 Finish:17 February 2017
 */
public class Euler20
{
    public static BigInteger factorial(int num)
    {
        BigInteger mult = new BigInteger("1");
        for(int i = num; i>1; i--)
        {
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        System.out.println(mult);
        return mult;
    }
    
    public static void main(int num)
    {
        int sum = 0;
        String mult = "" + Euler20.factorial(num);
        for(int i = 0; i<mult.length() ;i++)
        {
            sum += Integer.parseInt(mult.substring(i,i+1));
        }
        System.out.println(sum);
    }
}
