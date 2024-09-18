package time;

public class Minutes extends Hours
{
    protected int minute;

    public Minutes(int hour,int minute)
    {
        super(hour);
        this.minute=minute;
    }

    public int getMinute()
    {
        return this.minute;
    }

    public void setMinute(int minute)
    {
        this.minute=minute;
    }

    public String toString()
    {
        return super.toString()+":"+String.format("%02d",minute);
    }
}

