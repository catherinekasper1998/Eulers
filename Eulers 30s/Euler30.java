/**
 * Surprisingly there are only three numbers that can be written as the 
 * sum of fourth powers of their digits:
 * 
 * 1634 = 14 + 64 + 34 + 44
 * 8208 = 84 + 24 + 04 + 84
 * 9474 = 94 + 44 + 74 + 44
 * 
 * As 1 = 14 is not a sum it is not included.
 * 
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * 
 * Find the sum of all the numbers that can be written as the sum of fifth
 * powers of their digits.
 * 
 * @author Grace Kasper 
 * @version Start: 21 February 2017 End: 21 February 2017
 */
public class Euler30
{
    public static boolean getSumOfNums(int num, int power)
    {
        String num2 = "" + num;
        int sum = 0;
        for(int i = 0; i<num2.length(); i++)
        {
            int val = Integer.parseInt(num2.substring(i,i+1));
            sum += (int)Math.pow(val*1.0, power*1.0);
        }
        if(sum==num)
            return true;
        return false;
    }
    
    public static void main(int power, int max)
    {
        int sum = 0;
        for(int i = 2; i<=max; i++)
        {
            if(Euler30.getSumOfNums(i, power))
            {
                sum += i;
                System.out.println("Number: " + i + " Sum: " + sum);
            }
        }
        System.out.println("SUM: " + sum);
    }
}
