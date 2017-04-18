package hw5.decorators;

import hw5.DecoratorFindFiles;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Ruslan on 28.01.2017.
 */
public class Image extends DecoratorFindFiles {

    public Image(FindFiles decoratorFindFiles) {
        super(decoratorFindFiles);
    }

    @Override
    public void findFiles() throws IOException {
        format.addAll(Arrays.asList(".jpeg", ".jpg", ".gif", ".png"));
        super.findFiles();
    }
}
