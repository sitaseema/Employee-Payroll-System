import java.util.Scanner;

public class PartTimeEmployee extends Employee{

    private int noOfHours;
    private double hourlyRate;

    PartTimeEmployee(int id,String name,String address,int hours,int rate)
    {
        super(id,name,address);
        noOfHours=hours;
        hourlyRate=rate;
    }

    public String toString()
    {
        return " id : "+getId()+"\n name : "+getName()+"\n address : "+getAddress()+"\n salary :"+findSalary();
    }

    public double findSalary()
    {
         return (noOfHours*hourlyRate);
    }
}