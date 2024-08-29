 import java.lang.Number;
import java.math.BigInteger;
/**
 * Write a description of class FibonacciNumber here.
 * I am using this as a collection of all my code to solve the first ten Euler problems
 * @GraceKasper
 * @1November2016
 */

public class FibonacciNumber
{
    public static void euler1(int a)
    {
        int b = 1;
        int sum = 0;
        while (b<a)
        {
            if ((b %3 ==0) || (b%5 ==0))
            {
                sum = sum + b;
            }
            b = b + 1;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
    
    public void euler2()
    {
        int a = 1;
        int b = 1;
        int sum = 0;
        while (a < 4000000 && b < 4000000)
        {
            a = a +b;
            if (a%2 == 0)
            {
                sum = sum + a;
            }
            
            b = b +a;
            if(b%2 ==0)
            {
                sum =sum +b;
            }
        }
        System.out.println(sum);
    }
    
    public static boolean isPrime(int x)
    {
        int a = 3;
        if (x == 2)
        {
            return true;
        }
        else if (x%2 == 0)
        {
            return false;
        }
        else 
        {
            while ( a < x/2)
            {
                if (x%a == 0)
                {
                    return false;
                }
                a = a +2;
            }
            return true;
        }
    }
    

    public static void euler3LargestPrimeNumber(long x)
    {
        int a = 1;
        while ( a < x && a > 0)
        {
            if (x%a == 0 )
            {
                if (FibonacciNumber.isPrime(a))
                {
                    System.out.println(a);
                }
            }
            a = a + 1;
        }
    }

    public static boolean isPalindromeNum(int y)
    {
        int a = y%10;
        int b = (y/10)%10;
        int c = (y/100)%10;
        int d = (y/1000)%10;
        int e = (y/10000)%10;
        int f = (y/100000);
        int g = f + (10 * e) + (100 * d) + (1000 * c) + (10000 * b) + (100000 * a);
        if ( y == g)
        {
            return true;
        }
        else 
        {
            return false;
        }        
    }

    public static int largestPalindrome2(int d)
    {
        int a = d;
        int b = 100;
        int c = a * b;
        while ((int)(Math.log10(b)+1)==3 )
        {
             if (FibonacciNumber.isPalindromeNum(c))
             {
                return c;
             }
             b = b + 1;
             c = a * b;
        }
        return 0;
    }
    
    public static void euler4()
    {
        int a = 100;
        while ( (int)(Math.log10(a)+1) == 3)
        {
            if (FibonacciNumber.largestPalindrome2(a) != 0)
            {
                System.out.println(FibonacciNumber.largestPalindrome2(a));
            }
            a = a + 1;
        }
    }
    
    public static boolean isDivisible(int y, int x)
    {
        int a = 3;
        if ( y%2 != 0)
        {
            return false;
        }
        else
        {
            while (a <= x)
            {
                if ( y%a != 0)
                {
                    return false;
                }
                a = a + 1;
            }
            return true;
        }
    }
    
    public static void smallestNumber(int x)
    {
        int a = 1000000000;
        while (a >= x)
        {
            if (FibonacciNumber.isDivisible(a , x))
            {
                System.out.println(a);
            }
            a = a - 2;
        }
    }

    public static void primesBelow(int x)
    {
        int a = 2;
        long sums = 0;
        while ( a < x )
        {
            if (FibonacciNumber.isPrime(a))
            {
                sums = sums + a;
                System.out.println(a);
            }
            a = a + 1;
        }
        System.out.println(sums);
    }

    public static double sumSquareOfFirstNatural(int x)
    {
        int runs = 0;
        double sums = 0;
        int y = 1;
        while (runs < x)
        {
            sums = sums + Math.pow(y,2);
            runs = runs + 1;
            y = y + 1;
        }
        return sums;
    }

    public static long squareSumOfFirstNatural(int x)
    {
        int runs = 0;
        int sums = 0;
        int y = 1;
        while (runs < x)
        {
            sums = sums + y;
            runs = runs + 1;
            y = y + 1;
        }
        return (long)(Math.pow(sums, 2));
    }

    public static void euler6(int y)
    {
        System.out.println((int)(FibonacciNumber.sumSquareOfFirstNatural(y)));
        System.out.println(FibonacciNumber.squareSumOfFirstNatural(y));
        System.out.println((FibonacciNumber.squareSumOfFirstNatural(y)) - 
        (int)(FibonacciNumber.sumSquareOfFirstNatural(y)));
    } 

    public static void euler7(int x)
    {
        int sums = 0;
        int y = 1;
        int prime = 2;
        while (sums < (x-1))
        {
            if(FibonacciNumber.isPrime(y))
            {
                System.out.println(y);
                prime = y;
                sums = sums + 1;
                y = y + 1;
            }
            y = y + 1;
        }
        System.out.println(y);
    }

    public static void largestThirteenAdjacent() 
    /*THIS ONE SUCKS!!!
     * I choose this method (the one without the charAt method becuase the charAt did not return the proper
     * number, when I ran System.out.println(y[999]); Whereas this longer method gives me the correct output.
     * And it still not function correctly. So... ugghh
     */
    {
        //Declaring a string, and assigning each individual char to an array element
        String x = "73167176531330624919225119674426574742355349194934" + 
        "96983520312774506326239578318016984801869478851843" +
        "85861560789112949495459501737958331952853208805511" + 
        "12540698747158523863050715693290963295227443043557" + 
        "66896648950445244523161731856403098711121722383113" + 
        "62229893423380308135336276614282806444486645238749" + 
        "30358907296290491560440772390713810515859307960866" + 
        "70172427121883998797908792274921901699720888093776" + 
        "65727333001053367881220235421809751254540594752243" + 
        "52584907711670556013604839586446706324415722155397" + 
        "53697817977846174064955149290862569321978468622482" + 
        "83972241375657056057490261407972968652414535100474" + 
        "82166370484403199890008895243450658541227588666881" + 
        "16427171479924442928230863465674813919123162824586" + 
        "17866458359124566529476545682848912883142607690042" + 
        "24219022671055626321111109370544217506941658960408" + 
        "07198403850962455444362981230987879927244284909188" + 
        "84580156166097919133875499200524063689912560717606" + 
        "05886116467109405077541002256983155200055935729725" + 
        "71636269561882670428252483600823257530420752963450";
        //converting the String to an array (a String array)
        //Or I could directly take the String to an int array with Char.at
        String[] y = new String[x.length()];
        //int[] y = new int[x.length()];
        for (int i = 0; i< x.length() ; i++)
        {
            //y[i] = x.charAt(i); 
            y[i] = x.substring(i, i+1);
        }
        //convert String[] to int[]
        int[] z = new int[y.length];
        for (int c = 0; c < z.length; c++)
        {
            z[c] = Integer.parseInt(y[c]);
        }
        //go through the string moving over one element at a time, 
        
        BigInteger pro = BigInteger.valueOf(1);
        BigInteger product = BigInteger.valueOf(1);
        for (int g = 0 ; g < 988; g++)
        {
            pro = (BigInteger.valueOf(z[g]*z[g+1]*z[g+2]*z[g+3]*z[g+4]*z[g+5])).multiply(BigInteger.valueOf(z[g+6]*z[g+7]*z[g+8]*z[g+9]*z[g+10]*z[g+11]*z[g+12]));
            if ( pro.compareTo(product) >0)
            {
                product = pro;
                System.out.println(product);
                //System.out.println(g);
                //System.out.println(z[g] + ", " + z[g+1] + ", "+ z[g+2]);
            }
        }
    }

    public static void pythagoreanTripletSum(double sum) //GOOD TO GO!!
    {
        int a = 1;
        int b = 1;
        double c = 1;
        while (a + b + c <= sum)
        {
            for (int d = 1 ; d <= 500; d++)
            {
                b = d;
                c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
                if (c%1 == 0)
                {
                    if (a + b + c == sum)
                    {
                        System.out.println(a* b *c);
                    }               
                }
            }
            a++;
            b = 1;
            c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        }
    }
    
    public static void Euler50BigInteger(int max)
    {
        BigInteger sum = new BigInteger("0");
        BigInteger maxSum = new BigInteger("0");
        BigInteger maxSumTotal = new BigInteger("0");
        for(int start = 0; start<max; start++)
        {
            //System.out.println("NEW");
            for(int i=start; sum.compareTo(BigInteger.valueOf(max))<0; i++)
            {
                //System.out.println(i);
                if(FibonacciNumber.isPrime(i))
                {
                    sum = sum.add(BigInteger.valueOf(i));
                    //System.out.println("Prime Number: "+ i);
                    if(FibonacciNumber.isPrime(sum))
                    {
                        System.out.println("Is Prime: " + sum);
                        maxSum = sum;
                    }
                }
            }
            
            if(maxSum.compareTo(maxSumTotal)>0 && maxSumTotal.compareTo(BigInteger.valueOf(max))>0)//when maxSum>maxSumTotal
            {
                System.out.println("NEW MAX SUM TOTAL: " + maxSum);
                maxSumTotal = maxSum;
            }
            maxSum = BigInteger.valueOf(0);
            sum = BigInteger.valueOf(0);
        }   
        System.out.println(" MAX SUM TOTAL: " + maxSumTotal);
    }
    
    public static boolean isPrime(BigInteger x)
    {
        BigInteger a = new BigInteger("3");
        if (x.equals(BigInteger.valueOf(2)))//equals 2
        {
            return true;
        }
        else if ( x.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)) )//even number
        {
            return false;
        }
        else //all odd numbers
        {
            while (a.compareTo(x.divide(BigInteger.valueOf(2)))<0)
            {
                if (x.mod(a).equals(BigInteger.valueOf(0)))
                {
                    return false;
                }
                a = a.add(BigInteger.valueOf(2));
            }
            return true;
        }
    }
    
    public static void Euler50int(int max)
    {
        int sum = 0;
        int length = 0;
        int maxLength = 0;
        int maxLengthTotal = 0;
        int maxSum = 0;
        int maxSumTotal = 0;
        for(int start = 2; start<max; start++)
        {
            //System.out.println("NEW");
            for(int i=start; sum+i<max; i++)
            {
                //System.out.println(i);
                if(FibonacciNumber.isPrime(i))
                {
                    sum += i;
                    length++;
                    //System.out.println(length);
                    //System.out.println("Prime Number: "+ i);
                    if(FibonacciNumber.isPrime(sum) && length>maxLength)
                    {
                        //System.out.println("Is Prime: " + sum);
                        maxSum = sum;
                        maxLength = length;
                        System.out.println("Max Length: " + maxLength);
                    }
                }
            }
            sum = 0;
            
            if(maxSum>maxSumTotal && maxSumTotal<max && maxLength>maxLengthTotal)
            {
                System.out.println("New Max Sum: " + maxSum);
                maxSumTotal = maxSum;
                maxLengthTotal = maxLength;
            }
            maxSum = 0;
            length = 0;
        }   
        System.out.println("MAX SUM TOTAL: " + maxSumTotal + " Max Length Total: " + maxLengthTotal);
    }
}
//Katherine P