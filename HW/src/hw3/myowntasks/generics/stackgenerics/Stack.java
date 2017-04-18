package hw3.myowntasks.generics.stackgenerics;

/**
 * Created by Руслан on 04.11.2016.
 */
public interface Stack<T> {

    boolean isEmpty();
    void push(T obj);
    T pop();
    int size();
}
