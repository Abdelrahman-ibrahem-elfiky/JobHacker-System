package exercise4;

import product.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercise4 {
    public static void main(String[] args) {

        Product product =new Product();
        List<Product>products=product.addDummyData();
        Optional<Product>cheaperPrice=products.stream()
                .filter(product1 -> product1.getCategory().equals("Books"))
                .min(Comparator.comparing(Product::getPrice));

        System.out.println("\nCheapest Book:");
        cheaperPrice.ifPresent(book -> System.out.println(book.getName() + " (Price: $" + book.getPrice() + ")"));


    }
}
