package hw5.decorators;

import hw5.DecoratorFindFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Ruslan on 20.01.2017.
 */
public class ZipFiles extends DecoratorFindFiles {
    private List<String> audioFormat = Arrays.asList(".mp3", ".wav", ".wma");
    private List<String> videoFormat = Arrays.asList(".avi", ".mp4", ".flv");
    private List<String> imageFormat = Arrays.asList(".jpeg", ".jpg", ".gif", ".png");
    private List<File> audioFiles = new ArrayList<>();
    private List<File> videoFiles = new ArrayList<>();
    private List<File> imageFiles = new ArrayList<>();

    public ZipFiles(FindFiles decoratorFindFiles) {
        super(decoratorFindFiles);
    }

    @Override
    public void findFiles() throws IOException {
        super.findFiles();
        getDistributedFiles();
        createZip(audioFiles, "audio");
        createZip(videoFiles, "video");
        createZip(imageFiles, "image");
    }

    private void getDistributedFiles() {
        for (File file : files) {
            if (decoratorFindFiles.typeFilter(file, audioFormat)) {
                audioFiles.add(file);
            } else if (decoratorFindFiles.typeFilter(file, videoFormat)) {
                videoFiles.add(file);
            } else if (decoratorFindFiles.typeFilter(file, imageFormat)) {
                imageFiles.add(file);
            }
        }
    }

    private void createZip(List<File> paths, String nameOfZip) throws IOException {
        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(new File(directory + "/" + nameOfZip + ".zip")));
        for (File file : paths) {
            zip.putNextEntry(new ZipEntry(file.getName()));
            zip.write(Files.readAllBytes(Paths.get(file.getPath())));
        }
        zip.close();
    }
}
