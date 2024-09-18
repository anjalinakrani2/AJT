package time;

public class Hours
{
    protected int hour;

    public Hours(int hour)
    {
        this.hour=hour;
    }

    public int getHours()
    {
        return this.hour;
    }

    public void setHour(int hour)
    {
        this.hour=hour;
    }

    //overriding the toString method
    public String toString()
    {
        return String.format("%02d",hour);
    }
}

