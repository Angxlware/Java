package Clases_CDF_E5;

public class EvaluarLista_Clase_Base implements EvaluarLista_Interfaz {
    private double datoLeído, numMayor, numMenor, sumatoria, promedio, rango;
    private int contador;

    public EvaluarLista_Clase_Base() {
        this.datoLeído = this.numMayor = this.numMenor = this.sumatoria
                = this.promedio = this.rango = 0;
        this.contador = 0;
    }

    public void setDatoLeído(double xDatoLeído) {
        this.datoLeído = xDatoLeído;
        if (contador == 1) {
            this.numMayor = this.numMenor = this.datoLeído;
        }
    }

    public void setContador() {
        this.contador++;
    }

    public void setNumMayor() {
        if (this.datoLeído > this.numMayor) {
            this.numMayor = this.datoLeído;
        }
    }

    public void setNumMenor() {
        if (this.datoLeído < this.numMenor) {
            this.numMenor = this.datoLeído;
        }
    }

    public void setSumatoria() {
        this.sumatoria += this.datoLeído;
    }

    public void setPromedio() {
        this.promedio = this.sumatoria / this.contador;
    }

    public void setRango() {
        this.rango = this.numMayor - this.numMenor;
    }
    
    public int getContador() {
        return this.contador;
    }
    
    public double getNumMayor() {
        return this.numMayor;
    }
    
    public double getNumMenor() {
        return this.numMenor;
    }
    
    public double getSumatoria() {
        return this.sumatoria;
    }
    
    public double getPromedio() {
        return this.promedio;
    }
    
    public double getRango() {
        return this.rango;
    }
}