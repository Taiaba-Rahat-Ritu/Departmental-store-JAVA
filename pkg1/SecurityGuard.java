package pkg1;
public class SecurityGuard extends Employee{


   
  public String show() 
  {
    return "SecurityGuard Name: " + getName() + " Id: " + getId() + " Contact: " + getContact() + "Salary: "+ getSalary();
  }


}