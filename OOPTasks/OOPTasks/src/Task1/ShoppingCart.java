package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private int id;
    ArrayList<product>products=new ArrayList<>();
    ShoppingCart(int id)
    {
        this.id=id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addProduct()
    {

            Scanner in=new Scanner(System.in);
            product p=new product();
            System.out.print("enter the name of product :");
            String name=in.next();
        System.out.print("\nenter the price of product :");
        double price;
            do {
                System.out.print("\n Please enter a price greater than 0 :");
                price = in.nextDouble();
            }while (price==0);

            p.setName(name);
            p.setPrice(price);
            products.add(p);

    }
    public void addProduct(product p)
    {
        products.add(p);
    }
     public void removeProduct()

     {
         Scanner in=new Scanner(System.in);
         if (products.isEmpty())
         {
             System.out.println("\nthe shopping cart is empty ");
         }
         else {
             boolean flag=false;
             do {

                 showProducta();
                 System.out.print("enter the name of the product that you want to remove from the shopping cart: ");
                 String name=in.next();
                     for (int i = 0; i < products.size(); i++) {

                         if (products.get(i).getName().equals(name))
                         {
                             products.remove(i);
                             flag=true;
                             System.out.println("Removed");
                             break;
                         }
                     }
                     if (flag=false)
                     {
                         System.out.println("\n the name that you entered not valid ");

                     }
             }while (flag==false);

         }
     }
     public double totalCost()
     {
         double totalcos=0;
         for (int i = 0; i < products.size(); i++) {
             totalcos+=products.get(i).getPrice();

         }
         return totalcos;
     }
     public void showProducta()
     {
         System.out.println("the all products");
         for (int i = 0; i < products.size(); i++) {

             System.out.println("name: "+products.get(i).getName()+"   price: "+products.get(i).getPrice());

         }
         double total=totalCost();
         System.out.println("tatal cost: "+total);
     }
}
