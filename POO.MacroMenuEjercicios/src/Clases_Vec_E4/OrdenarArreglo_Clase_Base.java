package Clases_Vec_E4;

public class OrdenarArreglo_Clase_Base implements OrdenarArreglo_Interfaz {
    private int[] arreglo;

    public OrdenarArreglo_Clase_Base(int[] xArreglo) {
        this.arreglo = xArreglo;
    }

    public void setArreglo(int[] xArreglo) {
        this.arreglo = xArreglo;
    }

    public void OrdenarArreglo() {
        int auxiliar;
        for (int i = 0; i < this.arreglo.length; i++) {
            for (int j = 0; j < (this.arreglo.length - 1); j++) {
                if (this.arreglo[j] < this.arreglo[j + 1]) {
                    auxiliar = this.arreglo[j + 1];
                    this.arreglo[j + 1] = this.arreglo[j];
                    this.arreglo[j] = auxiliar;
                }
            }
        }
    }
    
    public int[] getArreglo() {
        return this.arreglo;
    }
}
