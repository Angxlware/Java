import java.util.Scanner;

public class TDAArregloPromedioCalificaciones
{
    public static void main(String[] args) 
    {
        PromedioCalificacion objPromedio = new PromedioCalificacion();
        
        for (int i = 0; i < 50; i++) 
        {
            while(true)
            {
                System.out.print("Ingrese la calificación #" + (i + 1) + ": ");
                Scanner sc = new Scanner(System.in);
                try
                {
                    int calificación  = sc.nextInt();
                    if ((calificación < 1) || (calificación > 10))
                    {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(" Error: La calificación debe de ser"
                                + " mayor que 0 y menor que 11 ");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        continue;
                    }
                    objPromedio.InsertarCalificación(calificación); 
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" Error: Tipo de dato inválido ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
        }
        
        System.out.println("La cantidad de calificaciones que están por encima "
                + "del promedio son: " + objPromedio.ObtenerPromedioSuperior());
        System.out.println("El promedio es de: " + objPromedio.getPromedio());
    }
}