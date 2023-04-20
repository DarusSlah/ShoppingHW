package shopping;

public class Main {
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
        manager.printEmployeePriceAfterDiscount(shirt);

        Student student = new Student("Lexi", size4, listOfProducts);
        student.printPersonName();
        System.out.println(student.calculateDiscount(pants));
        System.out.println(student.calculateDiscount(shoes));
        System.out.println("is a fit?: " + ShopApp.isAFit(student,shoes) + "\n");

        Business business = new Business("Shoe and clothes Store", "123 ABC Street",listOfProducts);
        System.out.println(business.toString());

        Discountable[] DiscountAvailableForProduct = {manager,student,business};

        System.out.println("Total:"+ ShopApp.calculateTotal(listOfProducts) + "\n");

        ShopApp.printEveryDiscountAvailableForAProduct(DiscountAvailableForProduct, shoes);













    }
}
