package PilasNumsPositivos;

public class PilasNumsPositivos_ClaseBase {

    private int tamañoPila;
    private int puntero;
    private int[] pila;

    public PilasNumsPositivos_ClaseBase(int tamañoPila) {
        this.tamañoPila = tamañoPila;
        this.puntero = -1;
        this.pila = new int[tamañoPila];
    }

    public void Push(int dato) throws Exception {
        if (!isFull()) {
            this.puntero++;
            this.pila[this.puntero] = dato;
        } else {
            throw new Exception("Error: Overflow de la pila");
        }
    }

    public int Pop() throws Exception {
        if (!isEmpty()) {
            int regreso = this.pila[this.puntero];
            this.pila[this.puntero] = -1;
            this.puntero--;
            return regreso;
        } else {
            throw new Exception("Error: Underflow de la pila");
        }
    }

    public void Clear() throws Exception {
        if (!isEmpty()) {
            for (int i = puntero; i >= 0; i--) {
                if (pila[i] < 0) {
                    for (int j = i; j < puntero; j++) {
                        pila[j] = pila[j + 1];
                    }
                    pila[puntero] = -1;
                    puntero--;
                }
            }
        }
        else {
            throw new Exception("Error: Underflow de la pila");
        }
    }

    public boolean isEmpty() {
        if (this.puntero == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if ((this.puntero + 1) >= this.tamañoPila) {
            return true;
        } else {
            return false;
        }
    }

    public int getElement() {
        return this.pila[this.puntero];
    }

    public int getLength() {
        return this.pila.length;
    }

    public int getTamañoPila() {
        return this.tamañoPila;
    }

    public int getPuntero() {
        return this.puntero;
    }

    public int[] getPila() {
        return this.pila;
    }
}
