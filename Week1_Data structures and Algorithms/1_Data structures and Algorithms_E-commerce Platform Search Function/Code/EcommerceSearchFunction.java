import java.util.*;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EcommerceSearchFunction {

    public static List<Product> search(List<Product> products, String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.name.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
            new Product(1, "Smartphone"),
            new Product(2, "Laptop"),
            new Product(3, "Smartwatch")
        );

        List<Product> matched = search(productList, "smart");

        for (Product p : matched) {
            System.out.println(p.id + " " + p.name);
        }
    }
}
