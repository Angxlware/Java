package Clases_CDF_E4;

public interface CalcImpuestos_Interfaz 
{
    public void setImpuesto(double xImpuesto);
    public void setImporte(int xImporte);
    
    public void setImpuestoDelImporte();
    public void setTotal();
    
    public double getImpuestoDelImporte();
    public double getTotal();
    
}