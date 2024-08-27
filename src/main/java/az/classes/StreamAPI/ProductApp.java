package az.classes.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {

    public static void main(String[] args) {
        Product product1 = new Product("IPhone", "Mobile", 1000.35, 20);
        Product product2 = new Product("Xiaomi", "Tv", 1200.35, 14);
        Product product3 = new Product("Samsung", "Mobile", 3450.35, 26);
        Product product4 = new Product("Oppo", "Mobile", 500.35, 40);
        Product product5 = new Product("Honor", "Mobile", 567.35, 18);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        List<Product> sortedByQuantity = productList.stream()
                .sorted(new QuantityComparator())
                .collect(Collectors.toList());

        sortedByQuantity.forEach(System.out::println);

        System.out.println();

        List<Product> sortedByTotalPrice = productList.stream()
                .sorted(new TotalPrice())
                .collect(Collectors.toList());

        sortedByTotalPrice.forEach(System.out::println);

        System.out.println();

        List<Product> sortedByName = productList.stream()
                .sorted(new NameComparator())
                .toList();

        System.out.println("Sorted ByName: ");
        sortedByName.forEach(System.out::println);
    }

}
