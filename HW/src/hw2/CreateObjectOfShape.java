package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ruslan on 23.11.2016.
 */
public class CreateObjectOfShape {
    private Shape shape;

    protected Shape createObjectOfInputShape(Shapes shapes) throws IOException {
        switch (shapes) {
            case Circle:
                circleParametersController();
                break;
            case Square:
                squareParametersController();
                break;
            case Rectangle:
                rectangleParametersController();
                break;
            case Triangle:
                triangleParametersController();
                break;
        }
        return shape;
    }

    private void rectangleParametersController() throws IOException {
        double lengthSideA, lengthSideB;
        outputConsole("Write length side a for rectangle, please.");
        lengthSideA = getValueFromConsole();
        outputConsole("Write length side b for rectangle, please.");
        lengthSideB = getValueFromConsole();
        shape = new Rectangle(lengthSideA, lengthSideB);
    }

    private void squareParametersController() throws IOException {
        double lengthSideA;
        outputConsole("Write length side a for Square, please.");
        lengthSideA = getValueFromConsole();
        shape = new Square(lengthSideA);
    }

    private void circleParametersController() throws IOException {
        outputConsole("Write radius for Circle, please.");
        shape = new Circle(getValueFromConsole());
    }

    private void triangleParametersController() throws IOException {
        double lengthSideA, lengthSideB, lengthSideC;
        outputConsole("Write length side a for Triangle, please.");
        lengthSideA = getValueFromConsole();
        outputConsole("Write length side b for Triangle, please.");
        lengthSideB = getValueFromConsole();
        outputConsole("Write length side c for Triangle, please.");
        lengthSideC = getValueFromConsole();
        shape = new Triangle(lengthSideA, lengthSideB, lengthSideC);
    }

    private void outputConsole(String text) {
        System.out.println(text);
    }

    private static double getValueFromConsole() throws IOException {
        boolean bool = false;
        double number = 0;
        do {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                number = Double.parseDouble(reader.readLine());
                bool = true;
            } catch (NumberFormatException e) {
                System.out.println("You input is not a number, please input the number.");
            }
        } while (!bool);
        return number;
    }
}
