abstract class Shape {
    abstract void calculateArea();

    void display() {
        System.out.println("Displaying shape area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.1f\n", area); 
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.printf("Area of Rectangle: %.1f\n", area);
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        c.display();
        c.calculateArea();

        Shape r = new Rectangle(4, 5);
        r.display();
        r.calculateArea();
    }
}
