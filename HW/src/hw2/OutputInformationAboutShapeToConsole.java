package hw2;

import java.io.IOException;

/**
 * Created by Ruslan on 23.11.2016.
 */
public class OutputInformationAboutShapeToConsole implements OutputInformationAboutShape{

    @Override
    public void outputInformation(Shape shape) throws IOException {
        System.out.println(shape.toString());
    }
}
