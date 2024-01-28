package seminars.seminar07.task2;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape()
    {
        return new Rectangle();
    }
}
