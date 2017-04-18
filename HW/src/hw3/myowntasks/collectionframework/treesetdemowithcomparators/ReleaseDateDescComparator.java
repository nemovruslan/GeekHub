package hw3.myowntasks.collectionframework.treesetdemowithcomparators;

import java.util.Comparator;

public class ReleaseDateDescComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        int compareTo;
        if (o1.getYear() > o2.getYear()) {
            compareTo = -1;
        } else if (o1.getYear() < o2.getYear()) {
            compareTo = 1;
        } else {
            compareTo = o2.getName().compareTo(o1.getName());
        }
        return compareTo;
    }
}
