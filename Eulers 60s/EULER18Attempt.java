/**
 * I'm trying to be clever, by comparing the two next paths and comparing the immediate next two values.
 */
public class EULER18Attempt
{
    // instance variables - replace the example below with your own
    private int[][] pyr;
    private int highestSum = 0;
    private int sum;

    public EULER18Attempt()
    {
        pyr = new int[100][100];
        pyr = Euler67Help.getArray();
    }
    
    public void sums(int row, int col)
    {   
        if(row==99) //CHANGE
        {
            System.out.println("Hit Rock Bottom: " + sum);
            sum = sum + pyr[row][col];
            if(sum>highestSum)
            {
                highestSum = sum;
                System.out.println("!!!NEW HIGHEST SUM!!!");
            }
            System.out.println("Highest Sum: " + highestSum);
        }
        else
        {
            if(pyr[row+1][col] > pyr[row+1][col+1]) //left>right
            {
                System.out.println("Left!! " + pyr[row][col] + " to " + pyr[row+1][col]);
                sum = sum + pyr[row][col];
                this.sums(row+1, col);
            }
            else // (pyr[row+1][col] <= pyr[row+1][col+1]) right>=left
            {
                System.out.println("Right!! " + pyr[row][col] + " to " + pyr[row+1][col+1]);
                sum = sum + pyr[row][col];
                this.sums(row+1, col+1);
            }
        }
    }
}
