package seminars.seminar01.Task4;

import javax.xml.namespace.QName;

import static seminars.seminar01.Task4.Main.displplayProductInfo;

public class Main {
    public static void main(String[] args)
    {
        Product product = new Product();
        product.setName("Apple");
        product.setQuantity(20);
        product.setPrice(16.7);
        System.out.println(calculateTotalPrice(product.getPrice(), product.getQuantity()));
        displplayProductInfo(product.getName(), product.getPrice(), product.getQuantity());
    }

    public static double calculateTotalPrice(double price, int quantity) {
        double res;
        res = price * quantity;
        return res;
    }
    public static void displplayProductInfo(String name, double price, int quantity) {
        System.out.println("name:" + name + ", price:" + price + ", quantity:" + quantity);
    }

}
