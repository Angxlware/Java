package Clases;

public class Queue {

    private final int queueSize;
    private String[] queue;
    private int front;
    private int rear;

    public Queue(int tamanoCola) {
        this.queueSize = tamanoCola;
        this.queue = new String[tamanoCola];
        this.front = -1;
        this.rear = -1;
    }

    public boolean add(String data) throws Exception {
        if (!this.isFull()) {
            this.front = 0;
            this.rear++;
            this.queue[this.rear] = data;
            return true;
        } else {
            throw new Exception("ERROR: OVERFLOW EN LA COLA");
        }
    }

    public String remove() throws Exception {
        if (!this.isEmpty()) {
            String retorno = this.queue[0];
            for (int i = 0; i < this.rear; i++) {
                if ((i + 1) < (queueSize)) {
                    this.queue[i] = this.queue[i + 1];
                }
            }
            this.queue[this.rear] = null;
            this.rear--;
            return retorno;
        } else {
            throw new Exception("ERROR: UNDERFLOW EN LA COLA");
        }
    }

    public String front() throws Exception {
        if (!this.isEmpty()) {
            return this.queue[this.front];
        } else {
            throw new Exception("ERROR: UNDERFLOW EN LA COLA");
        }
    }

    public String rear() throws Exception {
        if (!this.isEmpty()) {
            return this.queue[this.rear];
        } else {
            throw new Exception("ERROR: UNDERFLOW EN LA COLA");
        }
    }

    public void clear() {
        this.queue = new String[queueSize];
        this.front = -1;
        this.rear = -1;
    }

    public String[] getQueue() {
        return this.queue;
    }

    public int size() {
        return this.queue.length;
    }

    public boolean isEmpty() {
        return this.rear == -1;
    }

    public boolean isFull() {
        return this.rear == this.queueSize - 1;
    }
}
