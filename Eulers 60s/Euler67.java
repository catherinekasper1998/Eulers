
/**
 * Write a description of class Euler67 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Euler67
{
    // instance variables - replace the example below with your own
    private int[][] pyr = new int[100][100];
    private int highestSum = 0;
    private int sum;
    
    public Euler67()
    {
        pyr = Euler67Help.getArray();
    }
    
    public void sums(int row, int col)
    {   
        if(row==100) //CHANGE
        {
            System.out.println("Hit Rock Bottom: " + sum);
            if(sum>highestSum)
            {
                highestSum = sum;
                System.out.println("!!!NEW HIGHEST SUM!!!");
            }
            System.out.println("Highest Sum: " + highestSum);
        }
        else if(pyr[row][col]<10) //CHANGE
        {
            row=pyr.length;
        }
        else
        {
            System.out.println("Sum: " + sum + " Num: " + pyr[row][col]);
            sum = sum + pyr[row][col]; 
            System.out.println("New Sum: " + sum);
            
            System.out.println("Moving Left");
            this.sums(row+1, col);//left
            
            System.out.println("Moving Right");
            this.sums(row+1, col+1);//right
            
            System.out.println("Moving back");
            sum = sum - pyr[row][col];
            System.out.println("HighestSum: " + highestSum);
        }
    }
}
