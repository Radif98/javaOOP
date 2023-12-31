package seminars.seminar01.Task4;

/**Создайте класс Product для представления товара в интернет-магазине.
 * Каждый товар должен иметь следующие характеристики:

 Название товара (name).
 Цена товара (price).
 Количество товара в наличии (quantity).
 Класс Product должен обеспечивать следующую функциональность:

 Конструктор, который принимает название, цену и количество товара и
 инициализирует соответствующие поля класса.
 Методы get и set для каждой из характеристик товара (название, цена, количество).
 Метод calculateTotalPrice, который будет вычислять общую стоимость товара на основе цены и
 количества.
 Метод displayProductInfo, который будет выводить информацию о товаре (название, цена, количество)
 на экран.
 Создайте несколько объектов класса Product и продемонстрируйте работу методов.
 */

public class Product {
    private String name;
    private double price;
    private int quantity;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
