public class PromedioCalificacion
{
    private int[] calificaciones = new int[50];
    private int apuntador;
    private double promedio;
    
    public PromedioCalificacion()
    {
        apuntador = 0;
    }
    
    public void InsertarCalificación(int calificacion)
    {
        try 
        {
            calificaciones[apuntador] = calificacion;
            apuntador++;
        } 
        catch (Exception e) 
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Error al insertar dato ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    
    public int ObtenerPromedioSuperior()
    {
        int resultado = 0, suma = 0;      
        
        for (int i = 0; i < 50; i++) 
        {
            suma += calificaciones[i];
        }
        promedio = suma /50;
        
        for (int i = 0; i < 50; i++) 
        {
            if (calificaciones[i] > promedio)
            {
                resultado ++;
            }
        }
        return resultado;
    }
    
    public int[] getCalificaciones() 
    { 
        return calificaciones;   
    }
    
    public int getApuntador() 
    {  
        return apuntador;   
    }
    
    public double getPromedio()
    {
        return promedio;
    }
}