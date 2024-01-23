package seminars.seminar06.task2;

public class Circle extends Shape  {
    private Double radius;

    public Circle(Double radius)
    {
        this.radius = radius;
    }

    @Override
    Double calculatorArea()
    {
        return radius * radius * Math.PI;
    }
}
