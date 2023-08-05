package exercise3;

import product.Product;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        Product product = new Product();


        List<Product> products = product.addDummyData();

        List<Product> discountedToys = products.stream()
                .filter(product1 -> product1.getCategory().equals("Toys"))
                .map(product1 ->product1.withPrice(Math.abs(product1.getPrice() *0.1- product1.getPrice())))
                .collect(Collectors.toList());

        System.out.println("Discounted Toys:");
        discountedToys.forEach(toy -> System.out.println(toy.getName() + " (Price: $" + toy.getPrice() + ")"));
    }
}
