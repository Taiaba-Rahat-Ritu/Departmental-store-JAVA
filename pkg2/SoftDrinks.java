package pkg2;
public class  SoftDrinks extends Products{

  private String companyName;

public SoftDrinks()
{

}

public SoftDrinks(String companyName)
{
  this.companyName=companyName;
}



  public SoftDrinks(String name,int id,double price,Boolean stock,int amount,String companyName)
{
  super(name,id,price,stock,amount);
  this.companyName=companyName;


}

  public void setCompanyName(String companyName)
    {
      this.companyName=companyName;
    }
    public String getCompanyName()
    {
      return companyName;
    }

public String show() {
    return super.show() + " CompanyName" + getCompanyName() ;
  }
    
}