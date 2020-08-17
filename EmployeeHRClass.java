import java.util.*;
import java.util.Collections;
import java.lang.*;

public class EmployeeHRClass {

    public static void main(String [] args){
        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(new Employee("Mahesh",10,"Developer"));
        al.add(new Employee("Xmen",10,"Fighter"));
        al.add(new Employee("Boy",10,"Sucker"));

        Collections.sort(al);

        for (Employee Emp : al){
            System.out.println(Emp);
        }

         

    }
    
}


class Employee implements Comparable<Employee>{
      String Ename;
      int Enumb;
      String Erole;

    Employee(String Ename, int Enum, String role){
        this.Ename = Ename;
        this.Enum = Enumb;
        this.role = Erole;
    }

    // public int compareTo(Employee employee){
    //     return Ename.compareTo(employee.Ename);

    // }   

    public int compareTo(Employee Emp){
        if (Enumb == Emp.Enumb){
            return 0;   
        }     
        else if (Enumb > Emp.Enumb)
            return 1;        
        else  
            return -1;
         
    }


}