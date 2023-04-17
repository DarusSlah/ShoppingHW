package shopping;

public class Product {
    private String description;
    private double price;
    private Size size;

    public Product(String description, double price, Size size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }


    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
