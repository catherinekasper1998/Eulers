import java.lang.Number;
import java.math.BigInteger;
/**
 * Starting with the number 1 and moving to the right in a clockwise direction a 
 * 5 by 5 spiral is formed as follows:
 * 
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral 
 * formed in the same way?
 * 
 * @author Grace Kasper 
 * @version (a version number or a date)
 */
public class Euler28
{
    public static void main(int size)
    {
        int counterOfSize = 2;
        BigInteger sum = new BigInteger("1");
        int num = 1;
        while(counterOfSize<=size)
        {
            for(int i = 0; i<4; i++)
            {
                num += counterOfSize;
                sum = sum.add(BigInteger.valueOf(num));
                System.out.println("Num: " + num + " Sum: " + sum);
            }
            counterOfSize+=2;
        }
        System.out.println(sum);
    }
}
