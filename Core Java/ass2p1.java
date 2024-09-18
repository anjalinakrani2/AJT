//Write a Java Program to perform operations on Complex numbers. (Use objects)

class Complex
{
    private double real;
    private double imaginary;

    Complex(double real,double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    public Complex add(Complex other)
    {
        double r=this.real+other.real;
        double i=this.imaginary+other.imaginary;
        return new Complex(r,i);
    }

    public Complex subtract(Complex other)
    {
        double r=this.real-other.real;
        double i=this.imaginary-other.imaginary;
        return new Complex(r,i);
    }

    public Complex multiply(Complex other)
    {
        double r=this.real*other.real-this.imaginary*other.imaginary;
        double i=this.real*other.imaginary+this.imaginary*other.real;
        return new Complex(r,i);
    }

    public Complex divide(Complex other)
    {
        double denominator=other.real*other.real+other.imaginary*other.imaginary;
        double r=(this.real*other.real+this.imaginary*other.imaginary)/denominator;
        double i=(this.imaginary*other.real-this.real*other.imaginary)/denominator;
        return new Complex(r, i);
    }

    public String toString()
    {
        return this.real+ " + "+this.imaginary+"i";
    }
}
public class ass2p1 {

    public static void main(String[] args) 
    {
        Complex c1=new Complex(2,3);
        Complex c2=new Complex(1, 1);

        System.out.println("Complex number c1: " + c1);
        System.out.println("Complex number c2: " + c2);

        Complex add=c1.add(c2);
        Complex subtract=c1.subtract(c2);
        Complex multiply=c1.multiply(c2);
        Complex divide=c1.divide(c2);

        System.out.println("Addition :"+add);
        System.out.println("Subtraction :"+subtract);
        System.out.println("Multiplication : "+multiply);
        System.out.println("Division : "+divide);
    }

    
    
}
