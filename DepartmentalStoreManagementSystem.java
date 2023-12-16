import pkg1.*;
import pkg2.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class DepartmentalStoreManagementSystem{
    //taking objects
    static SalesMan s1 = new SalesMan();//type1
    static Cashier c1 = new Cashier();//type2
    static DeliveryBoy d1 = new DeliveryBoy();//type3
    static Manager m1 = new Manager();//type4
    static SecurityGuard sg1 = new SecurityGuard();//type5
    static Products prot[] = new Products[30];

 public static void main(String[] args){
    //initialize
    productInit();
    employeeInit();

   Scanner sc= new Scanner(System.in);

    StoreInfo si1 = new StoreInfo(" Uttara Store","0178.....","Uttara",prot);
    StoreInfo si2 = new StoreInfo("Store","0178.....","Dhaka",prot);
    StoreInfo si3 = new StoreInfo("Store","0178.....","Dhaka",prot);

    int id;
    String pass;
    do{
        try{
            System.out.println("Enter ID: ");
            id = sc.nextInt();
            sc.nextLine();
        }catch(Exception e){
            System.out.println("Wrong ID, try again");
            sc.nextLine();
            id = sc.nextInt();
        }
        try{
        System.out.println("Enter Password: ");
        pass = sc.nextLine();
        }catch(Exception e){
            System.out.println("Wrong Password, try again");
            sc.nextLine();
            pass = sc.nextLine();
        }
    }
    while(login(id,pass)==false);


    System.out.println("Welcome to the departmental store. What information do you wish to see?");
    int select;
    while(true){
      try{
         System.out.println("1. Employee \n2. Products \n3. Quit");
         select = sc.nextInt(); 
       }catch(Exception e){
        System.out.println("Invalid input, try again");
        sc.nextLine();
        select = sc.nextInt();
    }
      if (select == 1){
        int select1;
        try{
        System.out.println("1.Salesman \n2.Cashier \n3.Delivery boy \n4.Manager \n5.Security Guard");
        select1 = sc.nextInt();
        }catch(Exception e){

            System.out.println("Invalid input, try again");
            sc.nextLine();
            select1 = sc.nextInt();
        }
        if (select1 == 1){
          System.out.println(s1.show());
            }
        else if (select1 == 2){
          System.out.println(c1.show());
            }
        else if (select1 == 3){
          System.out.println(d1.show());
            }
        else if (select1 == 4){
          System.out.println(m1.show());
            }
        else if (select1 == 5){
          System.out.println(sg1.show());
            }
        else{
          System.out.println("Invalid Input");
            }

      }

        else if (select == 2){
        int select2;
        try{
         System.out.println("1.Vegetable \n2.FishOrMeat \n3.SoftDrinks");
         select2 = sc.nextInt();
        }catch(Exception e){
            System.out.println("Invalid input, try again");
            sc.nextLine();
            select2 = sc.nextInt();
        }
            if(select2 == 1){
               System.out.println(si1.showVeg());
            }
              else if (select2 == 2){
                 System.out.println(si2.showFnM());
            }
              else if (select2 == 3){
                 System.out.println(si3.showSoftDrinks());
            }
            else{
              System.out.println("Invalid Input");
            }
      }


        else if(select == 3)

        {
          break;
        }

    }

  }
  public static void productInit(){
    File productData = new File("products.txt");
    try{
        FileReader fr = new FileReader(productData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int i = 0;
        while((line = br.readLine())!=null){
            String[] productAttribute = line.split(",",0);
            prot[i] = new Products();
            prot[i].setId(Integer.parseInt(productAttribute[0]));
            prot[i].type = Integer.parseInt(productAttribute[1]);
            prot[i].setName(productAttribute[2]);
            prot[i].setPrice(Double.parseDouble(productAttribute[3]));
            prot[i].setAmount(Integer.parseInt(productAttribute[4]));
            prot[i].setStock(Boolean.parseBoolean(productAttribute[5]));
            prot[i].setCompany(productAttribute[6]);
            i++;
        }
    }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
  
  public static void employeeInit(){
    File employeeData = new File("Employee.txt");
    try{
        FileReader fr = new FileReader(employeeData);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while((line = br.readLine())!=null){
            String[] employeeAttribute = line.split(",",0);
            if (Integer.parseInt(employeeAttribute[1])==1) {
                s1.setId(Integer.parseInt(employeeAttribute[0]));
                s1.setName(employeeAttribute[2]);
                s1.setContact(employeeAttribute[3]);
                s1.setSalary(Integer.parseInt(employeeAttribute[4]));
                s1.setEmail(employeeAttribute[5]);
                s1.setPass(employeeAttribute[6]);
            }
            else if (Integer.parseInt(employeeAttribute[1])==2) {
                c1.setId(Integer.parseInt(employeeAttribute[0]));
                c1.setName(employeeAttribute[2]);
                c1.setContact(employeeAttribute[3]);
                c1.setSalary(Integer.parseInt(employeeAttribute[4]));
                c1.setEmail(employeeAttribute[5]);
                c1.setPass(employeeAttribute[6]);
            }
            else if (Integer.parseInt(employeeAttribute[1])==3) {
                d1.setId(Integer.parseInt(employeeAttribute[0]));
                d1.setName(employeeAttribute[2]);
                d1.setContact(employeeAttribute[3]);
                d1.setSalary(Integer.parseInt(employeeAttribute[4]));
            }
            else if (Integer.parseInt(employeeAttribute[1])==4) {
                m1.setId(Integer.parseInt(employeeAttribute[0]));
                m1.setName(employeeAttribute[2]);
                m1.setContact(employeeAttribute[3]);
                m1.setSalary(Integer.parseInt(employeeAttribute[4]));
                m1.setEmail(employeeAttribute[5]);
                m1.setPass(employeeAttribute[6]);
            }
            else if(Integer.parseInt(employeeAttribute[1])==5) {
                sg1.setId(Integer.parseInt(employeeAttribute[0]));
                sg1.setName(employeeAttribute[2]);
                sg1.setContact(employeeAttribute[3]);
                sg1.setSalary(Integer.parseInt(employeeAttribute[4]));
            }
        }
    }catch(IOException ioe){
        System.out.println(ioe);
        }
  }
  public static boolean login(int id, String pass){
    if(id == c1.getId() && pass.equals(c1.getPass())){
        return true;
    }
    else if(id == s1.getId() && pass.equals(s1.getPass())){
        return true;
    }
    else if (id == m1.getId() && pass.equals(m1.getPass())) {
        return true;
    }
    else{
        return false;
    }
  }
 
}
