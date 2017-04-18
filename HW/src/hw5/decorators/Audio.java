package hw5.decorators;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Ruslan on 28.01.2017.
 */
public class Audio extends FindFiles {
    @Override
    public void findFiles() throws IOException {
        format.addAll(Arrays.asList(".mp3", ".wav", ".wma"));
        super.findFiles();
    }
}
