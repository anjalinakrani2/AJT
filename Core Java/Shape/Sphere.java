package shape;

public class Sphere implements Shape
{
    private double radius;
    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double value)
    {
        this.radius=value;
    }
    
    public Sphere(double radius)
    {
        this.radius=radius;
    }
    public double area;
    public double Area()
    {
        this.area=4*Math.PI*this.radius*this.radius;
        return this.area;
    }

    public double volume;
    public double Volume()
    {
        this.volume=(4/3)*Math.PI*this.radius*this.radius*this.radius;
        return this.volume;
    }
}
