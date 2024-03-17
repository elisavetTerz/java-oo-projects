package gr.aueb.cf.ch20;
@FunctionalInterface
public interface IProductFilter {
    boolean filterProduct(Product product);
}
