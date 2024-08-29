/**
 * Good morning (or night), Ms. Kasper. Your mission, should you choose to accept it:
 *   By starting at the top of the triangle below and moving to adjacent numbers on the row below, 
 *   the maximum total from top to bottom is 23.
 *          3
 *         7 4
 *        2 4 6
 *       8 5 9 3
 *   That is, 3 + 7 + 4 + 9 = 23.Find the maximum total from top to bottom of the triangle below:
 * As always, should you are any of your I.M. Force be caught of killed, the Secretary will
 * disavow any knowledge of you actions. This code will self-destruction (or probably not) in
 * five seconds (or probably never). Good luck, Grace.
 * 
 * @grace Kasper 
 * @19 December 2016
 */
public class Euler18
{
    public static void euler18()
    {
        /* to change column-major to row-major order
         *  Steps:
         *  1) all cols = ghost
         *  make sure all cols are gone
         *  2) all rows = cols
         *  make sure all rows are gone
         *  3) all ghosts = rows
         *  make sure all ghosts are gone
         *  
         *  
         *  
         *  
         *  */
        int now = 0;
        int column = 0;
        long sums = 0;
        long biggestSums = 0;
        int[][] intArr = Euler18.hereWeGo();
        int[][] heyNow = new int[16384][15];
        //Here I am "building" the array (names heyNow) that will create a path for the code to run through
        for(int ghosts = 0; ghosts < heyNow.length; ghosts++)
        {
            if (ghosts == 0)
            {
                for(int r = 14; r>=0; r--)
                {
                    heyNow[ghosts][/*columns*/] = 0;
                }
            }
            else//for every other column
            {
                for (int j = 0; j<14; j++)
                {
                    heyNow[ghosts][j] =heyNow[ghosts][j-1];
                }
                
                for(int k = 14; k>=0; k--)//filtering through a column from top to bottom
                {
                    if(heyNow[ghosts][k-1]==0)//if the digit in the box before ==0 then...
                    {
                         int stop = 0; 
                         heyNow[k][col]=1;
                         stop = k;
                         for (int i = 14; i<stop; i--)
                         {
                              heyNow[i][col] = 0;
                              //stop = i;
                              while(col<15)
                              {
                                  System.out.print (k + " : " + i);
                              }
                         }
                         k = -1;
                    }
                }
            }
        }
        
        //Just Checking the HeyNow Array
        /*for(int l = 0; l<15; l++)
        {
            for (int m = 0; m<15; m++)
            {
                System.out.print(heyNow[m][l] + "  ");
            }
            System.out.println("  ");
        }
        //Actual Program (filtering through the triangle of numbers)
        for (int runs = 0; runs < 16000; runs++)
        {
            //System.out.println(runs + " : ");
            for(int row =0; row<15; row++)
            {
                now = intArr[row][column];
                //System.out.print(now + "  ");
                if(now<10)
                    row=15;
                else if(row ==14)
                {
                    System.out.println(biggestSums + " : " + sums);
                    if (sums > biggestSums)
                        biggestSums = sums;
                    column++
                }
                else
                {
                    sums += now;
                    row++;
                    column += heyNow[row][column];  
                }
            }
        }
        
        System.out.println(biggestSums);
        */
    }
    
    public static int[][] hereWeGo()
    {
        String hell = "75 "+
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
    
        int[][] hellInArrForm = new int[15][15];
        int row = 0;
        int column = 0;
        for(int i=0; i<hell.length(); i+=3)
        {
            hellInArrForm[row][column] = Integer.parseInt(hell.substring(i, i+2));
            column++;
            if(column > row )
            {
                row++;
                column = 0;
            }
        }
        return hellInArrForm;
    }
}
