package hw5.decorators;

import hw5.Directory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan on 10.01.2017.
 */
public class FindFiles {
    protected static List<String> format = new ArrayList<>();
    protected static List<File> files = new ArrayList<>();
    protected static File directory;

    public void findFiles() throws IOException {
        directory = new Directory().getDirectory();
        search(directory);
    }

    private void search(File directory) {
        File[] list = directory.listFiles();
        for (File file : list) {
            if (file.isDirectory()) {
                search(file);
            } else {
                if (typeFilter(file, format)) {
                    files.add(file);
                }
            }
        }
    }

    protected boolean typeFilter(File file, List<String> format) {
        if (file.getAbsolutePath().lastIndexOf('.') > 0) {
            int lastIndex = file.getAbsolutePath().lastIndexOf('.');
            String str = file.getAbsolutePath().substring(lastIndex);
            for (String s : format) {
                if (s.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
