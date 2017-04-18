package hw3.myowntasks.collectionframework.treesetdemo;


import hw3.myowntasks.collectionframework.treesetdemowithcomparators.Car;

import java.util.Set;

public class TreeSetDemo {
    public static void main(String[] args) {
        Car bmw118i = new Car("118i", 2500, "BMW", 2015);
        Car bmw118i1 = new Car("118i", 25000, "BMW1", 2015);
        Car bmw118i2 = new Car("118i", 250000, "BMW1", 2015);
        Car opelAstra = new Car("Astra", 20000, "Opel", 1990);
        Car lexusLx300 = new Car("Lx300", 100000, "Lexus", 2016);

        AnonymousComparator anonymousComparator = new AnonymousComparator();
        Set<Car> carsAsc = anonymousComparator.getCarsAsc();
        Set<Car> carsDesc = anonymousComparator.getCarsDesc();

        System.out.println("Asc");
        carsAsc.add(bmw118i2);
        carsAsc.add(bmw118i);
        carsAsc.add(bmw118i1);
        carsAsc.add(opelAstra);
        carsAsc.add(lexusLx300);
        for (Car car : carsAsc) {
            System.out.println(car);
        }
        System.out.println("Desc");
        carsDesc.add(bmw118i2);
        carsDesc.add(bmw118i);
        carsDesc.add(bmw118i1);
        carsDesc.add(opelAstra);
        carsDesc.add(lexusLx300);
        for (Car car : carsDesc) {
            System.out.println(car);
        }
    }
}
