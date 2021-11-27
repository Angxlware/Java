import java.io.*;
import java.util.*;

public class MétodosDeOrdenamiento 
{
    public static void main(String[] args) throws IOException 
    {
        int numDatos, numABuscar, opción;
        double tiempoBurbuja, tiempoShell, tiempoShaker, tiempoQuick,
                tiempoBusqSec, tiempoBusqBin;
        boolean arregloOrdenado = false;

        System.out.println("-----------------------------------------------------");
        System.out.println("                MÉTODOS DE ORDENAMIENTO              ");
        System.out.println("-----------------------------------------------------");
        numDatos = LeerEntero("Ingrese la cantidad de datos a trabajar: ");
        
        int[] arregloA = new int[numDatos];
        int[] arregloB = new int[numDatos];
        arregloA = GenerarArreglo(arregloA);

        System.out.println("-----------------------------------------------------");
        System.out.println("                IMPRESIÓN DEL VECTOR A               ");
        System.out.println("-----------------------------------------------------");
        ImprimirArreglo(arregloA);
        do 
        {
            System.out.println("-----------------------------------------------------");
            System.out.println("                 MENÚ DE ORDENAMIENTO                ");
            System.out.println("-----------------------------------------------------");
            System.out.println("Opción número 1: Burbuja                             ");
            System.out.println("Opción número 2: Shell                               ");
            System.out.println("Opción número 3: Shaker                              ");
            System.out.println("Opción número 4: Quicksort                           ");
            System.out.println("Opción número 5: Búsqueda Secuencial                 ");
            System.out.println("Opción número 6: Búsqueda Binaria                    ");
            System.out.println("Opción número 7: Salir del programa                  ");
            System.out.println("-----------------------------------------------------");
            opción = LeerEntero("Ingrese una opción del menú: ");
            System.out.println("-----------------------------------------------------");

            switch (opción) 
            {
                case 1:
                    System.out.println("           VECTOR ORDENADO POR MÉTODO BURBUJA        ");
                    System.out.println("-----------------------------------------------------");
                    arregloB = CopiarArreglo(arregloA, arregloB);
                    
                    long InicioBurbuja = System.nanoTime();
                    OrdenaciónBurbuja(arregloB);
                    long FinalBurbuja = System.nanoTime();
                    tiempoBurbuja = (FinalBurbuja - InicioBurbuja);
                    arregloOrdenado = true;
                    
                    ImprimirArreglo(arregloB);
                    ImprimirTiempo(tiempoBurbuja);
                    break;
                case 2:
                    System.out.println("           VECTOR ORDENADO POR MÉTODO SHELL          ");
                    System.out.println("-----------------------------------------------------");
                    arregloB = CopiarArreglo(arregloA, arregloB);
                    
                    long InicioShell = System.nanoTime();
                    OrdenaciónShell(arregloB);
                    long FinalShell = System.nanoTime();
                    tiempoShell = (FinalShell - InicioShell);
                    arregloOrdenado = true;
                    
                    ImprimirArreglo(arregloB);
                    ImprimirTiempo(tiempoShell);
                    break;
                case 3:
                    System.out.println("           VECTOR ORDENADO POR MÉTODO SHAKER         ");
                    System.out.println("-----------------------------------------------------");
                    arregloB = CopiarArreglo(arregloA, arregloB);
                    
                    long InicioShaker = System.nanoTime();
                    OrdenaciónShaker(arregloB);
                    long FinalShaker = System.nanoTime();
                    tiempoShaker = (FinalShaker - InicioShaker);
                    arregloOrdenado = true;
                    
                    ImprimirArreglo(arregloB);
                    ImprimirTiempo(tiempoShaker);
                    break;
                case 4:
                    System.out.println("          VECTOR ORDENADO POR MÉTODO QUICKSORT       ");
                    System.out.println("-----------------------------------------------------");
                    arregloB = CopiarArreglo(arregloA, arregloB);
                    
                    long InicioQuick = System.nanoTime();
                    OrdenaciónQuicksort(arregloB, 0, numDatos - 1);
                    long FinalQuick = System.nanoTime();
                    tiempoQuick = (FinalQuick - InicioQuick);
                    arregloOrdenado = true;
                    
                    ImprimirArreglo(arregloB);
                    ImprimirTiempo(tiempoQuick);
                    break;
                case 5:
                    if (arregloOrdenado == false) 
                        System.out.println("    ERROR: ORDENE EL VECTOR ANTES DE UNA BÚSQUEDA    ");
                    else 
                    {
                        numABuscar = LeerEntero("Ingrese el número que desea buscar en el vector: ");
                        
                        long InicioBusquedaS = System.nanoTime();
                        BúsquedaSecuencial(arregloB, numABuscar);
                        long FinalBusquedaS = System.nanoTime();
                        tiempoBusqSec = (FinalBusquedaS - InicioBusquedaS);
                        
                        ImprimirTiempo(tiempoBusqSec);
                    }
                    break;
                case 6:
                    if (arregloOrdenado == false) 
                        System.out.println("    ERROR: ORDENE EL VECTOR ANTES DE UNA BÚSQUEDA    "); 
                    else 
                    {
                        numABuscar = LeerEntero("Ingrese el número que desea buscar en el vector: ");
                        
                        long InicioBusquedaB = System.nanoTime();
                        BúsquedaBinaria(arregloB, numABuscar);
                        long FinalBusquedaB = System.nanoTime();
                        tiempoBusqBin = (FinalBusquedaB - InicioBusquedaB);
                        
                        ImprimirTiempo(tiempoBusqBin);
                    }
                    break;
                case 7:
                    System.out.println("            PROGRAMA FINALIZADO CON ÉXITO            ");
                    System.out.println("-----------------------------------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("         ERROR: SELECCIONE UNA OPCIÓN VÁLIDA         ");
                    break;
            }
        } 
        while (true);
    }

    public static int LeerEntero(String mensaje) throws java.io.IOException 
    {
        BufferedReader leerTeclado = new BufferedReader
        (new InputStreamReader(System.in));
        String datoLeído;
        int datoInteger;
        
        do 
        {
            System.out.print(mensaje);
            datoLeído = leerTeclado.readLine();
            try 
            {
                datoInteger = Integer.parseInt(datoLeído);
                if (datoInteger <= 0) 
                {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("        ERROR: DIGITE UN NÚMERO MAYOR QUE CERO       ");
                    System.out.println("-----------------------------------------------------");
                    continue;
                }
                return datoInteger;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("-----------------------------------------------------");
                System.out.println("      ERROR: SOLAMENTE SE PUEDEN DIGITAR NÚMEROS     ");
                System.out.println("-----------------------------------------------------");
            }
        } 
        while (true);
    }
    
    public static int[] GenerarArreglo(int[] arreglo)
    {
        Random rnd = new Random();
        
        for (int i = 0; i < arreglo.length; i++) 
        {
            arreglo[i] = rnd.nextInt(arreglo.length * 10);
        }
        
        return arreglo;
    }
    
    public static int[] CopiarArreglo(int[] arregloA, int[] arregloB) 
    {
        System.arraycopy(arregloA, 0, arregloB, 0, arregloA.length);
        return arregloB;
    }
    
    public static void OrdenaciónBurbuja(int[] arreglo) 
    {
        for (int i = 0; i < (arreglo.length - 1); i++) 
        {
            for (int j = 0; j < (arreglo.length - 1); j++) 
            {
                if (arreglo[j] > arreglo[j + 1]) 
                {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public static void OrdenaciónShell(int[] arreglo) 
    {
        int salto = arreglo.length, i, aux;
        boolean flag;
        
        while (salto > 1) 
        {
            salto = salto / 2;
            flag = true;
            while (flag == true) 
            {
                flag = false;
                i = 0;
                while ((i + salto) <= arreglo.length - 1) 
                {
                    if (arreglo[i] > arreglo[i + salto]) 
                    {
                        aux = arreglo[i];
                        arreglo[i] = arreglo[i + salto];
                        arreglo[i + salto] = aux;
                        flag = true;
                    }
                    i = i + 1;
                }
            }
        }
    }

    public static void OrdenaciónShaker(int[] arreglo) 
    {
        int i, izq = 1, der = (arreglo.length - 1), k = (arreglo.length - 1), aux;
        while (izq <= der) 
        {
            for (i = der; i >= izq; i--) 
            {
                if (arreglo[i - 1] > arreglo[i]) 
                {
                    aux = arreglo[i - 1];
                    arreglo[i - 1] = arreglo[i];
                    arreglo[i] = aux;
                    k = i;
                }
            }
            izq = k + 1;
            for (i = izq; i <= der; i++) 
            {
                if (arreglo[i - 1] > arreglo[i]) 
                {
                    aux = arreglo[i - 1];
                    arreglo[i - 1] = arreglo[i];
                    arreglo[i] = aux;
                    k = i;
                }
            }
            der = k - 1;
        }
    }

    public static void OrdenaciónQuicksort(int[] arreglo, int izq, int der) 
    {
        int pivote = arreglo[izq], i = izq, j = der, aux;
        
        while (i < j) 
        {
            while ((arreglo[i] <= pivote) && (i < j)) 
                i++;
            while (arreglo[j] > pivote) 
                j--;
            if (i < j) 
            {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        
        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;
        if (izq < (j - 1)) 
            OrdenaciónQuicksort(arreglo, izq, (j - 1));
        if (der > (j + 1)) 
            OrdenaciónQuicksort(arreglo, (j + 1), der);
    }

    public static void BúsquedaSecuencial(int[] arreglo, int numABuscar) 
    {
        System.out.println("-----------------------------------------------------");
        System.out.println(" ELEMENTO ENCONTRADO UTILIZANDO BÚSQUEDA SECUENCIAL  ");
        System.out.println("-----------------------------------------------------");
        int i = 0;
        
        while ((i <= arreglo.length - 1) && (numABuscar > arreglo[i])) 
            i = i + 1;
        
        if ((i > (arreglo.length - 1)) || (numABuscar < arreglo[i])) 
            System.out.println("Ese elemento no existe en el vector");
        else 
            System.out.println("El elemento está en la posición " + (i + 1));
    }

    public static void BúsquedaBinaria(int[] arreglo, int numABuscar) 
    {
        System.out.println("-----------------------------------------------------");
        System.out.println("   ELEMENTO ENCONTRADO UTILIZANDO BÚSQUEDA BINARIA   ");
        System.out.println("-----------------------------------------------------");
        int izq = 0, der = (arreglo.length - 1), cen = ((izq + der) / 2);
        
        while ((izq <= der) && (numABuscar != arreglo[cen])) 
        {
            if (numABuscar > arreglo[cen]) 
                izq = (cen + 1);
            else 
                der = (cen - 1);
            cen = ((izq + der) / 2);
        }
        
        if (izq > der) 
            System.out.println("Ese elemento no existe en el vector");
        else 
            System.out.println("El elemento está en la posición " + (cen + 1));
    }

    public static void ImprimirArreglo(int[] arreglo) 
    {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (contador == 13)
            {
                contador = 0;
                System.out.println("");
            }
            System.out.print(arreglo[i] + " ");
            contador++;
        }
        System.out.println("");
    }
    
    public static void ImprimirTiempo(double tiempo)
    {
        System.out.println("-----------------------------------------------------");
        System.out.println("Tiempo del proceso: " + (tiempo / 1000000) + " milisegundos");
        System.out.println("-----------------------------------------------------");
        System.out.println("             PRESIONE ENTER PARA CONTINUAR           ");
        try {
            System.in.read();
        } 
        catch (Exception e) {
        }
    }
}