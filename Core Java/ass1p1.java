//Write a Java Program to add marks of two subjects. Write the same program using Command line arguments.


class Student
{
    int id;
    private double m1,m2;

    Student(int id)
    {
        this.id=id;
        
    }

    public void setMarks(double m1,double m2)
    {
        this.m1=m1;
        this.m2=m2;
    }

    public double totalMarks()
    {
        return this.m1+this.m2;
    }

}
class ass1p1
{
    public static void main(String args[])
    {
        Student s1=new Student(1);
        if (args.length<2)
        {
            System.out.println("using java ass1p1 <marks1> <marks2>");
        }

        double m1=Double.parseDouble(args[0]);
        double m2=Double.parseDouble(args[1]);

        s1.setMarks(m1, m2);
        System.out.println("Total marks of student "+s1.id+" is "+s1.totalMarks());
    }
}
