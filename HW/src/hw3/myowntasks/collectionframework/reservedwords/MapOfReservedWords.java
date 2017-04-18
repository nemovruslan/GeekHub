package hw3.myowntasks.collectionframework.reservedwords;

import java.io.*;
import java.util.*;

/**
 * Created by Ruslan on 17.02.2017.
 */
public class MapOfReservedWords {
    private Set<String> reservedWordsInJava = new HashSet<>();
    private SortedMap<String, Integer> reservedWordsInFileWhichPointedUser = new TreeMap<>();
    private File fileWhichPointedUser = new Directory().getDirectory();

    public SortedMap<String, Integer> buildMapOfReservedWordsInFile() throws IOException {
        fillingMapOfReservedWordsInJava();
        breaksIntoWordsSelectedFile();
        return reservedWordsInFileWhichPointedUser;
    }

    private void breaksIntoWordsSelectedFile() throws FileNotFoundException {
        String word;
        Scanner scanner = new Scanner(fileWhichPointedUser);
        while (scanner.hasNext()) {
            word = scanner.next();
            putReservedWordsInJavaFromFileToMap(word);
        }
        scanner.close();
    }

    private void putReservedWordsInJavaFromFileToMap(String word) {
        if (reservedWordsInFileWhichPointedUser.containsKey(word)) {
            Integer value = reservedWordsInFileWhichPointedUser.get(word);
            reservedWordsInFileWhichPointedUser.replace(word, value, ++value);
        } else if (reservedWordsInJava.contains(word)) {
            reservedWordsInFileWhichPointedUser.put(word, 1);
        }
    }

    private void fillingMapOfReservedWordsInJava() throws FileNotFoundException {
        File file = new File(("src/" + this.getClass().getPackage().getName() + "/ReservedWordsInJava").replace('.', '/'));
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            reservedWordsInJava.add(scanner.next());
        }
    }
}
