package src.romanr.hometask_7.task1;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.perimeter = 2 * 3.14 * getRadius();
        this.square = perimeter * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getSquare() {
        return square;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + String.format("%.2f", getRadius()) +
                ", square=" + String.format("%.2f", getSquare()) +
                ", perimeter=" + String.format("%.2f", getPerimeter()) +
                '}';
    }
}