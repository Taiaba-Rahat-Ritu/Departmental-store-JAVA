package pkg2;
public class Vegetable extends Products{

 public Vegetable()
 {


 }


 public Vegetable(String name,int id,double price,Boolean stock,int amount)
{
  super(name,id,price,stock,amount);


}

public String show() {
    return super.show() ;
  }

}
