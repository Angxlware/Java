/* 
https://github.com/Angxlware
Última revisión 28/11/2021
*/
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursividadBúsquedaDesordenada
{
    private static int invocaciones;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int[] arreglo = {31, 36, 88, 42, 15, 98, 777, 65, 23, 77, 13};
        int numBuscado, posición;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     BUSCAR EN UN ARREGLO DE FORMA RECURSIVA     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Digite el número que desea encontrar: ");
        numBuscado = Integer.parseInt(leer.readLine());
        
        posición = BúsquedaRecursiva(arreglo, numBuscado, 0);
        
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                   RESULTADOS                    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if (posición != -1) {
            System.out.println("El número se encontró en la posición: " + posición);
        }
        else {
            System.out.println("El elemento no forma parte del arreglo.");
        }
        System.out.println("No. de invocaciones: " + invocaciones);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    private static int BúsquedaRecursiva(int[] arreglo, int num, int posición)
    {
        invocaciones++;
        if (posición < arreglo.length) {
            if (arreglo[posición] == num) {
                return posición;
            }
            else {
                return BúsquedaRecursiva(arreglo, num, (posición + 1));
            }
        }
        else {
            return -1;
        }
    }
}
