package Clases_Vec_E3;

public class IntercMayMen_Clase_Base implements IntercMayMen_Interfaz {
    private int numMayor, numMenor;
    private int[] arregloA, arregloB;

    public IntercMayMen_Clase_Base(int[] xArregloA) {
        this.arregloA = xArregloA;
    }

    public void setArregloA(int[] xArregloA) {
        this.arregloA = xArregloA;
    }

    public void setNumMayor() {
        this.numMayor = this.arregloA[0];
        for (int i = 0; i < this.arregloA.length; i++) {
            if (this.arregloA[i] > this.numMayor) {
                this.numMayor = this.arregloA[i];
            }
        }
    }

    public void setNumMenor() {
        this.numMenor = this.arregloA[0];
        for (int i = 0; i < this.arregloA.length; i++) {
            if (this.arregloA[i] < this.numMenor) {
                this.numMenor = this.arregloA[i];
            }
        }
    }

    public void setArregloB() {
        this.arregloB = new int[this.arregloA.length];
        for (int i = 0; i < this.arregloA.length; i++) {
            if (this.arregloA[i] == numMayor) {
                this.arregloB[i] = numMenor;
            } 
            else if (this.arregloA[i] == numMenor) {
                this.arregloB[i] = numMayor;
            } 
            else {
                this.arregloB[i] = this.arregloA[i];
            }
        }
    }

    public int[] getArregloA() {
        return this.arregloA;
    }

    public int[] getArregloB() {
        return this.arregloB;
    }
    
    public int getNumMayor() {
        return this.numMayor;
    }

    public int getNumMenor() {
        return this.numMenor;
    }
}
