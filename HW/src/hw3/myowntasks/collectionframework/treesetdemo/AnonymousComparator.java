package hw3.myowntasks.collectionframework.treesetdemo;


import hw3.myowntasks.collectionframework.treesetdemowithcomparators.Car;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ruslan on 28.01.2017.
 */
public class AnonymousComparator {
    public Set<Car> getCarsDesc() {
        return new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int compareTo = 1;
                if ((o1.getName().equals(o2.getName())) && (o1.getYear() == o2.getYear())) {
                    if (o1.getPrice() > o2.getPrice()) {
                        compareTo = -1;
                    } else if (o1.getPrice() < o2.getPrice()) {
                        compareTo = 1;
                    }
                }
                return compareTo;
            }

            @Override
            public Comparator<Car> reversed() {
                return (o1, o2) -> {
                    int compareTo = -1;
                    compareTo = getCompareTo(o1, o2, compareTo);
                    return compareTo;
                };
            }
        });
    }

    public Set<Car> getCarsAsc() {
        return new TreeSet<>((o1, o2) -> {
            int compareTo = 1;
            compareTo = getCompareTo(o1, o2, compareTo);
            return compareTo;
        });
    }

    private int getCompareTo(Car o1, Car o2, int compareTo) {
        if ((o1.getName().equals(o2.getName())) && (o1.getYear() == o2.getYear())) {
            if (o1.getPrice() > o2.getPrice()) {
                compareTo = 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                compareTo = -1;
            }
        }
        return compareTo;
    }
}
