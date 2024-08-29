
/**
 * Write a description of class Euler16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Euler16
{
    // instance variables - replace the example below with your own
    public static void sumOfDigits()
    {
        String hope = "" + (long)(Math.pow(2, 100));
        
        String[] hopeArr = new String[hope.length()];
        for(int i = 0; i<hope.length(); i++)
        {
            hopeArr[i] = hope.substring(i, i+1);
            System.out.println(hopeArr[i]);
        }
        
        int[] hopeIntArr = new int[hopeArr.length];
        for(int j = 0; j<hopeArr.length; j++)
        {
            hopeIntArr[j] = Integer.parseInt(hopeArr[j]);
            System.out.println(hopeIntArr[j]);
        }
        
        int sum = 0;
        for(int k = 0; k<hopeIntArr.length; k++)
        {
            sum += hopeIntArr[k];
        }
        
        System.out.println(sum);
    }
    
    
}
