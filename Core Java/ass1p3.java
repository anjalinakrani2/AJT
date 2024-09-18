//Write a Java Program to find the first 20 Prime Numbers.

public class ass1p3 {
    public static void main(String[] args) {
        System.out.println("First 20 prime numbers are : ");
        int count=0;
        int num=2;
        while(count<20)
        {
            if(isPrime(num))
            {
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%2==0)
        {
            return false;
        }
        for(int i=3;i<n;i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
