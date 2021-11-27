package Clases_Vec_E1;

public class EscalarArreglo_Clase_Base implements EscalarArreglo_Interfaz {
    private int[] arregloA, arregloB;
    private int escalar;

    public EscalarArreglo_Clase_Base(int[] xArreglo, int xEscalar) {
        this.arregloA = xArreglo;
        this.escalar = xEscalar;
    }

    public void setArregloA(int[] xArreglo) {
        this.arregloA = xArreglo;
    }

    public void setEscalar(int xEscalar) {
        this.escalar = xEscalar;
    }

    public void setArregloB() {
        this.arregloB = new int[arregloA.length];

        for (int i = 0; i < this.arregloA.length; i++) {
            this.arregloB[i] = (this.arregloA[i] * this.escalar);
        }
    }
    
    public int[] getArregloA() {
        return this.arregloA;
    }
    
    public int[] getArregloB() {
        return this.arregloB;
    }
}
