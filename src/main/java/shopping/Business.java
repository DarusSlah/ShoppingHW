package shopping;

import java.util.Arrays;

public class Business implements Discountable {
    private String businessName;
    private String address;
    private Product[] product;
    private final double BUSINESS_DISCOUNT = .25;

    public Business(String businessName,String address, Product[] product) {
        this.businessName = businessName;
        this.address = address;
        this.product = product;
    }


    @Override
    public String toString() {
        return "Business{" +
                "businessName='" + businessName + '\'' +
                ", address='" + address + '\'' +
                ", product=" + Arrays.toString(product) +
                ", BUSINESS_DISCOUNT=" + BUSINESS_DISCOUNT +
                '}';
    }

    @Override
    public double calculateDiscount(Product product) {
        return BUSINESS_DISCOUNT * product.getPrice();
    }


}
