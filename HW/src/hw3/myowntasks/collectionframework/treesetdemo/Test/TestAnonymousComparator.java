package hw3.myowntasks.collectionframework.treesetdemo.Test;


import hw3.myowntasks.collectionframework.treesetdemo.AnonymousComparator;
import hw3.myowntasks.collectionframework.treesetdemowithcomparators.Car;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Ruslan on 28.01.2017.
 */
public class TestAnonymousComparator {
    private Car bmw = new Car("118i", 25000, "BMW", 2015);
    private Car bmw1 = new Car("118i", 2500, "BMW", 2015);
    private Car bmw2 = new Car("118i", 250, "BMW", 2015);
    private Car bmw3 = new Car("118i", 25, "BMW", 2015);

    @Test
    public void testGetCarDesc() {
        List<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(bmw1);
        cars.add(bmw2);
        cars.add(bmw3);
        Set<Car> carsDesc = new AnonymousComparator().getCarsDesc();
        carsDesc.add(bmw1);
        carsDesc.add(bmw);
        carsDesc.add(bmw3);
        carsDesc.add(bmw2);
        Assert.assertTrue(cars.containsAll(carsDesc));
    }

    @Test
    public void testGetCarAsc() {
        List<Car> cars = new ArrayList<>();
        cars.add(bmw3);
        cars.add(bmw2);
        cars.add(bmw1);
        cars.add(bmw);
        Set<Car> carsAsc = new AnonymousComparator().getCarsAsc();
        carsAsc.add(bmw);
        carsAsc.add(bmw3);
        carsAsc.add(bmw2);
        carsAsc.add(bmw1);
        Assert.assertTrue(cars.containsAll(carsAsc));
    }
}
