import java.util.Scanner;
import java.util.ArrayList;
public class PayrollSystem{

    private ArrayList<Employee> empList;

    PayrollSystem()
    {
        empList=new ArrayList<>();
    }

    public void addEmployees(Employee emp)
    {
        empList.add(emp);
    }

    public Employee findEmployee(int id)
    {
        Employee employee=null;
        for(Employee e:empList)
        {
            if(e.getId()==id)
            {
               employee=e;
            }
        }
        return employee;
    }

    public void removeEmployee(int id)
    {
       Employee e=findEmployee(id);
       if(e!=null)
       {
          empList.remove(e);
       }
       else{
        System.out.println("Employee does not exist...");
       }
    }

    public void displayEmployees()
    {
        for(Employee emp:empList)
        {
            System.out.println(emp);
            System.out.println("______________________________________________");
        }
    }

    
}