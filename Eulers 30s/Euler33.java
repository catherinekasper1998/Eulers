import java.util.ArrayList;
/**
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician 
 * in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which 
 * is correct, is obtained by cancelling the 9s.
 * 
 * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
 * 
 * There are exactly four non-trivial examples of this type of fraction, 
 * less than one in value, and containing two digits in the numerator and denominator.
 * 
 * If the product of these four fractions is given in its lowest common terms, 
 * find the value of the denominator.
 * 
 * @author Grace Kasoer 
 * @version Start: 22 February 2017
 */
public class Euler33
{
    public static int nonTrivialFractions(int numerator, int denominator)
    {
        String numer = "" + numerator;
        String denom = "" + denominator;
        double mainFraction = numerator*(1.0)/denominator;
        double fraction = 0.0;
        //ArrayList<Integer> denominators = new ArrayList<Integer>();
        if(numerator%10==0 && denominator%10==0)
        { return -1;}
        else
        {
            if(numer.substring(0,1).equals(denom.substring(0,1)))
            {
                fraction = Integer.parseInt(numer.substring(1))*1.0/Integer.parseInt(denom.substring(1));
                if(fraction==mainFraction)
                {
                    System.out.println("1) "+numerator+"/"+denominator+" OR "+numer.substring(1)+"/"+denom.substring(1));
                    return (Euler33.lowestCommonDenominator(numerator, denominator));
                    //System.out.println("1) "+numerator+"/"+denominator+" OR "+numer.substring(1)+"/"+denom.substring(1));
                }
            }
            else if(numer.substring(0,1).equals(denom.substring(1)))
            {
                fraction = Integer.parseInt(numer.substring(1))*1.0/Integer.parseInt(denom.substring(0,1));
                if(fraction==mainFraction)
                {
                    System.out.println("2) "+numerator+"/"+denominator+" OR "+numer.substring(1)+"/"+denom.substring(0,1));
                    return (Euler33.lowestCommonDenominator(numerator, denominator));
                    //System.out.println("2) "+numerator+"/"+denominator+" OR "+numer.substring(1)+"/"+denom.substring(0,1));
                }
            }
            else if(numer.substring(1).equals(denom.substring(0,1)))
            {
                fraction = Integer.parseInt(numer.substring(0,1))*1.0/Integer.parseInt(denom.substring(1));
                if(fraction==mainFraction)
                {
                    System.out.println("3) "+numerator+"/"+denominator+" OR "+numer.substring(0,1)+"/"+denom.substring(1));
                    return (Euler33.lowestCommonDenominator(numerator,denominator));
                    //System.out.println("3) "+numerator+"/"+denominator+" OR "+numer.substring(0,1)+"/"+denom.substring(1));
                }
            }
            else if(numer.substring(1).equals(denom.substring(1)))
            {
                fraction = Integer.parseInt(numer.substring(0,1))*1.0/Integer.parseInt(denom.substring(0,1));
                if(fraction==mainFraction)
                {
                    System.out.println("4) "+numerator+"/"+denominator+" OR "+numer.substring(0,1)+"/"+denom.substring(0,1));
                    return (Euler33.lowestCommonDenominator(numerator, denominator));
                    //System.out.println("4) "+numerator+"/"+denominator+" OR "+numer.substring(0,1)+"/"+denom.substring(0,1));
                }
            }
            else
                return -1;
        }
        return -1;
    }

    public static int lowestCommonDenominator(int numerator, int denominator)
    {
        double value = numerator*1.0/denominator;
        for(int i = 1; i<=denominator; i++)
        {
            if( (value*i) % 1 == 0)
            {
                System.out.println("LCD: "+i);
                return i;
            }
        }
        return -1;
    }

    public static void main()
    {
        ArrayList<Integer> denominators = new ArrayList<Integer>();
        ArrayList<Integer> factorsOfDenominators = new ArrayList<Integer>();

        for(int den = 10; den<100; den++)
        {
            for(int num = 10; num<den; num++)
            {
                if(Euler33.nonTrivialFractions(num, den)!=-1)
                    denominators.add(Euler33.nonTrivialFractions(num,den));
            }
        }

        for(int i=0; i<denominators.size(); i++)
        {
            int val = denominators.get(i);
            System.out.println("Index: " + i + " Value: " + val);
            for(int j=2; j<=val; j++)
            {
                if( (val*1.0/j) % 1 == 0)
                {
                    boolean add = true;
                    for(int k =0; k<factorsOfDenominators.size();k++)
                    {
                        if(factorsOfDenominators.get(k)==j || factorsOfDenominators.get(k)%j == 0 || j%factorsOfDenominators.get(k)==0)
                        {
                            k=factorsOfDenominators.size();
                            add = false;
                        }
                    }
                    if(add)
                    {
                        factorsOfDenominators.add(j);
                        System.out.println("LCD? " + j);
                    }
                }
            }
            int lcd = 1;
            for(int l = 0; l<factorsOfDenominators.size(); l++)
            {
                lcd *= factorsOfDenominators.get(l);
            }
            System.out.println("LCD: " + lcd);
        }
    }
}
