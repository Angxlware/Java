/* 
https://github.com/Angxlware
Última revisión 28/11/2021
*/
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecorrerArreglo 
{
    private static int invocaciones;
    
    public static void main(String[] args) throws IOException 
    {
        int[] arreglo = {1, 7, 2, 92, 43, 12, 76, 12, 76, 41, 46, 12, 77};
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     RECORRER UN ARREGLO DE FORMA RECURSIVA      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        RecorrerArregloRecursivo(arreglo, 0);
        
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                  INVOCACIONES                   ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("No. de invocaciones: " + invocaciones);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    private static int ValidarEntero(String mensaje) throws java.io.IOException
    {
        BufferedReader leerTeclado = new BufferedReader(new InputStreamReader(System.in));
        String datoLeído;
        int datoInteger;
        do {
            System.out.print(mensaje);
            datoLeído = leerTeclado.readLine();
            if (datoLeído.equalsIgnoreCase("salir")) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("            PROGRAMA FINALIZADO CON ÉXITO            ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.exit(0);
            }
            else {
                try {
                    datoInteger = Integer.parseInt(datoLeído);
                    if (datoInteger <= 0) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("     ERROR: INTRODUZCA UN NÚMERO MAYOR QUE CERO      ");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        continue;
                    }
                    return datoInteger;
                }
                catch(NumberFormatException e) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("    ERROR: SOLAMENTE SE PUEDEN INTRODUCIR NÚMEROS    ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
        }
        while(true);
    }  
    
    private static void RecorrerArregloRecursivo(int[] arreglo, int índice)
    {
        invocaciones++;
        if (índice < arreglo.length) {
            System.out.println("Arreglo[" + índice + "]: " + arreglo[índice]);
            RecorrerArregloRecursivo(arreglo, (índice + 1));
        }
    }
}
