package Clases_Mat_E4;

public class SumarColum_Clase_Base implements SumarColum_Interfaz {
    private int[][] matriz;
    private int suma;

    public SumarColum_Clase_Base(int[][] xMatriz) {
        this.matriz = xMatriz;
    }

    public void setMatriz(int[][] xMatriz) {
        this.matriz = xMatriz;
    }

    public void setSuma() {
        for (int i = 0; i < this.matriz.length; i++) {
            this.suma += this.matriz[i][0];
            this.suma += this.matriz[i][this.matriz[0].length - 1];
        }
    }
    
    public int[][] getMatriz() {
        return this.matriz;
    }
    
    public int getSuma() {
        return this.suma;
    }
}
