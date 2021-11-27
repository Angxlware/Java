package PilasDuplicarTamaño;

public class PilasDuplicarTamaño_ClaseBase {

    private int tamañoPila;
    private int puntero;
    private int[] pila;

    public PilasDuplicarTamaño_ClaseBase(int tamañoPila) {
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
        pila = new int[tamañoPila];
        puntero = -1;
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
            try {
                int[] pilaAuxiliar = pila.clone();
                tamañoPila *= 2;        
                pila = new int[tamañoPila];
                System.arraycopy(pilaAuxiliar, 0, pila, 0, pilaAuxiliar.length);
                return false;
            } catch (Exception e) {
                return true;
            }
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
