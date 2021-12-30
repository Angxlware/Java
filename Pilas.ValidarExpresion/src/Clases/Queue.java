package Clases;

public class Queue {

    private final int queueSize;
    private char[] pila;
    private int pointer;

    public Queue(int queueSize) {
        this.queueSize = queueSize;
        this.pila = new char[queueSize];
        this.pointer = -1;
    }

    public void push(char data) throws Exception {
        if (!this.isFull()) {
            this.pointer++;
            this.pila[this.pointer] = data;
        } else {
            throw new Exception("ERROR: OVERFLOW DE LA PILA");
        }
    }

    public int pop() throws Exception {
        if (!this.isEmpty()) {
            int returnedValue = this.pila[this.pointer];
            this.pointer--;
            return returnedValue;
        } else {
            throw new Exception("ERROR: UNDERFLOW DE LA PILA");
        }
    }

    public void clear() throws Exception {
        this.pila = new char[this.queueSize];
        this.pointer = -1;
    }

    public char peek() {
        return this.pila[this.pointer];
    }

    public boolean isEmpty() {
        return this.pointer == -1;
    }

    public boolean isFull() {
        return this.pointer == queueSize - 1;
    }
}
