package hw3.myowntasks.collectionframework.reservedwords;

import java.util.*;

/**
 * Created by Ruslan on 21.02.2017.
 */
public class PrintMapOfReservedWords {
    public void printMapWhichWordsSortedOnTheNumberOfRepetitionsInTheFile(SortedMap<String, Integer> reservedWordsWhichSortedOnTheNumberOfRepetitionsInTheFile) {
        List list = new ArrayList(reservedWordsWhichSortedOnTheNumberOfRepetitionsInTheFile.entrySet());
        Collections.sort(list, (Comparator<Map.Entry<String, Integer>>) (a, b) -> {
            if (a.getValue() > b.getValue()) {
                return 1;
            } else if (a.getValue() < b.getValue()) {
                return -1;
            } else return 0;
        });
        list.forEach(System.out::println);
    }

    public void printMapWhichWordsSortedOfAlphabetically(SortedMap<String, Integer> reservedWordsWhichSortedOfAlphabetically) {
        reservedWordsWhichSortedOfAlphabetically.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
