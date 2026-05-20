package lesson_3;

public class Goods {
    private String title;
    private String dateProduction;
    private String fabricator;
    private String originCountry;
    private double price;
    private boolean booked;

    public Goods(String title, String dateProduction, String fabricator, String originCountry, double price, boolean booked) {
        this.title = title;
        this.dateProduction = dateProduction;
        this.fabricator = fabricator;
        this.originCountry = originCountry;
        this.price = price;
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "title='" + title + '\'' +
                ", dateProduction='" + dateProduction + '\'' +
                ", fabricator='" + fabricator + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", price=" + price +
                ", booked=" + booked +
                '}';
    }
}
