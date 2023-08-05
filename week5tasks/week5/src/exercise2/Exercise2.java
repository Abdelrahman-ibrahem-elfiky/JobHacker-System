package exercise2;

import product.Product;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        Product product=new Product();
        List<Product> books=product.addDummyData().stream()
                .filter(product1 -> product1.getCategory().equals("Books")&&product1.getPrice()>100)
                .collect(Collectors.toList());
        System.out.println("\nExpensive Books:");
        books.forEach(book->System.out.println(book.toString()));




    }
}
