package hw3.myowntasks.collectionframework.stack.Test;


import hw3.myowntasks.collectionframework.stack.Stack;
import hw3.myowntasks.collectionframework.stack.StackImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ruslan on 24.01.2017.
 */
public class TestStack<T> {

    @Test
    public void testIsEmpty() {
        Stack<T> stack = new StackImpl<>();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testPush() {
        Stack<T> stack = new StackImpl<>();
        T obj = (T) new Object();
        T obj1 = (T) new Object();
        T obj2 = (T) new Object();
        stack.push(obj);
        stack.push(obj1);
        stack.push(obj2);
        T[] array = (T[]) new Object[3];
        array[0] = obj2;
        array[1] = obj1;
        array[2] = obj;
        int stackSize = stack.size();
        for (int index = 0; index < stackSize; index++) {
            Assert.assertTrue(stack.pop().equals(array[index]));
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPopNullPointerException() {
        Stack<T> stack = new StackImpl<>();
        stack.pop();
    }

    @Test
    public void testPop() {
        Stack<T> stack = new StackImpl<>();
        T obj = (T) new Object();
        stack.push(obj);
        Assert.assertTrue(stack.pop().equals(obj));
    }

    @Test
    public void testSize() {
        Stack<T> stack = new StackImpl<>();
        T obj = (T) new Object();
        T obj1 = (T) new Object();
        stack.push(obj);
        stack.push(obj1);
        Assert.assertTrue(stack.size() == 2);
    }

    @Test
    public void testGetStack() {
        Stack<T> stack = new StackImpl<>();
        T obj = (T) new Object();
        T obj1 = (T) new Object();
        T obj2 = (T) new Object();
        T obj3 = (T) new Object();
        stack.push(obj);
        stack.push(obj1);
        stack.push(obj2);
        stack.push(obj3);
        List list = new LinkedList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Assert.assertTrue(stack.getStack().equals(list));
    }
}
