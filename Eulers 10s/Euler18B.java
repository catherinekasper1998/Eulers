/**
 * Using this to test for Euler 18. I want to build a "simpler" recursive method that works for the example set,
 * which is 4 rows in total and 4 rows across the bottom
 *
 * @Grace Kasper
 * @Started: 30 May 2017 Ended:1 June 2017
 */
public class Euler18B
{
    private int[][] pyr;
    private int highestSum = 0;
    private int sum;

    public Euler18B()
    {
        pyr = new int[15][15]; //CHANGE
        String pyramidString = "75 "+
        "95 64 "+
        "17 47 82 "+
        "18 35 87 10 "+
        "20 04 82 47 65 "+
        "19 01 23 75 03 34 "+
        "88 02 77 73 07 63 67 "+
        "99 65 04 28 06 16 70 92 "+
        "41 41 26 56 83 40 80 70 33 "+
        "41 48 72 33 47 32 37 16 94 29 "+
        "53 71 44 65 25 43 91 52 97 51 14 "+
        "70 11 33 28 77 73 17 78 39 68 17 57 "+
        "91 71 52 38 17 14 91 43 58 50 27 29 48 "+
        "63 66 04 68 89 53 67 30 73 16 69 87 40 31 "+
        "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23 ";
        int row = 0;
        int column = 0;
        for(int i=0; i<pyramidString.length(); i+=3)//CHANGE
        {
            pyr[row][column] = Integer.parseInt(pyramidString.substring(i, i+2));//CHANGE
            column++;
            if(column > row )
            {
                row++;
                column = 0;
            }
        }
    }
    
    public void sums(int row, int col)
    {   
        if(row==15) //CHANGE
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
