import java.util.Scanner;

class Main{
    public static void main(String[] args){

        PayrollSystem p=new PayrollSystem();
        Employee seeta=new FullTimeEmployee(1,"seeta","Ayodhya",30000);
        Employee ram=new PartTimeEmployee(2,"ram","Ayodhya",8,200);
        Employee geeta=new FullTimeEmployee(3,"geeta","pune",80000);

        p.addEmployees(seeta);
        p.addEmployees(ram);
        
        p.displayEmployees();

        

        p.addEmployees(geeta);
         p.displayEmployees();

         p.removeEmployee(3);
         p.displayEmployees();

         

    }
}