/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursividadSumarNVeces {

    private static int invocaciones;

    public static void main(String[] args) throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int num, suma;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("           SUMA DE UN NÚMERO N VECES             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese el número a sumar n veces: ");
        num = Integer.parseInt(leer.readLine());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        suma = SumarNVecesRecursivamente(num, num);

        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                   RESULTADOS                    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Resultado: " + suma);
        System.out.println("No. de invocaciones: " + invocaciones);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static int SumarNVecesRecursivamente(int n, int contador) {

        invocaciones++;

        if (contador == 1) {
            return n;
        } else {
            return n + SumarNVecesRecursivamente(n, (contador - 1));
        }
    }
}
