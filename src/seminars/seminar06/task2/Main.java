package seminars.seminar06.task2;

public class Main {
    public static void main(String[] args)
    {
        Circle circle = new Circle(5.0);
        Square square = new Square(3.0);
        Triangle triangle = new Triangle(5.0, 3.0);
        System.out.println(circle.calculatorArea());
        System.out.println(square.calculatorArea());
        System.out.println(triangle.calculatorArea());
    }
}
