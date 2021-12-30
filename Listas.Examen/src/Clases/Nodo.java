package Clases;

public class Nodo {

    private int dato;
    private Nodo ligaDerecha;

    public Nodo(int dato) {
        this.dato = dato;
        this.ligaDerecha = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLigaDerecha() {
        return ligaDerecha;
    }

    public void setLigaDerecha(Nodo nodo) {
        this.ligaDerecha = nodo;
    }
}
