package homeworks.Task1;

public class  Circle extends BasicFigure {

    public Circle(String name)
    {
        super(name);
    }

    @Override
    public Double calculatePerimeter(double a)
    {
        return 2 * Math.PI * a;
    }

    @Override
    public Double calculateArea(double a)
    {
        return Math.PI * a * a;
    }
}
