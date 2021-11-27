package Clases_CDF_E3;

public class OrdenarABC_Clase_Base implements OrdenarABC_Interfaz {
    private double valorA, valorB, valorC, num1, num2, num3;

    public OrdenarABC_Clase_Base(double xValorA, double xValorB, double xValorC) {
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

    public void OrdenarNúmeros() {
        if ((this.valorA <= this.valorB) && (this.valorB <= this.valorC)) {
            this.num1 = this.valorA;
            this.num2 = this.valorB;
            this.num3 = this.valorC;
        }
        if ((this.valorA <= this.valorC) && (this.valorC <= this.valorB)) {
            this.num1 = this.valorA;
            this.num2 = this.valorC;
            this.num3 = this.valorB;
        }
        if ((this.valorB <= this.valorA) && (this.valorA <= this.valorC)) {
            this.num1 = this.valorB;
            this.num2 = this.valorA;
            this.num3 = this.valorC;
        }
        if ((this.valorB <= this.valorC) && (this.valorC <= this.valorA)) {
            this.num1 = this.valorB;
            this.num2 = this.valorC;
            this.num3 = this.valorA;
        }
        if ((this.valorC <= this.valorA) && (this.valorA <= this.valorB)) {
            this.num1 = this.valorC;
            this.num2 = this.valorA;
            this.num3 = this.valorB;
        }
        if ((this.valorC <= this.valorB) && (this.valorB <= this.valorA)) {
            this.num1 = this.valorC;
            this.num2 = this.valorB;
            this.num3 = this.valorA;
        }
    }

    public double getNum1() {
        return this.num1;
    }
    
    public double getNum2() {
        return this.num2;
    }
    
    public double getNum3() {
        return this.num3;
    }
}
