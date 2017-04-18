package hw3.myowntasks.collectionframework.treesetdemowithcomparators;


import java.util.Comparator;

public class ReleaseDateAscComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int compareTo;
        if (((Car) o1).getYear() > ((Car) o2).getYear()) {
            compareTo = 1;
        } else if (((Car) o1).getYear() < ((Car) o2).getYear()) {
            compareTo = -1;
        } else {
            compareTo = ((Car) o1).getName().compareTo(((Car) o2).getName());
        }
        return compareTo;
    }
}
