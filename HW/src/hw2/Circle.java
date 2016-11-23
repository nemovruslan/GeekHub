package hw2;

import java.io.IOException;

/**
 * Created by Ruslan on 17.11.2016.
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() throws IOException {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() throws IOException {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        try {
            return "Circle" + " area = " + calculateArea() + "\n" +
                    "Circle" + " perimeter = " + calculatePerimeter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
