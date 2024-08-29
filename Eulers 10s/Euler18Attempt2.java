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
public class Euler18Attempt2
{
    //int[][] pyramid = new int[15][15];
    
    public static int[][] getArray()
    {
        //Building the 2-D Array
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
        int[][] pyramid = new int[15][15];
        int row = 0;
        int column = 0;
        for(int i=0; i<pyramidString.length(); i+=3)
        {
            pyramid[row][column] = Integer.parseInt(pyramidString.substring(i, i+2));
            column++;
            if(column > row )
            {
                row++;
                column = 0;
            }
        }
        
        return pyramid;
    }
    
       /*
    public int main(int lowEnd, int currentRow, int counter, int column, int max)
    {
        
    }
    */
    public static void tracing(int row, int col)
    {
       int[][] pyr = Euler18Attempt2.getArray();
       if (row<= col)
       {
           if( pyr[row][col] == 0)
                return;
           else
           {
                System.out.println(pyr[row][col]);
                Euler18Attempt2.tracing(row+1, col); //left
                Euler18Attempt2.tracing(row+1, col+1); //right
           }
       }
    }
    
}
