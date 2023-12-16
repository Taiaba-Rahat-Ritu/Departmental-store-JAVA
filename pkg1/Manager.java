package pkg1;
public class Manager extends Employee{

private String branchLocation;

private String email;
private String pass;

    
    public void setEmail(String email)
    {
      this.email=email;
    }
    public String getEmail()
    {
      return email;
    }

public void setPass(String pass)
    {
      this.pass=pass;
    }
    public String getPass()
    {
      return pass;
    }

  
    public void setBranchLocation(String branchLocation)
    {
      this.branchLocation=branchLocation;
    }
    public String getBranchLocation()
    {
      return branchLocation;
    }

    public String show() {
    return "Manager Name: " + getName() + " Id: " + getId() + " Contact: " + getContact() + "Salary: "+ getSalary() +"Email:" +getEmail()+" BranchLocation: " + getBranchLocation();
  }



}