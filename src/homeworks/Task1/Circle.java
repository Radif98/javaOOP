package homeworks.Task1;

public class  Circle extends GeometricFigure {
    protected static double r;

    /**
     * конструктор для присваивания названия фигуры
     *
     * @param name
     */
    public Circle(String name)
    {
        super(name);
    }

    public Double calculateArea( double r) {
        return Math.PI * r * r;
    }

    public Double calculatePerimeter(double r) {
        return 2 * Math.PI * r;
    }
}