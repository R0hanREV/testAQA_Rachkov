package lesson_4.figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String borderColor, String spaceColor, int radius) {
        super(borderColor, spaceColor);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double perimetr() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void info() {
        super.info();
    }
}

