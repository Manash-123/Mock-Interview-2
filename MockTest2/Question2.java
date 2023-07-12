package MockTest2;

abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        System.out.println(Math.PI * radius * radius);
    }
}
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(width * height); // Calculate area of rectangle
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(0.5 * base * height); // Calculate area of triangle
    }
}
public class Question2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();
        Rectangle r = new Rectangle(10, 20);
        r.calculateArea();
        Triangle t = new Triangle(10, 5);
        t.calculateArea();
    }
}
