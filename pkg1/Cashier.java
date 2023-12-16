package pkg1;
public class Cashier extends Employee{

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

  public String show()
  { 
    return "Cashier Name: " + getName() + " Id: " + getId() + " Contact: " + getContact() + "Salary: "+ getSalary();
  }


}

