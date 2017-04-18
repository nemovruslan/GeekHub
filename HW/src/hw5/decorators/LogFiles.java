package hw5.decorators;

import hw5.DecoratorFindFiles;
import hw5.Logger;
import hw5.FilesLogger;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ruslan on 23.01.2017.
 */
public class LogFiles extends DecoratorFindFiles {
    static Logger logger = new FilesLogger();

    public LogFiles(FindFiles decoratorFindFiles) {
        super(decoratorFindFiles);
    }

    @Override
    public void findFiles() {
        try {
            logger.log("Search and add files to the archive began.");
            super.findFiles();
            logger.log("In this directory was found following files:");
            int count = 1;
            for (File file : files) {
                logger.log(count++ + ". " + file.getName());
            }
            logger.log("Search and add files to archive completed.");
        } catch (NullPointerException | IllegalArgumentException | IOException e) {
            logger.error(e);
        }
    }
}
