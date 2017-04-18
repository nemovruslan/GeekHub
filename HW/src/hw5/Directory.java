package hw5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ruslan on 23.01.2017.
 */
public class Directory {

    public File getDirectory(){
        File directory;
        do {
            System.out.println("Write path to directory, please.");
            String line = getInputLine();
            directory = new File(line);
        } while (!directory.isDirectory());
        return directory;
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
