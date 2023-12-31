package homeworks.Task1;

public class Main {
    public static void main(String[] args)
    {
        Circle circle = new Circle("circle");
        double c = circle.calculateArea(4);
        double cc = circle.calculatePerimeter(4);
        printFigure(c, cc);
        System.out.println("--------");
        Rectangle rectangle = new Rectangle("rectange");
        double r = rectangle.calculateArea(4, 5);
        double rr = rectangle.calculatePerimeter(4,5);
        printFigure(r, rr);
        System.out.println("--------");
        Square square = new Square("square");
        double s = square.calculateArea(6,7);
        double ss = square.calculatePerimeter(6,7);
        printFigure(s, ss);
    }

    public static void printFigure(Object x, Object y) {
        System.out.println("Площадь: " + x);
        System.out.println("Периметр: " + y);
    }
}
