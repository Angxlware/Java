/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

import java.io.IOException;

public class RecursividadRecorrerArreglo {

    private static int invocaciones;

    public static void main(String[] args) throws IOException {

        int[] arreglo = {1, 7, 2, 92, 43, 12, 76, 12, 76, 41, 46, 12, 77};

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     RECORRER UN ARREGLO DE FORMA RECURSIVA      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        RecorrerArregloRecursivamente(arreglo, 0);

        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                  INVOCACIONES                   ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("No. de invocaciones: " + invocaciones);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static void RecorrerArregloRecursivamente(int[] arreglo, int índice) {
        invocaciones++;
        if (índice < arreglo.length) {
            System.out.println("Arreglo[" + índice + "]: " + arreglo[índice]);
            RecorrerArregloRecursivamente(arreglo, (índice + 1));
        }
    }
}
