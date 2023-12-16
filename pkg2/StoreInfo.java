package pkg2;
public class StoreInfo{

  private String storeName;
  private String storePhoneNo;
  private String storeBranch;
  private Products prot[]; //one to many association
 

  public StoreInfo()
  {

  }

  public StoreInfo(String storeName,String storePhoneNo,String storeBranch,Products prot[])
  {
    this.storeName=storeName;
    this.storePhoneNo=storePhoneNo;
    this.storeBranch=storeBranch;
    this.prot=prot;
   

  }





  public void setStoreName(String storeName)
    {
      this.storeName=storeName;
    }
    public String getStoreName()
    {
      return storeName;
    }


  public void setStorePhoneNo(String storePhoneNo)
    {
      this.storePhoneNo=storePhoneNo;
    }
    public String getStorePhoneNo()
    {
      return storePhoneNo;
    }


  public void setStoreBranch(String storeBranch)
    {
      this.storeBranch=storeBranch;
    }
    public String getStoreBranch()
    {
      return storeBranch;
    }

  public void setProducts(Products prot[]) {
    this.prot = prot;
  }

  public Products[] getProducts() {
    return prot;
  }


  public String showVeg() {
    
    String protInfos = "";
    for(int i = 0; i < 10; i++) {
      protInfos += "\n" + prot[i].show();
    }
    
    return "StoreName: " + getStoreName() + " StorePhoneNo: " + getStorePhoneNo() +  " StoreBranch: " + getStoreBranch() + " Product Information : " + protInfos ;
  }

  public String showFnM() {
    
    String protInfos = "";
    for(int i = 10; i < 20; i++) {
      protInfos += "\n" + prot[i].show();
    }
    
    return "StoreName: " + getStoreName() + " StorePhoneNo: " + getStorePhoneNo() +  " StoreBranch: " + getStoreBranch() + " prot: " + protInfos ;
  }

  public String showSoftDrinks() {
    
    String protInfos = "";
    for(int i = 20; i < prot.length; i++) {
      protInfos += "\n" + prot[i].show();
    }
    
    return "StoreName: " + getStoreName() + " StorePhoneNo: " + getStorePhoneNo() +  " StoreBranch: " + getStoreBranch() + " prot: " + protInfos ;
  }


}




