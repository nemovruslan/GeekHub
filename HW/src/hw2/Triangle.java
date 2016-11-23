package hw2;

/**
 * Created by Ruslan on 17.11.2016.
 */
public class Triangle implements Shape {
    private double lengthSideA, lengthSideB, lengthSideC, height, semiperimeter;

    public Triangle(double lengthSideA, double lengthSideB, double lengthSideC) {
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        this.lengthSideC = lengthSideC;
        this.height = getHeight();
    }

    public Triangle(double lengthSideA, double lengthSideB) {
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        this.lengthSideC = getLengthSideC();
        this.height = getHeight();
    }

    private double getLengthSideC() {
        return Math.sqrt(lengthSideA * lengthSideA + lengthSideB * lengthSideB);
    }

    private double getHeight() {
        getSemiperimeter();
        return (2 * Math.sqrt(semiperimeter * (semiperimeter - lengthSideA) * (semiperimeter - lengthSideB) * (semiperimeter - lengthSideC))) / lengthSideA;
    }

    private void getSemiperimeter() {
        semiperimeter = (lengthSideA + lengthSideB + lengthSideC) / 2;
    }

    @Override
    public double calculateArea() {
        return 0.5 * lengthSideA * height;
    }

    @Override
    public double calculatePerimeter() {
        return lengthSideA + lengthSideB + lengthSideC;
    }


    @Override
    public String toString() {
        return "Triangle" + " area = " + calculateArea() + "\n" +
                "Triangle" + " perimeter = " + calculatePerimeter();
    }
}
