package hw3.myowntasks.collectionframework.treesetdemowithcomparators;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Car bmw118i = new Car("118i", 25000, "BMW", 2015);
        Car bmw118i1 = new Car("118i", 25000, "BMW", 2010);
        Car opelAstra = new Car("Astra", 20000, "Opel", 1990);
        Car lexusLx300 = new Car("Lx300", 100000, "Lexus", 2016);
        Car bmwX6 = new Car("X6", 200000, "BMW", 2016);


        Set<Car> carsAsc = new TreeSet<>(new ReleaseDateAscComparator());
        carsAsc.add(bmw118i);
        carsAsc.add(bmw118i1);
        carsAsc.add(opelAstra);
        carsAsc.add(lexusLx300);
        carsAsc.add(bmwX6);
        Set<Car> carsDesc = new TreeSet<>(new ReleaseDateDescComparator());
        carsDesc.add(bmw118i);
        carsDesc.add(bmw118i1);
        carsDesc.add(opelAstra);
        carsDesc.add(lexusLx300);
        carsDesc.add(bmwX6);

        System.out.println("Asc");
        for (Car car : carsAsc) {
            System.out.println(car);
        }
        System.out.println("Desc");
        for (Car car : carsDesc) {
            System.out.println(car);
        }

    }
}
