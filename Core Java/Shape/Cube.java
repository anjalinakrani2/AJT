package shape; 

public class Cube implements Shape
{
    private double length;

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double value)
    {
        this.length=value;
    }
    
    public Cube(double length)
    {
        this.length=length;
    }
    public double area;
    public double volume;

    public double Area()
    {
        this.area=6*this.length*this.length;
        return this.area;
    }
    public double Volume()
    {
        this.volume=this.length*this.length*this.length;
        return this.volume;
    }
    
}
