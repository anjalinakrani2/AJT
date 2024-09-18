//Write a Java Program to find the generate the first 50 numbers of Fibonacci Series.


public class ass1p4 {
    public static void main(String args[])
    {
        int n=50;
        long[] fibonacci=new long[50];

        fibonacci[0]=0;
        fibonacci[1]=1;

        for(int i=2;i<n;i++)
        {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }

        System.out.println("First 50 fibonacci numbers are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(fibonacci[i]+" ");
        }

    }
    
}
