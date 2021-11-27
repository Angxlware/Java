package Clases_Mat_E3;

public class IntercambiarCol_Clase_Base implements IntercambiarCol_Interfaz {
    private int[][] matriz;

    public IntercambiarCol_Clase_Base(int[][] xMatriz) {
        this.matriz = xMatriz;
    }

    public void setMatriz(int[][] xMatriz) {
        this.matriz = xMatriz;
    }

    public void IntercambiarColumnas() {
        for (int i = 0; i < matriz.length; i++) {
            int auxiliar = this.matriz[i][0];
            this.matriz[i][0] = this.matriz[i][this.matriz[0].length - 1];
            this.matriz[i][this.matriz[0].length - 1] = auxiliar;
        }
    }
    
    public int[][] getMatriz() {
        return this.matriz;
    }
}
