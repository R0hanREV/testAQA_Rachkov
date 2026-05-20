package lesson_4.figure;

public class Figure implements CalcParams {
    protected String borderColor;
    protected String spaceColor;

    public Figure(String borderColor, String spaceColor) {
        this.borderColor = borderColor;
        this.spaceColor = spaceColor;
    }

    @Override
    public double perimetr() {
return 0.0;
    }

    @Override
    public double area() {
return 0.0;
    }
    public void info(){
        System.out.println("Периметр "+perimetr());
        System.out.println("Площадь "+ area());
        System.out.println("Цвет заливки "+spaceColor);
        System.out.println("Цвет границы " +borderColor);
    }
}
