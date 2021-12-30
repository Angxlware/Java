package Clases_CDF_E1;

public class CalcularY_Clase_Base implements CalcularY_Interfaz {
    private double valorA, valorB, valorX, valorY;

    public CalcularY_Clase_Base(double xValorX, double xValorA, double xValorB) {
        this.valorX = xValorX;
        this.valorA = xValorA;
        this.valorB = xValorB;
    }

    public void setValorA(double xValorA) {
        this.valorA = xValorA;
    }

    public void setValorB(double xValorB) {
        this.valorB = xValorB;
    }

    public void setValorX(double xValorX) {
        this.valorX = xValorX;
    }

    public void setValorY() {
        if (this.valorX < 0) {
            this.valorY = (10 * this.valorA - 2 * this.valorB);
        } 
        else if ((this.valorX > 0) && (this.valorX <= 20)) {
            if ((40 * this.valorA - this.valorB) < 0) {
                this.valorY = (-1 * (40 * this.valorA - this.valorB));
            }
            else {
                this.valorY = (40 * this.valorA - this.valorB);
            }
        } 
        else {
            if ((50 * this.valorA - 2 * this.valorB) < 0) {
                this.valorY = (-1 * (50 * this.valorA - 2 * this.valorB));
            } 
            else {
                this.valorY = (50 * this.valorA - 2 * this.valorB);
            }
        }
    }
    
    public double getValorY() {
        return this.valorY;
    }
}
