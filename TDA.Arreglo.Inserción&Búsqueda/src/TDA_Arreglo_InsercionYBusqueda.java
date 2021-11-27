import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TDA_Arreglo_InsercionYBusqueda 
{
    static InsercionYBusqueda objInsercionYBusqueda = new InsercionYBusqueda();
    static BufferedReader leerTeclado = new BufferedReader
        (new InputStreamReader(System.in));
    static DecimalFormat formatoNúmero = new DecimalFormat("###,###.###");
    
    public static int LeerEntero(String mensaje) throws IOException
    {
        String elementoLeído;
        int elementoInteger; 
        
        //Validación
        while (true)
        {
            System.out.print(mensaje);
            elementoLeído = leerTeclado.readLine();
            try
            {
                elementoInteger = Integer.parseInt(elementoLeído);
                return elementoInteger;
            }
            catch(Exception e)
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" ERROR: Tipo de dato inválido ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
    
    public static void main(String[] args) throws IOException 
    {
        int[] elementos = new int[50];
        int elementoBúsqueda;
        double tiempoRepeticiones, tiempoPosiciones, tiempoTotal;
        boolean elementoExiste = false;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  INSERCIÓN Y BÚSQUEDA BASADA EN 50 ELEMENTOS  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        /*
        Entrada
        */
        for (int i = 0; i < elementos.length; i++) 
        {
            elementos[i] = LeerEntero("Ingrese el elemento #" + (i + 1) + ": ");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Validación
        while (true)
        {
            elementoBúsqueda = LeerEntero("Ingrese el elemento que desea "
                    + "buscar: ");
            for (int i = 0; i < elementos.length; i++) 
            {
                if (elementos[i] == elementoBúsqueda)
                {
                    elementoExiste = true;
                    break;
                }
            }
            if (elementoExiste == true)
            {
                break;
            }
            else
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                        + "~~~~~~~~~");
                System.out.println(" ERROR: El elemento no existe en el "
                        + "conjunto ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                        + "~~~~~~~~~");
            }
        }
        
        /*
        Proceso
        */
        objInsercionYBusqueda.setElementos(elementos);
        objInsercionYBusqueda.setElementoBúsqueda(elementoBúsqueda);
        
        long inicioRepeticiones = System.nanoTime();
        objInsercionYBusqueda.setRepeticiones();
        long finalRepeticiones = System.nanoTime();
        tiempoRepeticiones = (finalRepeticiones - inicioRepeticiones);
        
        long inicioPosiciones = System.nanoTime();
        objInsercionYBusqueda.setPosiciones();
        long finalPosiciones = System.nanoTime();
        tiempoPosiciones = (finalPosiciones - inicioPosiciones);
        
        tiempoTotal = (tiempoRepeticiones + tiempoPosiciones);
        
        /*
        Salida
        */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                  RESULTADOS                  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("No. de veces del elemento en el conjunto: "
                + objInsercionYBusqueda.getRepeticiones());
        System.out.print("Posición o posiciones: ");
        for (int i = 0; i < objInsercionYBusqueda.getPosiciones().length; i++) 
        {
            System.out.print((objInsercionYBusqueda.getPosiciones()[i] + 1));
            if (i != (objInsercionYBusqueda.getPosiciones().length - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("           ESTADÍSTICAS DEL PROCESO           ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Número de operaciones realizadas....: " + 
                objInsercionYBusqueda.getNumOperaciones());
        System.out.println("Tiempo de encontrar las repeticiones: " + 
                formatoNúmero.format((tiempoRepeticiones / 1000000)) + " ms");
        System.out.println("Tiempo de encontrar las posiciones..: " + 
                formatoNúmero.format((tiempoPosiciones / 1000000)) + " ms");
        System.out.println("Tiempo total de las operaciones.....: " + 
                formatoNúmero.format((tiempoTotal / 1000000)) + " ms");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        PROGRAMA FINALIZADO CON ÉXITO         ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}