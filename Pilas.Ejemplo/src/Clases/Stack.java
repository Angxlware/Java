package Clases;

public class Stack {

    private final int stackSize;
    private int[] stack;
    private int pointer;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.stack = new int[stackSize];
        this.pointer = -1;
    }

    public void push(int data) throws Exception {
        if (!this.isFull()) {
            this.pointer++;
            this.stack[this.pointer] = data;
        } else {
            throw new Exception("ERROR: OVERFLOW DE LA PILA");
        }
    }

    public int pop() throws Exception {
        if (!this.isEmpty()) {
            int returnValue = this.stack[this.pointer];
            this.pointer--;
            return returnValue;
        } else {
            throw new Exception("ERROR: UNDERFLOW DE LA PILA");
        }
    }

    public int peek() throws Exception {
        if (!isEmpty()) {
            return this.stack[this.pointer];
        } else {
            throw new Exception("ERROR: UNDERFLOW DE LA PILA");
        }
    }

    public void clear() throws Exception {
        this.stack = new int[this.stackSize];
        this.pointer = -1;
    }

    public int[] getStack() throws Exception {
        return this.stack;
    }

    public boolean isEmpty() {
        return this.pointer == -1;
    }

    public boolean isFull() {
        return this.pointer == stackSize - 1;
    }
}
