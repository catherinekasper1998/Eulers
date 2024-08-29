import java.lang.Number;
import java.math.BigInteger;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 * 
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 * 
 * F1 = 1 
 * F2 = 1 
 * F3 = 2 
 * F4 = 3 
 * F5 = 5 
 * F6 = 8 
 * F7 = 13 
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * 
 * The 12th term, F12, is the first term to contain three digits.
 * 
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * @author Grace Kasper
 * @version Begin: 19 February 2017 End: 19 February 2017
 */
public class Euler25
{
    public static void main(int lengthOfNum)
    {
        int index = 0;
        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        BigInteger f3 = new BigInteger("2");
        index = 1;
        BigInteger num = new BigInteger("10");
        while(f1.compareTo(num.pow(lengthOfNum-1)) <0)
        {
            f3 = f2.add(f1);
            f1 = f2;
            f2 = f3;
            index++;
            System.out.println("MAIN: " + f1 + " : " + index);
        }
        System.out.println("Index : " + index);
    }
}
