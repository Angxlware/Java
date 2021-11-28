package Clases_CDF_E4;

public class CalcImpuestos_Clase_Base implements CalcImpuestos_Interfaz {
    private double impuesto, impuestoDelImporte, total;
    private int importe;

    public CalcImpuestos_Clase_Base(double xImpuesto, int xImporte) {
        this.impuesto = xImpuesto;
        this.importe = xImporte;
    }

    public void setImpuesto(double xImpuesto) {
        this.impuesto = xImpuesto;
    }

    public void setImporte(int xImporte) {
        this.importe = xImporte;
    }

    public void setImpuestoDelImporte() {
        this.impuestoDelImporte = this.importe * (this.impuesto / 100);
    }
    
    public void setTotal() {
        this.total = this.importe + this.impuestoDelImporte;
    }

    public double getImpuestoDelImporte() {
        return this.impuestoDelImporte;
    }
    
    public double getTotal() {
        return this.total;
    }
}