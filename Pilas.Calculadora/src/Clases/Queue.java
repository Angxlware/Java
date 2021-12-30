package Clases;

public class Queue {

    private final int queueSize;
    private double[] queue;
    private int pointer;

    public Queue(int queueSize) {
        this.queueSize = queueSize;
        this.queue = new double[queueSize];
        this.pointer = -1;
    }

    public void add() throws Exception {
        if (!this.isEmpty()) {
            this.queue[this.pointer - 1] += this.pop();
        } else {
            throw new Exception("ERROR: UNDERFLOW EN LA PILA");
        }
    }

    public void sub() throws Exception {
        if (!this.isEmpty()) {
            this.queue[this.pointer - 1] -= this.pop();
        } else {
            throw new Exception("ERROR: UNDERFLOW EN LA PILA");
        }
    }

    public void mul() throws Exception {
        if (!this.isEmpty()) {
            this.queue[this.pointer - 1] *= this.pop();
        } else {
            throw new Exception("ERROR: UNDERFLOW EN LA PILA");
        }
    }

    public void div() throws Exception {
        if (!this.isEmpty()) {
            this.queue[this.pointer - 1] /= this.pop();
        } else {
            throw new Exception("ERROR: UNDERFLOW EN LA PILA");
        }
    }

    public void push(double data) throws Exception {
        if (!this.isFull()) {
            this.pointer++;
            this.queue[this.pointer] = data;
        } else {
            throw new Exception("ERROR: OVERFLOW DE LA PILA");
        }
    }

    public double pop() throws Exception {
        if (!this.isEmpty()) {
            double returnedValue = this.queue[this.pointer];
            this.pointer--;
            return returnedValue;
        } else {
            throw new Exception("ERROR: UNDERFLOW DE LA PILA");
        }
    }

    public void clear() throws Exception {
        this.queue = new double[this.queueSize];
        this.pointer = -1;
    }

    public double peek() {
        return this.queue[this.pointer];
    }

    public boolean isEmpty() {
        return this.pointer == -1;
    }

    public boolean isFull() {
        return this.pointer == queueSize - 1;
    }
}
