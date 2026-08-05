class Employee
{
   // Fields
   private String name;
   private int idNumber;
   private String department;
   private String position;
   
   // Constructors
   public Employee(String name, int idNumber, String department, String position)
   {
      this.name = name;
      this.idNumber = idNumber;
      this.department = department;
      this.position = position;
   }
   
   public Employee(String name, int idNumber)
   {
      this.name = name;
      this.idNumber = idNumber;
      this.department = "";
      this.position = "";
   }
   
   public Employee()
   {
      name = "";
      idNumber = 0;
      department = "";
      position = "";
   }
   
   // Mutators
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setIdNumber(int idNumber)
   {
      this.idNumber = idNumber;
   }
   
   public void setDepartment(String department)
   {
      this.department = department;
   }
   
   public void setPosition(String position)
   {
      this.position = position;
   }
   
   
   // Accessors
   public String getName()
   {
      return name;
   }
   
   public int getIdNumber()
   {
      return idNumber;
   }
   
   public String getDepartment()
   {
      return department;
   }
   
   public String getPosition()
   {
      return position;
   }
   
   public void printEmployee()
   {
      System.out.println("Name: " + getName());
      System.out.println("ID Number: " + getIdNumber());
      System.out.println("Department: " + getDepartment());
      System.out.println("Position: " + getPosition());
   }
}


/////////////////////////////////

public class EmployeeManagement
{
   public static void main(String[] args)
   {
      // Create Employee objects
      Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
      
      Employee employee2 = new Employee("Mark Jones", 39119);
      
      employee2.setDepartment("IT");
      employee2.setPosition("Programmer");
      
      Employee employee3 = new Employee();
      
      employee3.setName("Joy Rogers");
      employee3.setIdNumber(81774);
      employee3.setDepartment("Manufacturing");
      employee3.setPosition("Engineer");
      
      // Display Employee info
      employee1.printEmployee();
      
      System.out.println();
      
      employee2.printEmployee();
      
      System.out.println();
      
      employee3.printEmployee();
      
   }
}
