package hw5;

/**
 * Created by Ruslan on 26.11.2016.
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
    private static List<String> audioFormats = new ArrayList<>();
    private static List<String> videoFormats = new ArrayList<>();
    private static List<String> imageFormats = new ArrayList<>();
    private static List<String> docFormats = new ArrayList<>();
    private static File directory = getDirectory();

    public static void main(String[] args) throws IOException {
        addTypesToCollections();
        try {
            File[] pathsAudio = getFiles(audioFormats);
            File[] pathsVideo = getFiles(videoFormats);
            File[] pathsImage = getFiles(imageFormats);
            File[] pathsDoc = getFiles(docFormats);
            createZip(pathsAudio, "audio");
            createZip(pathsVideo, "video");
            createZip(pathsImage, "image");
            createZip(pathsDoc, "doc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addTypesToCollections() {
        Collections.addAll(audioFormats, ".mp3", ".wav", ".wma");
        Collections.addAll(videoFormats, ".avi", ".mp4", ".flv");
        Collections.addAll(imageFormats, ".jpeg", ".jpg", ".gif", ".png");
        Collections.addAll(docFormats, ".txt", ".doc", ".docx", ".xls", ".xlsx");
    }

    private static File[] getFiles(List<String> format) {
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.lastIndexOf('.') > 0) {
                    int lastIndex = name.lastIndexOf('.');
                    String str = name.substring(lastIndex);
                    if (format.contains(str)) {
                        return true;
                    }
                }
                return false;
            }
        };
        return directory.listFiles(filter);
    }

    private static File getDirectory() {
        File directory;
        do {
            System.out.println("Write path to directory, please.");
            String line = getInputLine();
            directory = new File(line);
        } while (!directory.isDirectory());
        return directory;
    }

    private static String getInputLine() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void createZip(File[] paths, String nameOfZip) throws IOException {
        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(new File(directory + "/" + nameOfZip + ".zip")));
        for (File file : paths) {
            zip.putNextEntry(new ZipEntry(file.getName()));
            zip.write(Files.readAllBytes(Paths.get(file.getPath())));
        }
        zip.close();
    }
}
