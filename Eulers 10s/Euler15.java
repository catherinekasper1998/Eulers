/**
 * Write a description of class Euler15 here.
 * 
 * @Grace Kasper
 * @Started:21 November 2016
 * Finished:
 */
public class Euler15
{
    public static int Euler15()
    {
        int[][] arrGridMaster = new int [10000][40];//change
        int[] arrGridTester = new int [40];//change
        int x = 20;//change
        int y = 20;//change
        int random = 0;
        int whereAmI = 0;
        for(int timesRun = 0; timesRun<100000 && whereAmI <100000; timesRun++)
        {
            x=20;//change
            y=20;//change
            for(int i = 0;  x+y>0 ; i++)
            {
                System.out.println(i + "  (" + x + "," + y + ")");
                if (x==0)
                {
                    y = y-1;
                    arrGridTester[i] = 1;
                }
                else if (y==0)
                {
                    x= x-1;
                    arrGridTester[i] = 0;
                }
                else
                {
                    random = (int)(Math.random() * 2);
                    if (random == 0)
                    {
                        x= x-1;
                        arrGridTester[i] = 0;
                    }
                    else
                    {
                        y=y-1;
                        arrGridTester[i] = 1;
                    }
                 }
            }
            System.out.println(timesRun + " : " + addThis(arrGridMaster, arrGridTester, whereAmI) + " : " + whereAmI);
            if (whereAmI == 0 || addThis(arrGridMaster, arrGridTester, whereAmI))
            {
                for(int c = 0; c<40; c++)//change
                {
                    arrGridMaster[whereAmI][c] = arrGridTester[c];
                }
                whereAmI++;
            }
            System.out.println(whereAmI +", "+ timesRun);
        }
        return whereAmI;
    }
    
    public static boolean addThis(int[][] master, int[] tester, int whereAmI)
    {
        for(int b = 0; b< whereAmI; b++)
        {
            int doesThisMatch = 0;
            for(int a = 0; a < 40; a++)//change
            {
                if(tester[a] == master[b][a])
                    doesThisMatch ++;
            }
            
            if (doesThisMatch==40)//change
                return false;
        }
        return true;
    }
}