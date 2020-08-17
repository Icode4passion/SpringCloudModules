class Employee implements Comparable<Employee>{
    String Ename;
    int Enumb;
    String Erole;

  Employee(String Ename, int Enumb, String Erole){
      this.Ename = Ename;
      this.Enumb = Enumb;
      this.Erole = Erole;
  }

  public int compareTo(Employee emp){
      return Ename.compareTo(emp.Ename);

  }   

//   public int compareTo(Employee Emp){
//       if (Enumb == Emp.Enumb){
//           return 0;   
//       }     
//       else if (Enumb > Emp.Enumb)
//           return 1;        
//       else  
//           return -1;
       
//   }


}