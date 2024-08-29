import java.util.ArrayList;
import java.lang.Number;
import java.math.BigInteger;
/**
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. 
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant 
 * numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two 
 * abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest 
 * number that cannot be expressed as the sum of two abundant numbers is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 * 
 * @author Grace Kasper 
 * @version Start: 17 February 2017 End:18 February 2017
 */
public class Euler23
{
    public static ArrayList<Integer> allAbundantNums(int lowerbound, int upperbound)
    {
        int sum = 0;
        ArrayList<Integer> range = new ArrayList<Integer>();
        for(int j = lowerbound; j<=upperbound; j++)
        {
            for(int i = 1; i<=j/2; i++)
            {
                if(j%i==0)
                {
                    sum += i;
                }
            }
            
            if(sum>j)//abundant
                range.add(j);
            
            //System.out.println("Number: " + j + " Sum: " + sum);    
            sum = 0;
        }
        return range;
    }
    
    public static void main(int lowerbound, int upperbound)
    {
        //ArrayList<Integer> numNotOfTwoAbundant = new ArrayList<Integer>();
        ArrayList<Integer> abundantNums = new ArrayList<Integer>();
        abundantNums = Euler23.allAbundantNums(lowerbound, upperbound);
        BigInteger sums = new BigInteger("0");
        for (int num = lowerbound; num<=upperbound; num++)
        {
            boolean add = true;
            for(int in1 = 0; in1 <abundantNums.size();in1++)
            {
                for(int in2 = 0; in2<abundantNums.size(); in2++)
                {
                    if( (abundantNums.get(in1)+abundantNums.get(in2)) == num)
                    {
                        add = false;
                        System.out.println("Sum of Two Abundant Numbers: " + num);
                        in2 = abundantNums.size();
                        in1 = in2;
                    }
                }
            }
            if(add)
            {
                sums = sums.add(BigInteger.valueOf(num));
            }
        }
        
        System.out.println(sums);
    }
}
