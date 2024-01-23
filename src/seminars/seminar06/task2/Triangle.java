package seminars.seminar06.task2;

public class Triangle extends Shape {
    private Double side;
    private Double height;

    public Triangle(Double side, Double height)
    {
        this.side = side;
        this.height = height;
    }

    @Override
    Double calculatorArea()
    {
        return 0.5 * side * height;
    }
}
