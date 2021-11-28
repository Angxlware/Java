/* 
https://github.com/Angxlware
Última revisión 28/11/2021
*/
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursividadFibonacci 
{
    private static int movItr = 0;
    private static int movRec = 0;
    
    public static void main(String[] args) throws IOException
    {
        long procItr, procRec;
        int num;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     MÉTODOS PARA CALCULAR LA SERIE DE FIBONACCI     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        num = LeerInteger("Ingrese el número: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        procItr = FibonacciIterativo(num);
        procRec = FibonacciRecursivo(num);
        
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("              RESULTADOS DE LOS CÁLCULOS             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                   MÉTODO ITERATIVO                  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Resultado: " + procItr);
        System.out.println("No. de movimientos: " + movItr);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                   MÉTODO RECURSIVO                  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Resultado: " + procRec);
        System.out.println("No. de movimientos: " + movRec);
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
    
    public static long FibonacciIterativo(int n)
    {
        if ((n == 0) || (n == 1)) {
            return n;
        }
        else {
            int fibInf = 0;
            int fibSup = 1;
            for (int i = 2; i <= n; i++) {
                movItr++;
                int aux = fibInf;
                fibInf = fibSup;
                fibSup = aux + fibInf;
            }
            return fibSup;
        }
    }
    
    public static long FibonacciRecursivo(int n)
    {
        movRec++;
        if ((n == 0) || (n == 1)) {
            return n;
        }
        else {
            return (FibonacciRecursivo(n - 1)) + (FibonacciRecursivo(n - 2));
        }
    }
}