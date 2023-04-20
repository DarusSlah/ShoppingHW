package shopping;

public class ShopApp {
    public static void printEveryDiscountAvailableForAProduct(Discountable[] discountable, Product product){
        for (Discountable discount:discountable) {
            double discountedPrice = discount.calculateDiscount(product);
            // floating point for double
            // "%.2f" represents precision/width/type/how many zeros after the decimal
            System.out.println(String.format("%.2f",discountedPrice));


        }
    }
    public static boolean isAFit(Customer customer, Product product) {
        if (customer.getSize() == product.getSize())
            return true;
        else{
            return false;
    }

    }
    public static double calculateTotal(Product[] product){
        double total = 0;
        for (Product products: product) {
            total += products.getPrice();
        }
        return total;
    }

}