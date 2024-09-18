//Write a Java Program to generate String data dynamically with an alphabet {'A', 'B', 'C', 'D'}. Use Math.random() to generate alphabets randomly.


public class ass1p6 {
    public static void main(String[] args) {
        char[] alphabet={'A','B','C','D'};
        int length=10;
        StringBuilder randomString=new StringBuilder(length);
        for(int i=1;i<length;i++)
        {
            randomString.append(alphabet[(int)(Math.random()*4)]);
        }
        System.out.println("Generated random string is "+randomString);

    }
    
}
