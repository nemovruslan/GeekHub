package hw3.myowntasks.generics.stackgenerics;

/**
 * Created by Руслан on 04.11.2016.
 */
public class StackUtils<T> {

    protected Stack<T> reverse(Stack<T> stack){
        Stack<T> reverseStack = new ArrayStack<>();
        int stackLength = stack.size();
        for (int index = 0; index < stackLength; index++){
            reverseStack.push(stack.pop());
        }
        return reverseStack;
    }
}
