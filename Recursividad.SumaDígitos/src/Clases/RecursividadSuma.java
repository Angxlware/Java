/* 
https://github.com/Angxlware
Última revisión 28/11/2021
*/
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursividadSuma 
{
    private static int invItr;
    private static int invRec;
    
    public static void main(String[] args) throws IOException
    {
        int num, sumaItr, sumaRec;
        invItr = 0;
        invRec = 0;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("         SUMA DE LOS DIGITOS DE UN NÚMERO N          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        num = LeerInteger("Ingrese el número: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        sumaItr = SumaIterativa(num);
        sumaRec = SumaRecursiva(num);
        
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                RESULTADO DE LA SUMA                 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                   SUMA ITERATIVA                    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Resultado: " + sumaItr);
        System.out.println("Invocaciones: " + invItr);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                   SUMA RECURSIVA                    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Resultado: " + sumaRec);
        System.out.println("Invocaciones: " + invRec);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
    
    public static int LeerInteger(String mensaje) throws java.io.IOException
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
    
    public static int SumaIterativa(int n)
    {
        int suma = 0;
        while (n > 9) {
            invItr++;
            suma += n % 10;
            n /= 10;
        }
        return suma + n;
    }
    
    public static int SumaRecursiva(int n)
    {
        invRec++;
        if (n <= 9) {
            return n;   
        }
        else {
            return SumaRecursiva(n / 10) + n % 10;
        }
    }
}