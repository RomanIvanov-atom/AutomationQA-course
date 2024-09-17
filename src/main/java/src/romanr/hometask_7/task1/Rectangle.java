package src.romanr.hometask_7.task1;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.square = getSideA() * getSideB();
        this.perimeter = (getSideA() + getSideB()) * 2;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
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
        return "Rectangle{" +
                "sideA=" + String.format("%.2f", getSideA()) +
                ", sideB=" + String.format("%.2f", getSideB()) +
                ", square=" + String.format("%.2f", getSquare()) +
                ", perimeter=" + String.format("%.2f", getPerimeter()) +
                '}';
    }
}
