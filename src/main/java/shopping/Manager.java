package shopping;

public class Manager extends Employee implements Discountable{

    private final double MANAGER_DISCOUNT = .05;

    public Manager(String name, Size size, Product[] product) {
        super(name, size, product);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Product product) {
        double price = product.getPrice();
        double discountedPrice = price - calculateDiscount(product);
        System.out.println("The Employee price after discount: " + discountedPrice);
    }


    public double calculateDiscount(Product product){
        return (super.Employee_DISCOUNT + MANAGER_DISCOUNT) * product.getPrice();
    }

    @Override
    public void printPersonName() {
        System.out.println("Manager: " + getName() + "\n");
    }
}
