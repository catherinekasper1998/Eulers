/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * @author Grace Kasper 
 * @version Start:17 February 2017 Finish: 
 */
public class Euler21
{
    public static boolean amicableDivisors(int num)
    {
        //int divL = 0;
        //int divB = 0;
        int sum1 = 0;
        for(int i = 1; i<=num/2; i++)
        {
            if(num%i==0)
            {
                sum1 += i;
            }
        }
        //return sum;
        int sum2 = 0;
        for(int i = 1; i<=sum1/2; i++)
        {
            if(sum1%i==0)
            {
                sum2 += i;
            }
        }
        boolean amicable = false;
        if(sum2==num&&sum1!=num)
        {
            amicable = true;
            System.out.println(num + " : " + sum1 + " : " + sum2 + "   " + amicable);
        }
        return amicable;
    }
    
    public static void main(int value)
    {
        //int num = Euler21.amicableDivisors(value);
        int sum = 0;
        for(int i = 219; i<value; i++) //I start at 220 because 220 is teh smallest amicable number (thanks google)
        {
            if(Euler21.amicableDivisors(i))
            {
                sum += i;
            }
        }
        System.out.println("Final Sum: " + sum);
    }
}
