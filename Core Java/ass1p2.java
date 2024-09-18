//Write a Java Program to find the factorial of 20.

import java.math.BigInteger;

class ass1p2{

    public static BigInteger factorial(int n)
    {
        BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static void main(String args[])
    {
        System.out.println("Factorial of 20 is "+ factorial(20));
    }
}
