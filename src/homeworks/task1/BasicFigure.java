package homeworks.task1;

public class BasicFigure {
    protected String name;

    public BasicFigure(String name) {

        this.name = name;
    }

    public Double calculateArea(double a) {
        return a * a;
    }

    public Double calculateArea(double a, double b) {
        return a * b;
    }

    public Integer calculateArea() {
        return 0;
    }

    public Double calculatePerimeter(double a) {
        return 4 * a;
    }

    public Double calculatePerimeter(double a, double b) {
        return 2 * (a + b);
    }

    public Integer calculatePerimeter() {
        return 0;
    }

}