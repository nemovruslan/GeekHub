package hw3.myowntasks.collectionframework.reservedwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ruslan on 19.02.2017.
 */
public class Directory {
    public File getDirectory(){
        File file;
        do {
            System.out.println("Write path to file, please.");
            String line = getInputLine();
            file = new File(line);
        } while (!file.exists());
        return file;
    }

    private String getInputLine() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
