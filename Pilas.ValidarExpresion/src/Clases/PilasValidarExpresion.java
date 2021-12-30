/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PilasValidarExpresion {

    static Queue pila;

    public static void main(String[] args) throws Exception {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int tamanoPila, opcion;
        boolean salir = false;
        String expresion;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("   VALIDAR EXPRESION DE PARENTESIS EN UNA PILA   ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        tamanoPila = LeerEntero("Ingrese el tamaño de la pila: ");
        pila = new Queue(tamanoPila);
        do {
            try {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                MENU DE OPCIONES                 ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" [1] Ingresar expresion a la pila                ");
                System.out.println(" [2] Salir del programa                          ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                opcion = LeerEntero("Ingrese la opcion que desea realizar: ");
                switch (opcion) {
                    case 1 -> {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Ingrese la expresion que desea validar: ");
                        expresion = lector.readLine();
                        ValidarExpresion(expresion);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("     LA EXPRESION HA SIDO VALIDADA CON EXITO     ");
                    }
                    case 2 -> 
                        salir = true;
                    default -> 
                        throw new Exception("ERROR: Opcion incorrecta");
                }
            } catch (Exception e) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(e.getMessage());
            }
        } while (!salir);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("          PROGRAMA FINALIZADO CON ÉXITO          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void ValidarExpresion(String expresion) throws Exception {
        if (!pila.isFull()) {
            char[] expresionCaracteres = expresion.toCharArray();

            for (int i = 0; i < expresionCaracteres.length; i++) {
                switch (expresionCaracteres[i]) {
                    case '(' ->
                        pila.push(expresionCaracteres[i]);
                    case ')' ->
                        pila.pop();
                    default ->
                        throw new Exception("ERROR: CARACTER NO VALIDO");
                }
            }
            if (!pila.isEmpty()) {
                pila.clear();
                throw new Exception("ERROR: EXPRESION NO VALIDA");
            }
        } else {
            throw new Exception("ERROR: OVERFLOW DE LA PILA");
        }
    }

    public static int LeerEntero(String mensaje) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(lector.readLine());
            } catch (NumberFormatException e) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("  ERROR: SOLAMENTE SE PUEDEN INTRODUCIR NÚMEROS  ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        } while (true);
    }
}
