/**
 * Good morning (or night), Ms. Kasper. Your mission, should you choose to accept it:
 *  If the numbers 1 to 5 are written out in words: one, two, three, four, five, then
 *  there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *  If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
 *  how many letters would be used?
 * As always, should you are any of your I.M. Force be caught of killed, the Secretary will
 * disavow any knowledge of you actions. This code will self-destruction (or probably not) in
 * five seconds (or probably never). Good luck, Grace.
 * 
 * @Grace Kasper 
 * @18 December 2016 (Finished: 19 December 2016)
 */
public class Euler17
{
    public static void euler17(int stop)
    {
        String longAssNumberInString = "";
        for (int i = 1; i<=stop; i++)
        {
            longAssNumberInString = longAssNumberInString + "" + i;
            //System.out.println(longAssNumberInString + " : " + i);
        }
        System.out.println(longAssNumberInString);
        
        String total = "";
        for(int j = 0; j <longAssNumberInString.length(); j++)
        {
            //numbers 1through 9 therefore indexs of 0 through 8
            int num = 0;
            if(j <=8)//1-9
            {
                num = Integer.parseInt(longAssNumberInString.substring(j,j+1));
                //System.out.println(num +" : " + j);
                total += Euler17.underTen(num);
            }
            else if (j <=28)//10-19 2(10
            {
                num = Integer.parseInt(longAssNumberInString.substring(j, j+2));
                j++;
                total += Euler17.teens(num);
            }
            else if (j <=188)//20-99 80*2
            {
                num = Integer.parseInt(longAssNumberInString.substring(j, j+2));
                j++;
                total += Euler17.underOneHundred(num);
            }
            else if(j!= longAssNumberInString.length()-4)//100-999 890*
            {
                num = Integer.parseInt(longAssNumberInString.substring(j, j+3));
                j += 2;
                if (num<1000)
                    total += Euler17.underOneThousand(num);
                else
                    total += Euler17.onethousand(num);
            }
            else
            {
                num = 1000;
                j += 3;
                total += Euler17.onethousand(num);
            }
            System.out.println(total.length());
        }
        System.out.println(total);
        System.out.println(total.length());
    }
    
    public static String underTen(int num)
    {
        if (num==1)
            return "one";
        else if (num==2)
            return "two";
        else if (num==3)
            return "three";
        else if (num==4)
            return "four";
        else if (num==5)
            return "five";
        else if (num==6)
            return "six";
        else if (num==7)
            return "seven";
        else if (num==8)
            return "eight";
        else if(num==9)//9
            return "nine";
        else //0
            return "";
    }
    
    public static String teens(int num)
    {
        if (num==10)
            return "ten";
        else if (num==11)
            return "eleven";
        else if (num==12)
            return "twelve";
        else if (num==13)
            return "thirteen";
        else if (num==14)
            return "fourteen";
        else if (num==15)
            return "fifteen";
        else if (num==16)
            return "sixteen";
        else if (num==17)
            return "seventeen";
        else if (num==18)
            return "eighteen";
        else //must be 19
            return "nineteen";
    }
    
    public static String underOneHundred(int num)
    {
        if (num<=29)//20s
        {
            if(num-20==0)
                return "twenty";
            else
                return "twenty"+Euler17.underTen(num-20);
        }
        else if (num<=39)//30s
        {
            if(num-30==0)
                return "thirty";
            else
                return "thirty"+Euler17.underTen(num-30);
        }    
        else if (num<=49)//40s
         {
            if(num-40==0)
                return "forty";
            else
                return "forty"+Euler17.underTen(num-40);
        }    
        else if (num<=59)//50s
        {
            if(num-50==0)
                return "fifty";
            else
                return "fifty"+Euler17.underTen(num-50);
        }    
        else if (num<=69)//60s YEAH! BABY!!! (@Austin Powers)
        {
            if(num-60==0)
                return "sixty";
            else
                return "sixty"+Euler17.underTen(num-60);
        }     
        else if (num<=79)//70s
        {
            if(num-70==0)
                return "seventy";
            else
                return "seventy"+Euler17.underTen(num-70);
        }     
        else if (num<=89)//80s
        {
            if(num-80==0)
                return "eighty";
            else
                return "eighty"+Euler17.underTen(num-80);
        }     
        else //90s
        {
            if(num-20==0)
                return "ninety";
            else
                return "ninety"+Euler17.underTen(num-90);
        }            
    }
    
    public static String underOneThousand(int num)
    {
        if (num<200)//100s
        {
            if(num==100)
                return "onehundred";
            else if(num-100>19)//20-99
                return "onehundredand"+Euler17.underOneHundred(num-100);
            else if(num-100>9)//10-19
                return "onehundredand"+Euler17.teens(num-100);
            else //if(num-100>0) 1-9
                return "onehundredand"+Euler17.underTen(num-100);
        }
        else if (num<300)//200s
        {
            if(num==200)
                return "twohundred";
            else if(num-200>19)//20-99
                return "twohundredand"+Euler17.underOneHundred(num-200);
            else if(num-200>9)//10-19
                return "twohundredand"+Euler17.teens(num-200);
            else//(num-200>0) 1-9
                return "twohundredand"+Euler17.underTen(num-200);
        }
        else if (num<400)//300s
        {
            if(num-300 >19)//20-99
                return "threehundredand"+Euler17.underOneHundred(num-300);
            else if(num-300>9)//10-19
                return "threehundredand"+Euler17.teens(num-300);
            else if(num-300>0) //1-9
                return "threehundredand"+Euler17.underTen(num-300);
            else
                return "threehundred";
        }
        else if (num<500)//400s
        {
            if(num-400 >19)//20-99
                return "fourhundredand"+Euler17.underOneHundred(num-400);
            else if(num-400>9)//10-19
                return "fourhundredand"+Euler17.teens(num-400);
            else if(num-400>0) //1-9
                return "fourhundredand"+Euler17.underTen(num-400);
            else
                return "fourhundred";
        }
        else if (num<600)//500s
        {
            if(num-500 >19)//20-99
                return "fivehundredand"+Euler17.underOneHundred(num-500);
            else if(num-500>9)//10-19
                return "fivehundredand"+Euler17.teens(num-500);
            else if(num-500>0) //1-9
                return "fivehundredand"+Euler17.underTen(num-500);
            else
                return "fivehundred";
        }
        else if (num<700)//600s YEAH! BABY!!! (@Austin Powers)
        {
            if(num-600 >19)//20-99
                return "sixhundredand"+Euler17.underOneHundred(num-600);
            else if(num-600>9)//10-19
                return "sixhundredand"+Euler17.teens(num-600);
            else if(num-600>0) //1-9
                return "sixhundredand"+Euler17.underTen(num-600);
            else
                return "sixhundred";
        }
        else if (num<800)//700s
        {
            if(num-700 >19)//20-99
                return "sevenhundredand"+Euler17.underOneHundred(num-700);
            else if(num-700>9)//10-19
                return "sevenhundredand"+Euler17.teens(num-700);
            else if(num-700>0) //1-9
                return "sevenhundredand"+Euler17.underTen(num-700);
            else
                return "sevenhundred";
        }
        else if (num<900)//800s
        {
            if(num-800 >19)//20-99
                return "eighthundredand"+Euler17.underOneHundred(num-800);
            else if(num-800>9)//10-19
                return "eighthundredand"+Euler17.teens(num-800);
            else if(num-800>0) //1-9
                return "eighthundredand"+Euler17.underTen(num-800);
            else
                return "eighthundred";
        }
        else//900s
        {
            if(num-900 >19)//20-99
                return "ninehundredand"+Euler17.underOneHundred(num-900);
            else if(num-900>9)//10-19
                return "ninehundredand"+Euler17.teens(num-900);
            else if(num-900>0) //1-9
                return "ninehundredand"+Euler17.underTen(num-900);
            else
                return "ninehundred";
        }       
    }
    
    public static String onethousand(int num)
    {
        return "onethousand";
    }
}
