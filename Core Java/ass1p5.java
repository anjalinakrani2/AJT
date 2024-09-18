//Write a Java Program to find the factorial of 50. 

import java.math.BigInteger;

public class ass1p5 {
    public static void main(String[] args) {
        System.out.println("factorial of 50 is "+factorial(50));
    }

    public static BigInteger factorial(int n)
    {
        if(n==0 || n==1)
        {
            return BigInteger.ONE;
        }
        else
        {
            return BigInteger.valueOf(n).multiply(factorial(n-1));
        }
    }
}
