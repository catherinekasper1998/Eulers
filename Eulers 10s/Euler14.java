/**
 * Write a description of class Euler14 here.
 * 
 * @Grace Kasper
 * @21 November 2016
 */
public class Euler14
{
    public static void hereIGoAgain()
    {
        //get a starting number 2 to 1,000,000
        int steps = 0;
        int longestChain = 0;
        long numOfLongestChain = 0;
        long n = 0;
        int numOfThis = 0;
        for(int i = 2; i<1000000; i++)
        {
            n = i;
            numOfThis = i;
            //System.out.println(numOfThis + "    " + numOfThis + "    " + numOfThis);
            //run through that number's Collatz sequence = so when a number hits 1 
            // or the numbers become negative?
            //measure the chain length
            while (n != 1 && n>0)
            {
                if ((n%2)==0)
                {
                    n = (n/2);
                }
                else
                {
                    n = (3*n) + 1;
                }
                steps ++;
                //System.out.println(steps + " : " + n);
            }
            
            //if bigger than the last, save that satrting number as teh best
            //System.out.println(numOfThis + " : "+ steps);
            if (steps >= longestChain)
            {
                longestChain = steps;
                numOfLongestChain = numOfThis;
                //System.out.println(numOfLongestChain +" : " + longestChain);
            }
            steps = 1;
        }
        
        //print out the answer
        //System.out.println(numOfLongestChain +" : " + longestChain);
        System.out.println(numOfLongestChain + " has the most steps with " + longestChain + " steps." );
    }
}
