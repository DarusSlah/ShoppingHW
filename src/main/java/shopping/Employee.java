package shopping;

public abstract class Employee extends Customer implements Discountable{
    protected final double Employee_DISCOUNT = .10;

    public Employee(String name, Size size,Product[] product) {
        super(name, size, product);
    }


    public void printEmployeePriceAfterDiscount(Product product){
        double price = product.getPrice();
        double discountedPrice = price * Employee_DISCOUNT;
        System.out.println("The Employee price after discount: " + discountedPrice);
    }

    @Override
    public double calculateDiscount(Product product) {
        return Employee_DISCOUNT* product.getPrice();
    }
}
