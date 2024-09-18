//Write a Java Program to inherit the vehicle class.

class Vehicle
{
    protected String model;

    Vehicle(String model)
    {
        this.model=model;
    }

    public String getModel()
    {
        return this.model;
    }

    public void setModel(String model)
    {
        this.model=model;
    }

    public String toString()
    {
        return "Model :"+this.model+"\n";
    }

}

class Car extends Vehicle
{
    protected int noOfDoors;

    Car(String model,int noOfDoors)
    {
        super(model);
        this.noOfDoors=noOfDoors;
    }

    public int getNoOfDoors()
    {
        return this.noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors)
    {
        this.noOfDoors=noOfDoors;
    }

    public String toString()
    {
        return super.toString()+"Number of Doors :"+this.noOfDoors;
    }
}

class Truck extends Vehicle
{
    protected int noOfWheels;

    Truck(String model,int noOfWheels)
    {
        super(model);
        this.noOfWheels=noOfWheels;
    }

    public int getNoOfWheels()
    {
        return this.noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels)
    {
        this.noOfWheels=noOfWheels;
    }

    public String toString()
    {
        return super.toString()+"Number of wheels :"+this.noOfWheels;
    }

}

public class ass3p2 {
    
    public static void main(String[] args) {
        Car c1=new Car("toyota",4);
        Truck t1=new Truck("ford", 16);

        System.out.println("Car c1 details:"+c1);
        System.out.println("Truck t1 details:"+t1);
    }
}
