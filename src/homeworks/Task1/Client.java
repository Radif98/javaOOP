package homeworks.Task1;

public class Client {
    public static void main(String[] args)
    {
        Circle circle = new Circle("Круг");
        double squareCircle = circle.calculatePerimeter(5);
        double perimeterCircle = circle.calculateArea(3);
        System.out.println(squareCircle);
        System.out.println(perimeterCircle);
        Rectangle rectangle = new Rectangle("Прямоугольник");
        double squareRectangle = rectangle.calculateArea(3,4);
        double perimeterRectangle = rectangle.calculatePerimeter(3,4);
        System.out.println(squareRectangle);
        System.out.println(perimeterRectangle);
        Square square = new Square("квадрат");
        double  squareSquare = square.calculateArea(5);
        double perimeterSquare = square.calculatePerimeter(4);
        System.out.println(squareSquare);
        System.out.println(perimeterSquare);
    }
}
