/**You are given the following information, but you may prefer to do some research for yourself.

 *          1 Jan 1900 was a Monday.
 *          Thirty days has September,
 *          April, June and November.
 *          All the rest have thirty-one,
 *          Saving February alone,
 *          Which has twenty-eight, rain or shine.
 *          And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *
 * @author Grace Kasper
 * @date Start:11 January 2017 End/solved:17 February 2017
 */
public class Euler19
{
    // instance variables - replace the example below with your own
    private int day;
    private int year;
    private String month;
    private String weekday;
    private int matches;
    
    public void upWeekDay()
    {
        if(weekday.equals("Sunday"))
        {
            weekday = "Monday";
        }
        else if (weekday.equals("Monday"))
        {
            weekday = "Tuesday";
        }
        else if (weekday.equals("Tuesday"))
        {
            weekday = "Wednesday";
        }
        else if (weekday.equals("Wednesday"))
        {
            weekday = "Thursday";
        }
        else if (weekday.equals("Thursday"))
        {
            weekday = "Friday";
        }
        else if (weekday.equals("Friday"))
        {
            weekday = "Saturday";
        }
        else //Saturday
        {
            weekday = "Sunday";
        }
    }
    
    public void upMonth()
    {
        if( month.equals("January"))//1
        {
            month = "February";
        }
        else if( month.equals("February"))//2
        {
            month = "March";
        }
        else if( month.equals("March"))//3
        {
            month = "April";
        }
        else if( month.equals("April"))//4
        {
            month = "May";
        }
        else if( month.equals("May"))//5
        {
            month = "June";
        }
        else if( month.equals("June"))//6
        {
            month = "July";
        }
        else if( month.equals("July"))//7
        {
            month = "August";
        }
        else if( month.equals("August"))//8
        {
            month = "September";
        }
        else if( month.equals("September"))//9
        {
            month = "October";
        }
        else if( month.equals("October"))//10
        {
            month = "November";
        }
        else if( month.equals("November"))//11
        {
            month = "December";
        }
        else //December
        {
            month = "January";
        }
    }
    
    public void getDayOfMonthMAIN()
    {
        int runs = 0;
        while (runs <2)
        {
            if(runs == 0)
            {
                year = 1900;
                day = 1;
                month = "January";
                weekday = "Monday";
                runs++;
            }
            
            if(year==2000 && month.equals("December") && day==2)
            {
                runs++;
            }
            
            String a = month;
            if (day<28)
            {
                day++;
                this.upWeekDay();
            }
            else if(a.equals("February") )
            {
                if(day==28)
                {
                    if( year%100==0 && year%400==0) //leap year
                    {
                        day++;
                        this.upWeekDay();
                    }
                    else if (year%100!=0 && year%4==0)
                    {
                        day++;
                        this.upWeekDay();
                    }
                    else//NON LEAP YEAR
                    {
                        this.upMonth();
                        day = 1;
                        this.upWeekDay();
                    }
                }
                else if(day==29)//Leap Day!!!
                {
                    this.upMonth();
                    day = 1;
                    this.upWeekDay();
                }
            }
            else if(a.equals("September") || a.equals("April") || a.equals("June") || a.equals("November"))
            {
                if(day==30)
                {
                    day=1;
                    this.upMonth();
                    this.upWeekDay();
                }
                else
                {
                    day++;
                    this.upWeekDay();
                }
            }
            else //so Jan, March, May, July, August, Oct and Dec
            {
                if(day!=31)
                {
                    day++;
                    this.upWeekDay();
                }
                else//say==31 is true
                {
                    day = 1;
                    this.upMonth();
                    this.upWeekDay();
                    if(a.equals("December"))
                    {
                        year++;
                    }
                }
            }
            
            //System.out.println(weekday);
            if(year > 1900 && day==1 && weekday.equals("Sunday"))
            {
                matches++;
                //System.out.println( matches );
                System.out.println(weekday + ", " + month + " " + day + "st, " + year);
                System.out.println(matches);
            }
            //System.out.println(matches);
        }
    }
}
