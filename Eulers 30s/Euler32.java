import java.util.ArrayList;
/**
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 
 * 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.
 * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, 
 * multiplier, and product is 1 through 9 pandigital.
 * 
 * Find the sum of all products whose multiplicand/multiplier/product identity can be 
 * written as a 1 through 9 pandigital.
 * 
 * HINT: Some products can be obtained in more than one way so be sure to only 
 * include it once in your sum.
 * 
 * @author Grace Kasper
 * @version Start: 22 February 2017 End: 22 February 2017
 */
public class Euler32
{
    public static boolean isPandigital(String num)
    {
        if(num.length()!=9)
            return false;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int zero = 0;
        
        for(int i = 0; i<num.length(); i++)
        {
            String digit = num.substring(i,i+1);
            if(digit.equals("1"))
            { one++;}
            else if (digit.equals("2"))
            { two++;}
            else if(digit.equals("3"))
            { three++;}
            else if (digit.equals("4"))
            { four++;}
            else if(digit.equals("5"))
            { five++;}
            else if (digit.equals("6"))
            { six++;}
            else if(digit.equals("7"))
            { seven++;}
            else if (digit.equals("8"))
            { eight++;}
            else if (digit.equals("9"))
            { nine++;}
            else //digit = 0
            {zero++;}
        }
        
        if(one==1 && two==1 && three==1 && four==1 && five==1 && six==1 && seven==1 && eight==1 && nine==1 && zero==0)
            return true;
        else
            return false;
    }
    
    public static void main(int size)
    {
        ArrayList<Integer> products = new ArrayList<Integer>();
        int product = 1;
        int sum = 0;
        for(int multiplicand = 1; multiplicand<size; multiplicand++)
        {
            for(int multiplier = 1; multiplier<size; multiplier++)
            {
                product = multiplicand*multiplier;
                if(Euler32.isPandigital(""+multiplicand+""+multiplier+""+product))
                {
                    boolean add = true;
                    for(int i = 0; i<products.size(); i++)
                    {
                        if(products.get(i)==product)
                        {
                            add = false;
                        }
                    }
                    
                    if(add)
                    {
                        products.add(product);
                        System.out.println("Product: " + product + " : " + products.size() + " SUM: " + sum);
                        sum += product;
                    }
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}
