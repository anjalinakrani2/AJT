package shape;

public class Cuboid implements Shape
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

    private double breadth;
    public double getBreadth()
    {
        return this.breadth;
    }

    public void setBreadth(double value)
    {
        this.breadth=value;
    }

    private double heigth;
    public double getHeigth()
    {
        return this.heigth;
    }

    public void setHeigth(double value)
    {
        this.heigth=value;
    }

    public Cuboid(double length,double breadth,double heigth)
    {
        this.length=length;
        this.breadth=breadth;
        this.heigth=heigth;
    }
    public double area;
    public double Area()
    {
        this.area=2*(this.length*this.breadth+this.breadth*this.heigth+this.heigth*this.length);
        return this.area;
    }

    public double volume;
    public double Volume()
    {
        this.volume=this.length*this.breadth*this.heigth;
        return this.volume;
    }
}
