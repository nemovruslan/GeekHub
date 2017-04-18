package hw3.myowntasks.collectionframework.stack;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ruslan on 24.01.2017.
 */
public class StackImpl<T> implements Stack<T> {
    List<T> list;

    public StackImpl() {
        this.list = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T obj) {
        list.add(obj);
    }

    @Override
    public T pop() {
        if (list.isEmpty()) {
            throw new IndexOutOfBoundsException("Can't take element from stack with null size");
        }
        return list.remove(list.size() - 1);
    }

    @Override
    public List<T> getStack() {
        return list;
    }

    @Override
    public int size() {
        return list.size();
    }
}
