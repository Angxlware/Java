package Clases_CDF_E2;

public class CalcularZ_Clase_Base implements CalcularZ_Interfaz {
    private double valorA, valorB, valorC, valorZ;

    public CalcularZ_Clase_Base(double xValorA, double xValorB, double xValorC) {
        this.valorA = xValorA;
        this.valorB = xValorB;
        this.valorC = xValorC;
    }

    public void setValorA(double xValorA) {
        this.valorA = xValorA;
    }

    public void setValorB(double xValorB) {
        this.valorB = xValorB;
    }

    public void setValorC(double xValorC) {
        this.valorC = xValorC;
    }

    public void setValorZ() {
        if (this.valorA - this.valorB < 0) {
            if (this.valorC - this.valorA < 0) {
                this.valorZ = ((-1 * (this.valorA - this.valorB)) / this.valorC)
                        + (-1 * (this.valorC - this.valorA));
            } 
            else {
                this.valorZ = ((-1 * (this.valorA - this.valorB)) / this.valorC)
                        + (this.valorC - this.valorA);
            }
        } 
        else {
            if (this.valorC - this.valorA < 0) {
                this.valorZ = (this.valorA - this.valorB) / this.valorC + (-1
                        * (this.valorC - this.valorA));
            } 
            else {
                this.valorZ = (this.valorA - this.valorB) / this.valorC
                        + (this.valorC - this.valorA);
            }
        }
    }
    
    public double getValorZ() {
        return this.valorZ;
    }
}
