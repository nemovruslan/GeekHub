package hw3.myowntasks.generics.cargenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Руслан on 08.11.2016.
 */
public class SortCar {
    private static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        cars.add(new Car("Lexus", 100000d));
        cars.add(new Car("AAC2", 300000d));
        cars.add(new Car("ABCl", 10000d));
        cars.add(new Car("Opel", 20000d));
        cars.add(new Car("AAC2", 10000d));
        cars.add(new Car("AAC2", 10001d));
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int compareTo = o1.getName().compareTo(o2.getName());
                if (compareTo == 0) {
                    compareTo = Double.compare(o1.getPrice(), o2.getPrice());
                }
                if ((o1.getName().length() > 2) && (o2.getName().length() > 2) && (o1.getName().charAt(2) == o2.getName().charAt(2))) {
                    compareTo = Double.compare(o1.getPrice(), o2.getPrice());
                }
                return compareTo;
            }
        });
        System.out.println(cars);
    }
}
