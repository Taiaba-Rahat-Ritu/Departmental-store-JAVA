package pkg2;
public class FishOrMeat extends Products{

public FishOrMeat()
{

}


  public FishOrMeat(String name,int id,double price,Boolean stock,int amount)
{
  super(name,id,price,stock,amount);


}

public String show() {
    return super.show() ;
  }

    

}