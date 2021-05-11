public class Employee
{
   // fields
	private String firstName;
   private String lastName;
   private Double salary; 
	// constructors
   public Employee(String lName, String fName, double s)
   {
   
      lastName = lName;
      firstName = fName;
      setSalary(s);
      
   }
   // methods
   public void setSalary(double s)
   {
      
      if (s >= 0)
      {
      
         salary = s;
         
      }
      
   }
   
   public String getFirstName()
   {
         
      return firstName;
      
   }
      
   public String getLastName()
   {
   
      return lastName;
      
   }
      
   public double getSalary()
   {
      
      return salary;
      
   }	

}