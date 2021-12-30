package Clases;

public class Stack {

    private int stackSize;
    private int pointer;
    private int[] stack;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.pointer = -1;
        this.stack = new int[stackSize];
    }

    public void push(int data) throws Exception {
        if (!isFull()) {
            this.pointer++;
            this.stack[this.pointer] = data;
        } else {
            throw new Exception("Error: Overflow de la pila");
        }
    }

    public int pop() throws Exception {
        if (!isEmpty()) {
            int regreso = this.stack[this.pointer];
            this.stack[this.pointer] = -1;
            this.pointer--;
            return regreso;
        } else {
            throw new Exception("Error: Underflow de la pila");
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
        stack = new int[stackSize];
        pointer = -1;
    }

    public int[] getStack() throws Exception {
        return this.stack;
    }

    public boolean isEmpty() {
        return this.pointer == -1;
    }

    public boolean isFull() {
        if ((this.pointer + 1) >= this.stackSize) {
            try {
                int[] auxStack = stack.clone();
                stackSize *= 2;
                stack = new int[stackSize];
                System.arraycopy(auxStack, 0, stack, 0, auxStack.length);
                return false;
            } catch (Exception e) {
                return true;
            }
        } else {
            return false;
        }
    }
}
