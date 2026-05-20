package lesson_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Goods[] shoppingCart = new Goods[5];
        shoppingCart[0] = new Goods("Milk", "21.05.2026", "MilkRancho", "USA", 89.80, false);
        shoppingCart[1] = new Goods("Bread", "22.02.2026", "Pekarnya", "RU", 55.50, true);
        shoppingCart[2] = new Goods("Ham", "06.02.2026", "Myasnaya Lavka", "RU", 356.00, true);
        shoppingCart[3] = new Goods("Potato", "12.07.2025", "Ogorod", "RU", 36.00, false);
        shoppingCart[4] = new Goods("Cheese", "17.09.2023", "SHEProd", "SWISS", 436.00, true);
       System.out.println(Arrays.toString(shoppingCart));
        Park park1 = new Park("Veselie", "Rostov, naberegnaya street");
        Park.Attraction attraction = new Park("Veselie", "Rostov, naberegnaya street").new Attraction("Karusel","15:00 - 21:00",35.5);
        park1.setAttraction(attraction);
        System.out.println(park1);

    }
}
