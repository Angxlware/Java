package Clases;

public class PilaNumsPositivos_ClaseBase {

    private int tamanoPila;
    private int puntero;
    private int[] pila;

    public PilaNumsPositivos_ClaseBase(int tamanoPila) {
        this.tamanoPila = tamanoPila;
        this.puntero = -1;
        this.pila = new int[tamanoPila];
    }

    public void Push(int dato) throws Exception {
        if (!isFull()) {
            this.puntero++;
            this.pila[this.puntero] = dato;
        } else {
            throw new Exception("ERROR: OVERFLOW DE LA PILA");
        }
    }

    public int Pop() throws Exception {
        if (!isEmpty()) {
            int regreso = this.pila[this.puntero];
            this.pila[this.puntero] = -1;
            this.puntero--;
            return regreso;
        } else {
            throw new Exception("ERROR: UNDERFLOW DE LA PILA");
        }
    }

    public void Clear() throws Exception {
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

    public boolean isEmpty() {
        if (this.puntero == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if ((this.puntero + 1) >= this.tamanoPila) {
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

    public int getTamanoPila() {
        return this.tamanoPila;
    }

    public int getPuntero() {
        return this.puntero;
    }

    public int[] getPila() {
        return this.pila;
    }
}
