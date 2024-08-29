/**
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * 
 * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
 * 
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 * 
 * @author Grace Kasper 
 * @version Start: 8 March 2017 End: 8 March 2017
 */
public class Euler34
{
    public static void main(int stop)
    {
        int sumOfCuriousNums = 0;
        int sumOfFactorials = 0;
        for(int i = 10; i<=stop; i++)
        {
            String num = i + "";
            System.out.println(i);
            for(int j = 0; j<num.length(); j++)
            {
                sumOfFactorials += Euler34.findFactorial(Integer.parseInt(num.substring(j,j+1)));
            }
            
            if(sumOfFactorials==i)
            {
                sumOfCuriousNums += i;
            }
            
            sumOfFactorials = 0;
        }
        
        System.out.println("Final: "+ sumOfCuriousNums);
    }
    
    public static int findFactorial(int num)
    {
        int mult = 1;
        
        if(num==0)
            return 1;
        else if(num != 1)
            mult = num * findFactorial(num-1);  
        else
            return 1;

        return mult;
    }
}
