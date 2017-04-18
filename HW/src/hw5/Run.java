package hw5;


import hw5.decorators.*;

import java.io.IOException;

/**
 * Created by Ruslan on 28.12.2016.
 */
public class Run {
    public static void main(String[] args) {
        DecoratorFindFiles typeOfFile = new LogFiles(new ZipFiles(new Video(new Image(new Audio()))));
        try {
            typeOfFile.findFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
