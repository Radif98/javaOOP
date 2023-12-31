package homeworks.Task1;

public class GeometricFigure {


    protected String name; // название фигуры

    /**
     * конструктор для присваивания названия фигуры
     */
    public GeometricFigure(String name) {
        this.name = name;
    }

    public Double calculateArea( double r) {
        return Math.PI * r * r;
    }

    public Double calculatePerimeter(double r) {
        return 2 * Math.PI * r;
    }




}