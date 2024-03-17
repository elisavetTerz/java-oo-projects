package gr.aueb.cf.ch20;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static final List<Product> products = Arrays.asList(
            new Product(1, "Banana", 0.8, 3),
            new Product(2, "Burger", 3, 10),
            new Product(3, "Watermelon", 5.2, 1),
            new Product(4, "Pineapple", 5, 2),
            new Product(5, "Milk", 1.2, 4),
            new Product(6, "Watermelon", 5, 3),
            new Product(7, "Burger", 3, 3),
            new Product(8, "Burger", 2.5, 10),
            new Product(9, "Milk", 1.1, 3),
            new Product(10, "Milk", 1.3, 3)
            );


    public static void main(String[] args) {
        /*1st implementation: new + Interface = anonymous class */
//        List<Product> filteredProducts = getFilteredProducts(products, new IProductFilter() {
//            @Override
//            public boolean filterProduct(Product product) {
//                return product.getProductPrice() >= 3;
//            }
//        });
//        /*1st implementation: Iteration with for */
//        for (Product product : filteredProducts) {
//            Product.printProduct(product);
//        }
        /*2nd implementation: Lambda */
//        List<Product> filteredProducts = getFilteredProductsWithPredicate(products, product -> product.getProductPrice() >= 3);
        List<Product> filteredProductsFromB = getFilteredProductsWithPredicate(products, product -> product.getProductTitle().startsWith("B"));
        printProducts(filteredProductsFromB, Product::printProduct);




    }

    //First method: Interface Consumer
    public static List<Product> getFilteredProducts(List<Product> products, IProductFilter filter) {
        List<Product> productsToReturn = new ArrayList<>();
        for (Product product : products) {
            if (filter.filterProduct(product)) {
                productsToReturn.add(product);
            }
        }
        return productsToReturn;
    }


    //Second method: Interface Predicate
    public static List<Product> getFilteredProductsWithPredicate(List<Product> products, Predicate<Product> filter) {
        List<Product> productsToReturn = new ArrayList<>();
        for (Product product : products) {
            if (filter.test(product)) {
                productsToReturn.add(product);
            }
        }
        return productsToReturn;
    }

    //Instead of iteration with for we create method getProductsByName:
    public static void printProducts(List<Product> products, Consumer<Product> consumer) {
        for (Product product : products) {
            consumer.accept(product);
        }
    }

}
