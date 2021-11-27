package eficienciadealgoritmos;

import java.util.Arrays;

public class EficienciaDeAlgoritmos 
{
    public static void main(String[] args)                                      
    {
        int[] arreglo = {1, 2, 5, 8, 20};
        int izq = 0, der = (arreglo.length - 1), cen = ((izq + der) / 2);
        
        Arrays.sort(arreglo);
        while ((izq <= der) && (5 != arreglo[cen])) 
        {
            if (5 > arreglo[cen]) 
                izq = (cen + 1);
            else 
                der = (cen - 1);
            cen = ((izq + der) / 2);
        }
        
        if (izq > der) 
            System.out.println("Ese elemento no existe en el vector");
        else 
            System.out.println("El elemento está en la posición " + (cen + 1));
    }
}