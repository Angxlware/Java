package Clases_Mat_E5;

public class MaySumResDP_Clase_Base implements MaySumResDP_Interfaz {
    private int[][] matriz;
    private int numMayor;

    public MaySumResDP_Clase_Base(int[][] xMatriz) {
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

    public void ModificarDiagonalPrincipal() {
        for (int i = 1; i < this.matriz.length; i++) {
            this.matriz[0][i] += this.numMayor;
            this.matriz[matriz.length - 1][i - 1] -= this.numMayor;
        }
    }
    
    public int[][] getMatriz() {
        return this.matriz;
    }
    
    public int getNumMayor() {
        return this.numMayor;
    }
}