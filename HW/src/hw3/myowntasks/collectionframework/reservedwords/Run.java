package hw3.myowntasks.collectionframework.reservedwords;

import java.io.IOException;
import java.util.SortedMap;

/**
 * Created by Ruslan on 19.02.2017.
 */
public class Run {
    public static void main(String[] args) throws IOException {
        MapOfReservedWords mapOfReservedWords = new MapOfReservedWords();
        SortedMap<String, Integer> map = mapOfReservedWords.buildMapOfReservedWordsInFile();
        PrintMapOfReservedWords printMapOfReservedWords = new PrintMapOfReservedWords();
        System.out.println("Map Which Words Sorted Of Alphabetically:");
        printMapOfReservedWords.printMapWhichWordsSortedOfAlphabetically(map);
        System.out.println("Map Which Words Sorted On The Number Of Repetitions In The File:");
        printMapOfReservedWords.printMapWhichWordsSortedOnTheNumberOfRepetitionsInTheFile(map);
    }
}
