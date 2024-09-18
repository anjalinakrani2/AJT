//Write a Java Program to inherit time class. (i.e. First class has the hour component, Second class has the minutes component & the Third class has a seconds component.) Given 2 objects, find the time lapsed between them. (Generate Documentation for your program.)
package time;

public class Time extends Minutes
{
    protected int second;

    public Time(int hour,int minute,int second)
    {
        super(hour,minute);
        this.second=second;
    }

    public int getSecond()
    {
        return this.second;
    }

    public void setSecond(int second)
    {
        this.second=second;
    }

    public String toString()
    {
        return super.toString()+":"+String.format("%02d",second);
    }

    public static Time timeElasped(Time t1,Time t2)
    {
        int totalSeconds1=t1.getHours()*3600+t1.getMinute()*60+t1.getSecond();
        int totalSeconds2=t2.getHours()*3600+t2.getMinute()*60+t2.getSecond();

        int timeElaspedSeconds=totalSeconds1-totalSeconds2;

        if (timeElaspedSeconds<0)
        {
            timeElaspedSeconds+=24*3600;
        }

        int hours=timeElaspedSeconds/3600;
        int minutes=(timeElaspedSeconds%3600)/60;
        int seconds=timeElaspedSeconds%60;

        return new Time(hours,minutes,seconds);
    }
}

