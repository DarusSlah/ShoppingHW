package shopping;

import java.util.Arrays;

public abstract class Customer extends Person {
    private String Product[];
    private Size size;

    public Customer(String name, Size size, Product[] product) {
        super(name);
        this.size = size;

    }

   Size getSize() {
        return size;
    }




    @Override
    public String toString() {
        return "Customer{" +
                "Products=" + Arrays.toString(Product) +
                ", size=" + size +
                '}';
    }


}
