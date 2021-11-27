import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TDA_Arreglo_InsBusqYElim 
{
    public static final InsBusqYElim objInsBusqYElim = 
            new InsBusqYElim();
    public static final BufferedReader leerTeclado = new BufferedReader
        (new InputStreamReader(System.in));
    public static final DecimalFormat formatoTiempoMs = 
            new DecimalFormat("###,###.### ms");
    public static final String clrRojo = "\u001B[31m";
    public static final String clrReset = "\u001B[0m";
    
    public static void main(String[] args) throws IOException, Exception 
    {
        int opción, elemento;
        double tiempoProceso;
        long inicioProceso, finalProceso;
        boolean conjuntoLleno = false;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("      INSERCIÓN, BÚSQUEDA Y ELIMINACIÓN       ");
        do
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("               MENÚ DE OPCIONES               ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Opción '1': Insertar los elementos           ");
            System.out.println(" Opción '2': Buscar un elemento               ");
            System.out.println(" Opción '3': Eliminar un elemento             ");
            System.out.println(" Opción '4': Salir                            ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            opción = LeerEntero("Ingrese la opción que desea realizar: ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (opción)
            {
                case 1:
                    conjuntoLleno = true;
                    
                    System.out.println("            INSERCIÓN SELECCIONADA"
                            + "            ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "~~~~~~~~~~~~");
                    for (int i = 0; i < objInsBusqYElim.getConjunto().length; i++) 
                    {
                        objInsBusqYElim.InsertarElemento(i, LeerEntero("Ingrese"
                                + " el elemento #" + (i + 1) + ": "));
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "~~~~~~~~~~");
                    System.out.println("          DATOS INSERTADOS CON ÉXITO"
                            + "          ");
                    break;
                case 2:
                    //Validación
                    if (conjuntoLleno == false)
                    {
                        System.out.println(clrRojo + "    ERROR: No ha "
                                + "ingresado ningún elemento    " + clrReset);
                        break;
                    }
                    System.out.println("            BÚSQUEDA SELECCIONADA"
                            + "             ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "~~~~~~~~~~~~~");
                    elemento = LeerEntero("Ingrese el elemento que desea"
                            + " buscar: ");

                    inicioProceso = System.nanoTime();
                    Integer[] posiciones = objInsBusqYElim
                            .EncontrarPosiciones(elemento);
                    finalProceso = System.nanoTime();
                    tiempoProceso = (finalProceso - inicioProceso);
                    
                    ImprimirResultados("Posición o posiciones del elemento: ",
                            posiciones, tiempoProceso);
                    break;
                case 3:
                    //Validación
                    if (conjuntoLleno == false)
                    {
                        System.out.println(clrRojo + "    ERROR: No ha "
                                + "ingresado ningún elemento    " + clrReset);
                        break;
                    }
                    System.out.println("           ELIMINACIÓN SELECCIONADA"
                            + "           ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "~~~~~~~~~~~");
                    elemento = LeerEntero("Ingrese el elemento que desea"
                            + " eliminar: ");
                    
                    inicioProceso = System.nanoTime();
                    objInsBusqYElim.EliminarElemento(elemento);
                    finalProceso = System.nanoTime();
                    tiempoProceso = (finalProceso - inicioProceso);

                    ImprimirResultados("Conjunto actual: ", objInsBusqYElim
                            .getConjunto(), tiempoProceso);
                    break;
                case 4:
                    System.out.println("        PROGRAMA FINALIZADO CON ÉXITO"
                            + "         ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "~~~~~~~~~");
                    System.exit(0);
                    break;
                default:
                    System.out.println(clrRojo + "           ERROR: Opción "
                            + "incorrecta           " + clrReset);
                    break;
            }
        }
        while(true);
    }
    
    public static int LeerEntero(String mensaje) throws IOException
    {
        String elementoLeído;
        int elementoInt; 
        
        //Validación
        while (true)
        {
            System.out.print(mensaje);
            elementoLeído = leerTeclado.readLine();
            try
            {
                elementoInt = Integer.parseInt(elementoLeído);
                return elementoInt;
            }
            catch(Exception e)
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println (clrRojo +  " ERROR: Tipo de dato inválido "
                        + clrReset);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
    
    public static void ImprimirResultados(String mensaje, Integer[] arreglo, double tiempo)
    {
        Impresión:
        {
            //Validación
            if (objInsBusqYElim.getExisteElemento() == false)
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                        + "~~~~");
                System.out.println(clrRojo + " ERROR: El elemento no pertenece"
                        + " al conjunto  " + clrReset);
                break Impresión;
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("        RESULTADOS DE LAS OPERACIONES         ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(mensaje);

            System.out.print("[");
            for (int i = 0; i < arreglo.length; i++) 
            {
                System.out.print(arreglo[i]);
                if (i != arreglo.length - 1)
                {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("           ESTADÍSTICAS DEL PROCESO           ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Número de operaciones realizadas....: " + 
                        objInsBusqYElim.getNumOperaciones());
            System.out.println("Tiempo de realizar el proceso.......: " + 
                        formatoTiempoMs.format(tiempo / 1000000));
        }
    }
}