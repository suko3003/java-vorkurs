package Brueckenkurs_1.src;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        for (String car : cars) {
            System.out.println(car);
        }

        String[] cars2 = { "Volvso", "BMW", "Ford", "Mazda" };
        for (String car2 : cars2) {
            System.out.println(car2);
        }

        double x = 1520.3;
        double y = .3;

        System.out.print("f(" + x + ", " + y + ") = x^2 + x + y = ");
        System.out.println(Math.pow(x, 2) + x + y);

        Lkw lkw1 = new Lkw("Mercedes", 1000, true);
        lkw1.loading(300);
        lkw1.removeLoading(10);

        lkw1.getLkwData();
    }
}
