package Clases_Mat_E2;

public class MayorDiagonal_Clase_Base implements MayorDiagonal_Interfaz {
    private int[][] matriz;
    private int numMayor;

    public MayorDiagonal_Clase_Base(int[][] xMatriz) {
        this.matriz = xMatriz;
    }

    public void setMatriz(int[][] xMatriz) {
        this.matriz = xMatriz;
    }

    public void setNumMayor() {
        this.numMayor = this.matriz[0][0];
        for (int i = 0; i < this.matriz.length; i++) {
            if (this.matriz[i][i] > this.numMayor) {
                this.numMayor = this.matriz[i][i];
            }
        }
    }

    public int getNumMayor() {
        return this.numMayor;
    }
}