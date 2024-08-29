import java.lang.Number;
import java.math.BigInteger;
/**
 * Same method is in the CommonArrayAlgorithms Project in the FibonacciNumber Class.
 * 
 * @Grace Kasper 
 * @16 December 2016
 */
public class Euler8
{
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
}
