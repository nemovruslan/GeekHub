package hw2;

import java.io.IOException;

/**
 * Created by Ruslan on 17.11.2016.
 */
public class Square extends Rectangle{

    public Square(double lengthSideA) {
        super(lengthSideA, lengthSideA);
    }

    @Override
    public String toString() {
        try {
            return "Triangle which is square" + " area = " + triangle.calculateArea() + "\n" +
                    "Triangle which is square" + " perimeter = " + triangle.calculatePerimeter() + "\n" +
                    "Square" + " area = " + calculateArea() + "\n" +
                    "Square" + " perimeter = " + calculatePerimeter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
