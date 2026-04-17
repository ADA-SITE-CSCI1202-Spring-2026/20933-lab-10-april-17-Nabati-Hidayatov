import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone", 45, true));
        list.add(new Product("Laptop", 900, true));
        list.add(new Product("Mouse", 25, false));
        list.add(new Product("Keyboard", 30, true));
        Predicate<Product> isAffordable =
                p -> p.price < 50 && p.inStock;
        list.removeIf(p -> !isAffordable.test(p));
        list.forEach(System.out::println);
    }
}
