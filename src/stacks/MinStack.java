package stacks;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    MinStack() {
        stack =  new Stack<>();
        minStack = new Stack<>();
    }

    public void push(Integer elem) {
        stack.push(elem);
        if(minStack.isEmpty() || elem <= minStack.peek()) {
            minStack.push(elem);
        }

    }

    public int pop() {
        Integer elem = stack.pop();
        if(elem == minStack.peek()) {
            minStack.pop();
        }
        return elem;

    }

    public int getMin() {
        return minStack.peek();
    }



}
