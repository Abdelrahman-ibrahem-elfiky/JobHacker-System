package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderProcessor {

    ArrayList<ShoppingCart> shoppingCarts = new ArrayList<>();


    public void addSoppingCart(ShoppingCart shoppingCart) {

        shoppingCarts.add(shoppingCart);

    }

    public void details() {

        if (shoppingCarts.isEmpty()) {
            System.out.println("\n doesn't any order ");
        }
        else {
            for (int i = 0; i < shoppingCarts.size(); i++) {

                System.out.println("Id of shopping cart is: "+ shoppingCarts.get(i).getId());
                shoppingCarts.get(i).showProducta();
                System.out.println("\n\n----------------------------------");


            }
        }

    }
}