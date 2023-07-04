import Task_3.Money;
import Task_3.Product;

public class Main {
    public static void Task3 () {
        Product product = new Product();
        Money price = new Money(10, "dollars", 53, "cents");
        product.setPrice(price);

        product.printPrice();

        product.lessPrice(2,36);

        product.printPrice();
    }
    public static void main(String[] args) {
//        Task3();
    }
}