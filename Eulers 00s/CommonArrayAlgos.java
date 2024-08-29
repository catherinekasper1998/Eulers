
/**
 * Write a description of class CommonArrayAlgos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CommonArrayAlgos
{public class CommonArrayAlgorithms
{
    private int[] elements = {2, 4, -3, 0, 7};

    public CommonArrayAlgorithms(int[] userArray)
    {
        elements = userArray;
    }

    public int totalSum(int[] arr)
    {
        int sum = 0;
        for (int y:arr)
        {
            sum = sum + y;
        }
        return sum;
    }
    
    public int countTotal(int[] arr)
    {
        int numEl = 0;
        for (int y: arr)
        {
            numEl = numEl+ 1;
        }
        return numEl;
    }

    public double getAverage(int[] arr)
    {
        int sum = this.totalSum(arr);
        int totalNum = this.countTotal(arr);
        return ((sum *(1.0))/totalNum);
    }

    public int howManyTruths(boolean[] arr)
    {
        int totTrue = 0;
        for (boolean y:arr)
        {
            if (y == true)
            {
                totTrue = totTrue+ 1;
            }
        }
        return totTrue;
    }

    public int wordCount(String[] arr, String b)
    {
        int matches = 0;
        for (String y: arr)
        {
            if(y==b)
            {
                matches = matches + 1;
            }
        }
        return matches;
    }

    public int startsWithAVowel(String[] arr)
    {
        int matches = 0;
        for (String y:arr)
        {
            String a = y.substring (0,1);
            if (a == "a"|| a == "e"|| a=="o" || a=="i"|| a=="u")
            {
                matches = matches +1;
            }
        }
        /*
        for(int a = 0; a < arr.length; a++)
        {
            String b = arr[a];
            String c = b.substring(0,1);
            if (c == "a"|| c == "e"|| c=="o" || c=="i"|| c=="u")
            {
                matches ++;
            }
        }
        */
        return matches;
    }

    public double getMin(double[] arr)
    {
        double min = arr[1];
        for (double y:arr)
        {
            if (y<min)
            {
                min = y;
            }
        }
        return min;
    }

    public int getMax(int[] arr)
    {
        int max = arr[1];
        for (int y:arr)
        {
            if (y>max)
            {
                max = y;
            }
        }
        return max;
    }
   
    public void print (int[] arrInt, String[] arrStr, double[] arrDoub, boolean[] arrBoo, String b)
    {
        System.out.println("totalSum: " + this.totalSum(arrInt));
        System.out.println("countTotal: " + this.countTotal(arrInt));
        System.out.println("getAverage: " + this.getAverage(arrInt));
        System.out.println("howManyTruths: " + this.howManyTruths(arrBoo));
        System.out.println("wordCount: " + this.wordCount(arrStr, b));
        System.out.println("startsWithAVowel: " + this.startsWithAVowel(arrStr));
        System.out.println("getMin: " + this.getMin(arrDoub));
        System.out.println("getMax: " + this.getMax(arrInt));
    }
    
    public String deFront(String str) 
    {    
        if( str.length()>0)
        {
            String a = str.substring(0,1);
            if(a.compareTo("a")==0)
            {
                if(str.length()>1)
                {
                    String b = str.substring(1,2);
                    if(b.compareTo("b")==0)
                    return str;
                    else
                    return str.substring(0,1) + str.substring(2);
                }
                else 
                return "";
            }
            else
            {
                if(str.length()>1)
                {
                    String b = str.substring(1,2);
                    if(b.compareTo("b")==0)
                    return str;
                    else
                    return str.substring(0,1) + str.substring(2);
                }
                else 
                return "";
            }
        }
        else
        {
            return str;
        }
    }
}

    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CommonArrayAlgos
     */
    public CommonArrayAlgos()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
