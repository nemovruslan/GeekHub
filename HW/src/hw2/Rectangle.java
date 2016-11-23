package hw2;

import java.io.IOException;

/**
 * Created by Ruslan on 17.11.2016.
 */
public class Rectangle implements Shape{
    private double lengthSideA, lengthSideB;
    protected Triangle triangle;

    public Rectangle(double lengthSideA, double lengthSideB) {
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        triangle = new Triangle(lengthSideA, lengthSideB);
    }

    @Override
    public double calculateArea() throws IOException {
        return lengthSideA * lengthSideB;
    }

    @Override
    public double calculatePerimeter() throws IOException {
        return 2 * (lengthSideA + lengthSideB);
    }

    @Override
    public String toString() {
        try {
            return "Triangle which consists of a rectangle" + " area = " + triangle.calculateArea() + "\n" +
                    "Triangle which consists of a rectangle" + " perimeter = " + triangle.calculatePerimeter() + "\n" +
                    "Rectangle" + " area = " + calculateArea() + "\n" +
                    "Rectangle" + " perimeter = " + calculatePerimeter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
