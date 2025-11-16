package entities;

public class Rectangle {
    public double high;
    public double width;

    public double area() {
        return high * width;
    }

    public double perimeter() {
        return 2 * (high + width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(high, 2) + Math.pow(width, 2));
    }
}
