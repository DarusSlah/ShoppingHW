package shopping;

public class Student extends Customer implements Discountable {
    private long studentID = 1234;
    private final double STUDENT_DISCOUNT = .05;

    public Student(String name, Size size, Product[] product) {
        super(name, size, product);
        this.studentID = ++studentID;
    }


    public long getStudentID() {
        return studentID;
    }


    public double calculateDiscount(Product product){
        return STUDENT_DISCOUNT * product.getPrice();
    }

    @Override
    public void printPersonName() {
        System.out.println("Student: " + getName() + "\n" + "Student ID: " + getStudentID() + "\n");
    }
}
