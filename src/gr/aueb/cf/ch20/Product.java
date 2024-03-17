package gr.aueb.cf.ch20;

public class Product {

    private int productId;
    private String productTitle;
    private double productPrice;
    private int quantity;

    public Product() {}

    public Product(int productId, String productTitle, double productPrice, int quantity) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productTitle='" + productTitle + '\'' +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                '}';
    }

    public static void printProduct(Product product) {
        System.out.printf("ID: %d, Title: %s, Price: %.2f, Quantity: %d%n", product.getProductId(), product.getProductTitle(), product.getProductPrice(), product.getQuantity());
    }
}
