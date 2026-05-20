package lesson_4;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String borderColor, String spaceColor, double height, double width) {
        super(borderColor, spaceColor);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimetr() {
        return 2 * (height + width);
    }

    @Override
    public void info() {
        super.info();
    }
}
