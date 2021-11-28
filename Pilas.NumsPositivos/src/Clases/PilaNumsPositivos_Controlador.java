/* 
https://github.com/Angxlware
Última revisión 28/11/2021
*/
package Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PilaNumsPositivos_Controlador 
{
    public static void main(String[] args) throws Exception 
    {
        int tamanoPila, opción;
        boolean salir = false;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" VACIAR UNA PILA MOSTRANDO LOS VALORES POSITIVOS ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //Creación del TDA
        tamanoPila = LeerEntero("Ingrese el tamaño de la pila: ");
        PilaNumsPositivos_ClaseBase objPila = new PilaNumsPositivos_ClaseBase(tamanoPila);
        do {
            try {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                MENÚ DE OPCIONES                 ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" [1] Ingresar elemento a la pila                 ");
                System.out.println(" [2] Quitar el último elemento                   ");
                System.out.println(" [3] Vaciar pila PERO mostrando los positivos    ");
                System.out.println(" [4] Mostrar pila                                ");
                System.out.println(" [5] Salir del programa                          ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                opción = LeerEntero("Ingrese la opción que desea realizar: ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                switch(opción)
                {
                    case 1: //Push
                        int dato = LeerEntero("Ingrese el dato que desea insertar: ");
                        objPila.Push(dato);
                        break;
                    case 2: //Pop
                        objPila.Pop();
                        break;
                    case 3: //Clear
                        objPila.Clear();
                        break;
                    case 4: //Mostrar pila
                        for (int i = objPila.getPuntero(); i >= 0; i--) 
                        {
                            System.out.println("Elemento Pila[" + i + "]: "
                                    + objPila.getPila()[i]);
                        }
                        break;
                    case 5: //Salir
                        salir = true;
                        break;
                    default: //Opción incorrecta
                        System.out.println("            ERROR: Opción incorrecta             ");
                        break;
                }
            }
            catch(Exception e) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(e.getMessage());
            }
        }
        while (!salir);
        System.out.println("          PROGRAMA FINALIZADO CON ÉXITO          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    //Validación
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
