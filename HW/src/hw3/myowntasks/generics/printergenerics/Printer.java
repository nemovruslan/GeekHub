package hw3.myowntasks.generics.printergenerics;

/**
 * Created by Руслан on 04.11.2016.
 */
public class Printer<T extends Printable>{

    void print(T[] array) {
        for (T obj : array) {
            obj.print();
        }
    }
}
