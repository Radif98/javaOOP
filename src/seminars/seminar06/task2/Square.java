package seminars.seminar06.task2;

public class Square extends Shape{
    private Double side;

    public Square(double side)
    {
        this.side = side;
    }

    public Double getSide()
    {
        return side;
    }

    @Override
    Double calculatorArea()
    {
        return side * side;
    }

}
