package homeworks.Task1;

public class Rectangle extends GeometricFigure {


    /**
     * конструктор для присваивания названия фигуры
     *
     * @param name
     */
    public Rectangle(String name)
    {
        super(name);
    }

    public Double calculateArea(double a, double b) {
        return a * b;
    }

    public Double calculatePerimeter(double a, double b) {
        return 2 * (a + b);
    }

}
