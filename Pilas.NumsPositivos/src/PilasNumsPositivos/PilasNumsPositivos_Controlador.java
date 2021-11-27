package PilasNumsPositivos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PilasNumsPositivos_Controlador 
{
    public static void main(String[] args) throws Exception 
    {
        int tamañoPila, opción;
        boolean salir = false;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" VACIAR UNA PILA MOSTRANDO LOS VALORES POSITIVOS ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //Creación del TDA
        tamañoPila = LeerEntero("Ingrese el tamaño de la pila: ");
        PilasNumsPositivos_ClaseBase objPila = new PilasNumsPositivos_ClaseBase(tamañoPila);
        
        do {
            try {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                MENÚ DE OPCIONES                 ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" (1) Ingresar dato a la pila                     ");
                System.out.println(" (2) Quitar el último elemento                   ");
                System.out.println(" (3) Vaciar PERO mostrar los valores positivos   ");
                System.out.println(" (4) Mostrar pila                                ");
                System.out.println(" (5) Salir del programa                          ");
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
                        int removido = objPila.Pop();
                        System.out.println("Se removió el elemento Pila[" + 
                                (objPila.getPuntero() + 1)+ "]: " + removido);
                        break;
                    case 3: //Clear
                        System.out.println("Se ha vaciado la pila");
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
    public static int LeerEntero(String mensaje) throws java.io.IOException
    {
        BufferedReader leerTeclado = new BufferedReader(new InputStreamReader(System.in));
        String datoLeído;
        int datoInteger;
        
        do {
            System.out.print(mensaje);
            datoLeído = leerTeclado.readLine();
            try {
                datoInteger = Integer.parseInt(datoLeído);
                return datoInteger;
            }
            catch(NumberFormatException e) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    ERROR: SOLAMENTE SE PUEDEN INTRODUCIR NÚMEROS    ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
        while(true);
    }  
}
