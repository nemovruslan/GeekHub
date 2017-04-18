package hw3.myowntasks.collectionframework.stack;

import java.util.List;

/**
 * Created by Ruslan on 24.01.2017.
 */
public interface Stack<T> {
    boolean isEmpty();
    void push(T obj);
    T pop();
    int size();
    List<T> getStack();
}
