package pkg2;

import Interfacepkg2.IProducts;

public class Products implements IProducts {

private String name;
private int id;
private double price;
private Boolean stock;
private int amount;
private String company;
public int type;

//type = 1. Vegetable, 2. FishMeat, 3. SoftDrink

public Products()
{

}
public Products(String name,int type,int id,double price,Boolean stock,int amount, String company)
{
  this.name=name;
  this.id=id;
  this.price=price;
  this.stock=stock;
  this.amount=amount;
  this.company=company;
}

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

    public void setPrice(double price)
    {
      this.price=price;
    }
    public double getPrice()
    {
      return price;
    }

    public void setStock(Boolean stock)
    {
      this.stock=stock;
    }
    public Boolean getStock()
    {
      return stock;
    }
    public void setAmount(int amount)
    {
      this.amount=amount;
    }
    public int getAmount()
    {
      return amount;
    }
    public void setCompany(String company)
    {
      this.company=company;
    }
    public String getCompany()
    {
      return company;
    }


      public String show() {
    return "Id: " + getId() + " Name: "+ getName()+" Type: "+ type+ " Price: " + getPrice() + " Stock: " + getStock() + " Amount: " + getAmount()+ " Company: " + getCompany();
  }


}
