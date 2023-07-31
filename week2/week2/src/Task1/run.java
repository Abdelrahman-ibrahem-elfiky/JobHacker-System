package Task1;

public class run {
    public static void main(String[] args) {

        product product1=new product("shirt ",100);
        product product2=new product("pants ",200);
        product product3=new product("glasses ",50);
        product product4=new product("coat ",300);
        ShoppingCart shoppingCart1=new ShoppingCart(101);
        shoppingCart1.addProduct(product1);
        shoppingCart1.addProduct(product2);
        ShoppingCart shoppingCart2=new ShoppingCart(105);
        shoppingCart2.addProduct(product3);
        shoppingCart2.addProduct(product4);
        OrderProcessor orderProcessor=new OrderProcessor();
        orderProcessor.addSoppingCart(shoppingCart1);
        orderProcessor.addSoppingCart(shoppingCart2);
        orderProcessor.details();

















        }
}
