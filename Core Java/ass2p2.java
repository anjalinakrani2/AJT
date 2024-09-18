//Write a Java Program to perform operations on Vectors. (i.e. x,y,z co-ordinates.) (Use objects)

class Vector
{
    private int x,y,z;
    Vector(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Vector add(Vector other)
    {
        return new Vector(this.x+other.x, this.y+other.y, this.z+other.z);
    }

    public Vector subtract(Vector other)
    {
        return new Vector(this.x-other.x, this.y-other.y, this.z-other.z);
    }

    public Vector dotProduct(Vector other)
    {
        return new Vector(this.x*other.x, this.y*other.y, this.z*other.z);
    }

    public Vector crossProduct(Vector other)
    {
        return new Vector(this.y*other.z-this.z*other.y, this.z*other.x-this.x*other.z, this.x*other.y-this.y*other.x);
    }

    public String toString()
    {
        return "( "+this.x+","+this.y+","+this.z+")";
    }
}

public class ass2p2 {

    public static void main(String[] args) {
        Vector v1=new Vector(1, 1, 1);
        Vector v2=new Vector(0, 0, 0);
        Vector add=v1.add(v2);
        Vector subtract=v1.subtract(v2);
        Vector dotProduct=v1.dotProduct(v2);
        Vector crossProduct=v1.crossProduct(v2);

        System.out.println("Vector v1:"+v1);
        System.out.println("Vector v2:"+v2);
        System.out.println("Addition :"+add);
        System.out.println("Subtraction :"+subtract);
        System.out.println("Multiplication : "+dotProduct);
        System.out.println("Division : "+crossProduct);
        
    }
    
}
