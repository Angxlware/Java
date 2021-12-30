/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PilasEjemplo {

    public static void main(String[] args) throws Exception {

        int tamanoPila, opcion;
        boolean salir = false;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("         EJEMPLO DEL MANEJO DE UNA PILA          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        tamanoPila = LeerEntero("Ingrese el tamaño de la pila: ");
        Stack pila = new Stack(tamanoPila);
        do {
            try {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                MENÚ DE OPCIONES                 ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" [1] Ingresar elemento a la pila                 ");
                System.out.println(" [2] Quitar el último elemento                   ");
                System.out.println(" [3] Vaciar pila                                 ");
                System.out.println(" [4] Mostrar pila                                ");
                System.out.println(" [5] Salir del programa                          ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                opcion = LeerEntero("Ingrese la opción que desea realizar: ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                switch (opcion) {
                    case 1 -> {
                        int dato = LeerEntero("Ingrese el dato que desea insertar: ");
                        pila.push(dato);
                    }
                    case 2 ->
                        System.out.println("Se removió el elemento: " + pila.pop());
                    case 3 -> {
                        pila.clear();
                        System.out.println("Se ha vaciado la pila");
                    }
                    case 4 -> {
                        for (int i = 0; i < pila.getStack().length; i++) {
                            System.out.println("Pila[" + i + "]: " + pila.getStack()[i]);
                        }
                    }
                    case 5 ->
                        salir = true;
                    default ->
                        System.out.println("            ERROR: Opción incorrecta             ");
                }
            } catch (Exception e) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(e.getMessage());
            }
        } while (!salir);
        System.out.println("          PROGRAMA FINALIZADO CON ÉXITO          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static int LeerEntero(String mensaje) throws java.io.IOException {
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
