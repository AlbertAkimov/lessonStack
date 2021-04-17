package com.base;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private final int[] stk;
    private int top;

    Stack(int size) {
        stk = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException("Current stack is full");
        else {
            stk[++top] = value;
            System.out.println("push to stack value [" + value + "]");
        }
    }

    public int pop() {
        if (isEmpty())
            throw new EmptyStackException();

        int peek = peek();
        stk[top] = 0;
        top--;
        return peek;
    }

    public int peek() {
        return stk[top];
    }

    public void print() {

        System.out.println("Elements of current stack");
        System.out.print("[");
        Arrays.stream(stk)
                .filter(value -> value > 0)
                .forEach(x -> System.out.print(x + ", "));
        System.out.print("]" + "\n\n");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stk.length - 1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stk=" + Arrays.toString(stk) +
                ", top=" + top +
                '}';
    }
}
