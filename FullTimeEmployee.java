import java.util.Scanner;

public class FullTimeEmployee extends Employee{

    private double monthlySalary;

    FullTimeEmployee(int id,String name,String address,double salary)
    {
        super(id,name,address);
        this.monthlySalary=salary;
    }

    public String toString()
    {
        return "\n  id : "+getId()+"\n  name : "+getName()+"\n  address : "+getAddress()+"\n  Salary : "+findSalary();
    }

    public double findSalary()
    {
          return (monthlySalary);
    }

}