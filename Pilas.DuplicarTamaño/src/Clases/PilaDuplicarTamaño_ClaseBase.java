package Clases;

public class PilaDuplicarTamaño_ClaseBase {

    private int tamanoPila;
    private int puntero;
    private int[] pila;

    public PilaDuplicarTamaño_ClaseBase(int tamanoPila) {
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
        this.pila = new int[this.tamanoPila];
        this.puntero = -1;
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
            try {
                int[] pilaAuxiliar = pila.clone();
                tamanoPila *= 2;        
                pila = new int[tamanoPila];
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
        return this.tamanoPila;
    }

    public int getPuntero() {
        return this.puntero;
    }

    public int[] getPila() {
        return this.pila;
    }
}
