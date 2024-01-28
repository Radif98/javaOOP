package seminars.seminar07.task2;

public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape()
    {
        return new Circle();
    }
}
