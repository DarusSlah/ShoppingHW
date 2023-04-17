package shopping;

public class ShopApp {
    public static void printEveryDiscountAvailableForAProduct(Discountable[] discountable, Product product){
        for (Discountable discount:discountable) {
            double discountedPrice = discount.calculateDiscount(product);
            System.out.println(discountedPrice);


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
    public static void main(String[] args) {
        Size size1 = Size.SMALL;
        Size size2 = Size.MEDIUM;
        Size size3 = Size.LARGE;
        Size size4 = Size.MENS10;

        Product shirt = new Product("Shirt", 12.0, size2);
        Product pants = new Product("Pants", 24.0, size3);
        Product shoes = new Product("Shoes", 80.0, size4);
        Product[] listOfProducts = {shirt, pants, shoes};


        Manager manager = new Manager("Darus", size1, listOfProducts);
        manager.printPersonName();
        System.out.println(manager.calculateDiscount(shirt));


        Student student = new Student("Lexi", size4, listOfProducts);
        student.printPersonName();
        System.out.println(student.calculateDiscount(pants));
        System.out.println(student.calculateDiscount(shoes));
        System.out.println("is a fit?: " + isAFit(student,shoes) + "\n");

        Business business = new Business("Shoe and clothes Store", "123 ABC Street",listOfProducts);
        System.out.println(business.toString());

        Discountable[] DiscountAvailableForProduct = {manager,student,business};

        System.out.println("Total:"+ calculateTotal(listOfProducts) + "\n");

        printEveryDiscountAvailableForAProduct(DiscountAvailableForProduct, shoes);













    }
}