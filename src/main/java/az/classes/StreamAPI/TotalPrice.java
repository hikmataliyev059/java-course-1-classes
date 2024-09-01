package az.classes.StreamAPI;

import java.util.Comparator;

public class TotalPrice implements Comparator<Product> {
    @Override
    public int compare(Product p2, Product p1) {
        double value1 = p1.getPrice() * p1.getQuantity();
        double value2 = p2.getPrice() * p2.getQuantity();
        return Double.compare(value1, value2);
    }
}
