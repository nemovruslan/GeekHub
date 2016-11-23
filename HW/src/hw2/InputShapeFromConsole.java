package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static hw2.Shapes.valueOf;

/**
 * Created by Ruslan on 23.11.2016.
 */
public class InputShapeFromConsole implements InputShape{
    private String inputString;

    @Override
    public Shapes inputStringRepresentationOfShape() throws IOException {
        do {
            outputMenu();
            getInputLine();
        } while (!equalsString());
        return valueOf(inputString);
    }

    private void outputMenu() {
        System.out.println("Write string representation of particular shapes, please.");
        for (Shapes count : Shapes.values()) {
            System.out.println(count.name());
        }
    }

    private void getInputLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inputString = reader.readLine();
    }

    private boolean equalsString() {
        for (Shapes shape : Shapes.values()) {
            if (shape.toString().equals(inputString)) {
                return true;
            }
        }
        return false;
    }

}
