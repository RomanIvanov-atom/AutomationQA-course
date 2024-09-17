package src.romanr.hometask_7.task1;

public class Triangle extends Figure {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.perimeter = getSideA() + getSideB() + getSideC();
        double halfPerimeter = getPerimeter() / 2;
        this.square =
                Math.sqrt(halfPerimeter * (halfPerimeter - getSideA()) * (halfPerimeter - getSideB()) * (halfPerimeter - getSideC()));
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
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
        return "Triangle{" +
                "sideA=" + String.format("%.2f", getSideA()) +
                ", sideB=" + String.format("%.2f", getSideB()) +
                ", sideC=" + String.format("%.2f", getSideC()) +
                ", square=" + String.format("%.2f", getSquare()) +
                ", perimeter=" + String.format("%.2f", getPerimeter()) +
                '}';
    }
}
