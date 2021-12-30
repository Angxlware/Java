package Clases_Vec_E5;

public class PromTemp_Clase_Base implements PromTemp_Interfaz {
    private int contadorTemp;
    private double promedio;
    private int[] arreglo, temperaturas;

    public PromTemp_Clase_Base(int[] xArreglo) {
        this.arreglo = xArreglo;
    }

    public void setArreglo(int[] xArreglo) {
        this.arreglo = xArreglo;
    }

    public void setPromedio() {
        double sumatoria = 0;
        for (int i = 0; i < this.arreglo.length; i++) {
            sumatoria += this.arreglo[i];
        }
        this.promedio = sumatoria / arreglo.length;
    }

    public void setContadorTemp() {
        for (int i = 0; i < this.arreglo.length; i++) {
            if (this.arreglo[i] >= this.promedio) {
                this.contadorTemp++;
            }
        }
    }
    
    public void setTemperaturas() {
        int contador = 0;
        this.temperaturas = new int[this.contadorTemp];
        for (int i = 0; i < this.arreglo.length; i++) {
            if (this.arreglo[i] >= this.promedio) {
                this.temperaturas[contador] = this.arreglo[i];
                contador++;
            }
        }
    }

    public double getPromedio() {
        return this.promedio;
    }
    
    public int[] getTemperaturas() {
        return this.temperaturas;
    }
}