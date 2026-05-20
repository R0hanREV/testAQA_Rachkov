package lesson_4.figure;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(String borderColor, String spaceColor, double a, double b, double c) {
        super(borderColor, spaceColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimetr() {
        return a + b + c;
    }

    @Override
    public double area() {
        double i = perimetr() / 2;
        return Math.sqrt(i * (i - a) * (i - b) * (i - c));

    }

    @Override
    public void info() {
        super.info();
    }
}