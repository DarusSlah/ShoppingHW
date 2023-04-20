package shopping;

public abstract class Employee extends Customer implements Discountable{
    protected final double Employee_DISCOUNT = .10;

    public Employee(String name, Size size,Product[] product) {
        super(name, size, product);
    }


    public abstract void printEmployeePriceAfterDiscount(Product product);

    @Override
    public double calculateDiscount(Product product) {
        return Employee_DISCOUNT* product.getPrice();
    }
}
