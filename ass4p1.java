//Write a Java Program (Use Package) to inherit time class. (i.e. First class has the hours component, Second class has the minutes component & the Third class has a seconds component.) Given 2 objects, find the time lapsed between them.

import time.*;

public class ass4p1 {
    public static void main(String[] args) {
        Time t1=new Time(18,45,45);
        Time t2=new Time(7,30,0);

        Minutes m1=new Minutes(2,30);
        System.out.println(m1);

        System.out.println("Time t1 :"+t1);
        System.out.println("Time t2 :"+t2);

        System.out.println("Time elasped between t1 and t2 is "+Time.timeElasped(t1, t2));
        
    }
}
