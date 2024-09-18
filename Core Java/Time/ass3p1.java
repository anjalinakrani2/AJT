package time;

public class ass3p1 {
    public static void main(String[] args) {
        Time t1=new Time(18,45,45);
        Time t2=new Time(7,30,0);

        System.out.println("Time t1 :"+t1);
        System.out.println("Time t2 :"+t2);

        System.out.println("Time elasped between t1 and t2 is "+Time.timeElasped(t1, t2));
        
    }
    
}
