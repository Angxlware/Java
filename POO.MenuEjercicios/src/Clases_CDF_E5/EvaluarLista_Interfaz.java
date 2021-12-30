package Clases_CDF_E5;

public interface EvaluarLista_Interfaz 
{
    public void setDatoLeído(double xDatoLeído);
    
    public void setContador();
    public void setNumMayor();
    public void setNumMenor();
    public void setSumatoria();
    public void setPromedio();
    public void setRango();
    
    public int getContador();
    public double getNumMayor();
    public double getNumMenor();
    public double getSumatoria();
    public double getPromedio();
    public double getRango();
}