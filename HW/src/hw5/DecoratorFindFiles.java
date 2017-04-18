package hw5;

import hw5.decorators.FindFiles;

import java.io.IOException;

/**
 * Created by Ruslan on 20.01.2017.
 */
public class DecoratorFindFiles extends FindFiles {
    protected FindFiles decoratorFindFiles;

    public DecoratorFindFiles(FindFiles decoratorFindFiles) {
        this.decoratorFindFiles = decoratorFindFiles;
    }

    @Override
    public void findFiles() throws IOException {
        this.decoratorFindFiles.findFiles();
    }
}
