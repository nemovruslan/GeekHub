package hw2;

import java.io.IOException;

/**
 * Created by Ruslan on 22.11.2016.
 */
public class Run {
    public static void main(String[] args) throws IOException {
        InputShape inputShape = new InputShapeFromConsole();
        Shapes shapes = inputShape.inputStringRepresentationOfShape();
        Shape shape = new CreateObjectOfShape().createObjectOfInputShape(shapes);
        OutputInformationAboutShape outputInformationAboutShape = new OutputInformationAboutShapeToConsole();
        outputInformationAboutShape.outputInformation(shape);
    }
}
