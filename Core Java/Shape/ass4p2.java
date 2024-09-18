//Write a Java Program (Use Package & Interface) to implement the shape class & find the areas & volumes of each of the objects created for the inherited classes.
import shape.* ;

public class ass4p2 {
    public static void main(String[] args) {
        Cube c1=new Cube(5.0);
        System.out.println("Area of Cube with side "+c1.getLength()+" is "+c1.Area()+" sq.units");

        Cuboid c2=new Cuboid(2.0,1.0,3.0);
        System.out.println("Area of cuboid is "+c2.Area()+" sq.units");

        Sphere s1=new Sphere(7);
        System.out.println("Volume of sphere s1 is "+s1.Volume()+" cubic units");
    }
}
