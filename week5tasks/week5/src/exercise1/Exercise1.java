package exercise1;

import product.Product;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        Product product = new Product();

        List<Product> products = product.addDummyData();

        List<Product> books = products.stream()
                .filter(p -> p.getCategory().equals("Books"))
                .collect(Collectors.toList());

        System.out.println("Books:");
        books.forEach(book -> System.out.println(book.toString()));
    }
}
