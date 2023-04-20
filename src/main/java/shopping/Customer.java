package shopping;

import java.util.Arrays;

public abstract class Customer extends Person {
    private Product[] products;
    private Size size;

    public Customer(String name, Size size, Product[] products) {
        super(name);
        this.size = size;
        this.products = products;

    }

   Size getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "products=" + Arrays.toString(products) +
                ", size=" + size +
                '}';
    }
}
