/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ColasEjemplo {

    public static void main(String[] args) throws Exception {
        int longCola, opcion, dato;
        boolean salir = false;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     EJEMPLO DEL FUNCIONAMIENTO DE UNA COLA      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        longCola = LeerEntero("Ingrese el tamaño de la cola: ");
        Queue cola = new Queue(longCola);

        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("     MENU DE OPCIONES DEL MANEJO DE LA COLA      ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" [1]: 'add' Añadir numero entero a la cola       ");
            System.out.println(" [2]: 'remove' Remover ultimo elemento de la cola");
            System.out.println(" [3]: 'front' Ver el elemento frontal de la cola ");
            System.out.println(" [4]: 'rear' Ver el elemento posterior de la cola");
            System.out.println(" [5]: 'clear' Vaciar elementos de la cola        ");
            System.out.println(" [6]: Mostrar elementos de la cola               ");
            System.out.println(" [7]: Salir del programa                         ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            opcion = LeerEntero("Ingrese el numero de la opción que realizara: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (opcion) {
                case 1 -> {
                    dato = LeerEntero("Ingrese el numero entero a guardar: ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    try {
                        cola.add(String.valueOf(dato));
                        System.out.println("Se añadió el elemento " + dato + " a la cola");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Se removio el elemento " + cola.remove() + " de la cola");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("La parte frontal de la cola es: " + cola.front());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        System.out.println("La parte posterior de la cola es: " + cola.rear());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    cola.clear();
                    System.out.println("Se han vaciado los elementos de la cola");
                }
                case 6 -> {
                    for (int i = 0; i < cola.size(); i++) {
                        if (cola.isEmpty()) {
                            System.out.println("La cola se encuentra vacía");
                            break;
                        } else if (cola.getQueue()[i] != null) {
                            System.out.println("Cola [" + i + "]: " + cola.getQueue()[i]);
                        }
                    }
                }
                case 7 ->
                    salir = true;
                default ->
                    System.out.println("             ERROR: OPCION NO VALIDA             ");
            }
        } while (!salir);
        System.out.println("          PROGRAMA FINALIZADO CON EXITO          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static int LeerEntero(String mensaje) throws Exception {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(lector.readLine());
            } catch (NumberFormatException e) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("     ERROR: SOLO SE PERMITEN NUMEROS ENTEROS     ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}
