package pkg1;
public abstract class Employee{

    private String name;
    private int id;
    private String contact;
    private int salary;

  public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
      
      public void setId(int id)
    {
      this.id=id;
    }
    public int getId()
    {
      return id;
    }

    public void setContact(String contact)
    {
      this.contact=contact;
    }
    public String getContact()
    {
      return contact;
    }

    public void setSalary(int salary)
    {
      this.salary=salary;
    }
    public int getSalary()
    {
      return salary;
    }


   abstract String show(); 



}
