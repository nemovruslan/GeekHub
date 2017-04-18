package hw3.myowntasks.generics.stackgenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Руслан on 04.11.2016.
 */
public class ArrayStack<T> implements Stack<T> {
    private List<T> stack;

    public ArrayStack(){
        stack = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public void push(T obj) {
        stack.add(obj);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException("Can't take element from stack with null size");
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public int size() {
        return stack.size();
    }
}
