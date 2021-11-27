package Clases_Mat_E1;

public class EscalarMatriz_Clase_Base implements EscalarMatriz_Interfaz {
    private int[][] matriz;
    private int escalar;

    public EscalarMatriz_Clase_Base(int[][] xMatriz, int xEscalar) {
        this.matriz = xMatriz;
        this.escalar = xEscalar;
    }

    public void setMatriz(int[][] xMatriz) {
        this.matriz = xMatriz;
    }

    public void setEscalar(int xEscalar) {
        this.escalar = xEscalar;
    }

    public void EscalarMatriz() {
        for (int i = 0; i < this.matriz[0].length; i++) {
            this.matriz[0][i] *= this.escalar;
            this.matriz[this.matriz.length - 1][i] += this.matriz[0][i];
        }
    }
    
    public int[][] getMatriz() {
        return this.matriz;
    }
}
