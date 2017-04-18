package hw3.myowntasks.collectionframework.treesetdemowithcomparators.Test;


import hw3.myowntasks.collectionframework.treesetdemowithcomparators.Car;
import hw3.myowntasks.collectionframework.treesetdemowithcomparators.ReleaseDateAscComparator;
import hw3.myowntasks.collectionframework.treesetdemowithcomparators.ReleaseDateDescComparator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

/**
 * Created by Ruslan on 25.01.2017.
 */
public class TestReleaseDataAscComparator {
    @Test
    public void testCompareDesc() {
        Car bmw118i = new Car("118i", 25000, "BMW", 2015);
        Car bmw118i1 = new Car("118i", 25000, "BMW", 2010);
        Comparator<Car> comparatorDesc = new ReleaseDateDescComparator();
        Assert.assertTrue(comparatorDesc.compare(bmw118i, bmw118i1) == -1);
    }

    @Test
    public void testCompareAsc() {
        Car bmw118i = new Car("118i", 25000, "BMW", 2015);
        Car bmw118i1 = new Car("118i", 25000, "BMW", 2010);
        Comparator<Car> comparatorAsc = new ReleaseDateAscComparator();
        Assert.assertTrue(comparatorAsc.compare(bmw118i, bmw118i1) == 1);
    }
}
