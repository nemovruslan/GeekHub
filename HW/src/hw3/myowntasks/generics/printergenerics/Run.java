package hw3.myowntasks.generics.printergenerics;


/**
 * Created by Руслан on 06.11.2016.
 */
public class Run {
    public static void main(String[] args) {
        Print[] array = new Print[2];
        array[0] = new Print();
        array[1] = new Print();
        Printer<Print> printer = new Printer<>();
        printer.print(array);
    }
}
