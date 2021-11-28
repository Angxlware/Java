package Clases_Vec_E2;

public class RepMayMen_Clase_Base implements RepMayMen_Interfaz {
    private int numMayor, numMenor, repMayor, repMenor;
    private int[] arreglo, indMayor, indMenor;

    public RepMayMen_Clase_Base(int[] xArreglo) {
        this.arreglo = xArreglo;
    }

    public void setArreglo(int[] xArreglo) {
        this.arreglo = xArreglo;
    }

    public void setNumMayor() {
        this.numMayor = this.arreglo[0];
        for (int i = 0; i < this.arreglo.length; i++) {
            if (this.arreglo[i] > this.numMayor) {
                this.numMayor = this.arreglo[i];
            }
        }
    }

    public void setNumMenor() {
        this.numMenor = this.arreglo[0];
        for (int i = 0; i < this.arreglo.length; i++) {
            if (this.arreglo[i] < this.numMenor) {
                this.numMenor = this.arreglo[i];
            }
        }
    }
    
    public void setRepMayor() {
        for (int i = 0; i < this.arreglo.length; i++) {
            if (this.numMayor == this.arreglo[i]) {
                this.repMayor++;
            }
        }
    }
    
    public void setRepMenor() {
        for (int i = 0; i < this.arreglo.length; i++) {
            if (this.numMenor == this.arreglo[i]) {
                this.repMenor++;
            }
        }
    }
    
    public void setIndMayor() {
        this.indMayor = new int[this.repMayor];
        int contador = 0;

        for (int i = 0; i < this.arreglo.length; i++) {
            if (this.numMayor == arreglo[i]) {
                this.indMayor[contador] = (i + 1);
                contador++;
            }
        }
    }
    
    public void setIndMenor() {
        this.indMenor = new int[this.repMenor];
        int contador = 0;
        for (int i = 0; i < this.arreglo.length; i++) {
            if (this.numMenor == arreglo[i]) {
                this.indMenor[contador] = (i + 1);
                contador++;
            }
        }
    }
    
    public int getNumMayor() {
        return this.numMayor;
    }
    
    public int getNumMenor() {
        return this.numMenor;
    }

    public int getRepMayor() {
        return this.repMayor;
    }

    public int getRepMenor() {
        return this.repMenor;
    }

    public int[] getIndMayor() {
        return this.indMayor;
    }

    public int[] getIndMenor() {
        return this.indMenor;
    } 
}