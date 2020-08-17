 

import java.util.*;
import java.util.Collections;
import java.lang.*;

public class EmployeeTest {

    public static void main(String [] args){
        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(new Employee("Mahesh",10,"Developer"));
        al.add(new Employee("Xmen",11,"Fighter"));
        al.add(new Employee("Boy",12,"Sucker"));

        Collections.sort(al);

        al.forEach(a -> System.out.println(a.Ename + " " +a.Enumb+" "+a.Erole));


        for (Employee emp : al){
            System.out.println(emp.Ename+" "+emp.Enumb+" "+emp.Erole);
        }

         

    }
    
}


