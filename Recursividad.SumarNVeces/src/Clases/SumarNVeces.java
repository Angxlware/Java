/* 
https://github.com/Angxlware
Última revisión 28/11/2021
*/
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumarNVeces 
{
    private static int invocaciones;
    
    public static void main(String[] args) throws IOException 
    {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int num, suma;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("           SUMA DE UN NÚMERO N VECES             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese el número a sumar n veces: ");
        num = Integer.parseInt(leer.readLine());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        suma = SumaNVecesRecursiva(num, num);
        
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                   RESULTADOS                    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Resultado: " + suma);
        System.out.println("No. de invocaciones: " + invocaciones);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    private static int SumaNVecesRecursiva(int n, int contador)
    {
        invocaciones++;
        if (contador == 0) {
            return 0;
        }
        else {
            return n + SumaNVecesRecursiva(n, contador - 1);
        }
    }
}
