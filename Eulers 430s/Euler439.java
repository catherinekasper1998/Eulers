import java.lang.Number;
import java.math.BigInteger;
import java.math.BigDecimal;
/**
 * Write a description of class Euler439 here.
 * 
 * @author Grace Kasper
 * @version 4 March 2017
 */
public class Euler439
{
    // check one: works
    // check two : works
    // check three: 
    // function: 
    public static void euler439(int n, int f)
    {
          System.out.println(Euler439.sIsWhat((int)Math.pow(10,n)) % (int)(Math.pow(10,f)));
    }
    
    public static long sumOfDivisors(int num)
    {
        if (num==1)
        {
            return 1;
        }
        long sums =0;
        double halfway = num/2.0;
        for(int i=1; i<= halfway;i++)
        {
            if(num%i==0)
            {
                if (i == (num/i))
                {
                    sums += i;
                }
                else if(i < (num/i))
                {
                    sums += (long)i;
                    sums += (long)(num/i);
                }
            }
        }
        return sums;
    }
    
    public static long sIsWhat(int k)
    {
        long sums = 0;
        for(int i = 1; i<=k;i++)
        {
            for(int j=1 ; j<=k ; j++)
            {
                sums += sumOfDivisors(i*j);
                //System.out.println("d(" + i*j + ")" + " : " + sumOfDivisors(i*j));
            }
            System.out.println(i);
        }
        return sums;
    }
    
    public static void euler439new(int n, int f)
    {
        BigInteger base = new BigInteger("10");
        System.out.println(Euler439.sIsWhat(base.modPow(BigInteger.valueOf(n), base.pow(f))));
    }
    
    public static BigInteger sumOfDivisors(BigInteger num)//BIG INTEGER
    {
        if (num.equals(BigInteger.valueOf(1)))
            return BigInteger.valueOf(1);
            
        BigInteger sums = new BigInteger("0");
        BigInteger halfway = new BigInteger("1");
        
        if( num.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)))
            halfway = num.divide(BigInteger.valueOf(2));
        else 
            halfway = num.divide(BigInteger.valueOf(2)).add(BigInteger.valueOf(1));
        
        for(BigInteger i= new BigInteger("1");i.compareTo(halfway)<=0;i=i.add(BigInteger.valueOf(1)))
        {
            if(num.mod(i).equals(BigInteger.valueOf(0)) )
            {
                if (i.equals(num.divide(i)))
                {
                    sums = sums.add(i);
                }
                else if(i.compareTo(num.divide(i))<0)
                {
                    sums = sums.add(i);
                    sums = sums.add(num.divide(i));
                }
            }
        }
        
        return sums;
    }
    
    public static BigInteger sIsWhat(BigInteger k)
    {
        BigInteger sums = new BigInteger("0");
        for(BigInteger i = new BigInteger("1"); k.compareTo(i)>=0;i =i.add(BigInteger.valueOf(1)))
        {
            for(BigInteger j=new BigInteger("1") ; k.compareTo(j)>= 0; j=j.add(BigInteger.valueOf(1)))
            {
                sums= sumOfDivisors(i.multiply(j));
                //System.out.println("d(" + i*j + ")" + " : " + sumOfDivisors(i*j));
            }
            System.out.println(i);
        }
        return sums;
    }
}
