package hw3.myowntasks.generics.stackgenerics.Test;

import hw3.myowntasks.generics.stackgenerics.ArrayStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Руслан on 05.11.2016.
 */
public class TestArrayStack<T> {

    @Test
    public void testIsEmpty() {
        ArrayStack<T> stack = new ArrayStack<>();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testPush() {
        ArrayStack<T> stack = new ArrayStack<>();
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

    @Test(expected = NullPointerException.class)
    public void testPopNullPointerException() {
        ArrayStack<T> stack = new ArrayStack<>();
        stack.pop();
    }

    @Test
    public void testPop(){
        ArrayStack<T> stack = new ArrayStack<>();
        T obj = (T) new Object();
        stack.push(obj);
        Assert.assertTrue(stack.pop().equals(obj));
    }

    @Test
    public void testSize(){
        ArrayStack<T> stack = new ArrayStack<>();
        T obj = (T) new Object();
        T obj1 = (T) new Object();
        stack.push(obj);
        stack.push(obj1);
        Assert.assertTrue(stack.size() == 2);
    }
}
