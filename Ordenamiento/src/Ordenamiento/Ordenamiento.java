//Última revisión 27/11/2021
package Ordenamiento;

import java.io.*;
import java.util.*;

public class Ordenamiento {

    private static int numDatos;
    private static int numABuscar;
    private static int[] arregloA, arregloB;

    public static void main(String[] args) throws IOException {
        int opción;
        double tiempoBurbuja, tiempoShell, tiempoShaker, tiempoQuick,
                tiempoBusqSec, tiempoBusqBin;
        boolean arregloOrdenado = false;

        System.out.println("-------------------------------------------------");
        System.out.println("             MÉTODOS DE ORDENAMIENTO             ");
        System.out.println("-------------------------------------------------");
        numDatos = LeerEntero("Ingrese la cantidad de datos a trabajar: ");

        arregloA = new int[numDatos];
        arregloB = new int[numDatos];
        arregloA = GenerarArreglo(arregloA);
        System.arraycopy(arregloA, 0, arregloB, 0, arregloA.length);

        System.out.println("-------------------------------------------------");
        System.out.println("             IMPRESIÓN DEL ARREGLO A             ");
        System.out.println("-------------------------------------------------");
        ImprimirArreglo(arregloA);
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("               MENÚ DE ORDENAMIENTO              ");
            System.out.println("-------------------------------------------------");
            System.out.println(" [1]: Método de Ordenamiento ''Burbuja''         ");
            System.out.println(" [2]: Método de Ordenamiento ''Shell''           ");
            System.out.println(" [3]: Método de Ordenamiento ''Shaker''          ");
            System.out.println(" [4]: Método de Ordenamiento ''Quicksort''       ");
            System.out.println(" [5]: Método de Búsqueda ''Secuencial''          ");
            System.out.println(" [6]: Método de Búsqueda ''Binaria''             ");
            System.out.println(" [7]: Salir del programa                         ");
            System.out.println("-------------------------------------------------");
            opción = LeerEntero("Ingrese una opción del menú: ");
            System.out.println("-------------------------------------------------");
            switch (opción) {
                case 1:
                    System.out.println("        ARREGLO ORDENADO POR MÉTODO BURBUJA      ");
                    System.out.println("-------------------------------------------------");

                    long InicioBurbuja = System.nanoTime();
                    OrdenaciónBurbuja(arregloB);
                    long FinalBurbuja = System.nanoTime();
                    tiempoBurbuja = (FinalBurbuja - InicioBurbuja) / 1000000;
                    arregloOrdenado = true;

                    ImprimirArreglo(arregloB);
                    ImprimirTiempo(tiempoBurbuja);
                    break;
                case 2:
                    System.out.println("        ARREGLO ORDENADO POR MÉTODO SHELL        ");
                    System.out.println("-------------------------------------------------");

                    long InicioShell = System.nanoTime();
                    OrdenaciónShell();
                    long FinalShell = System.nanoTime();
                    tiempoShell = (FinalShell - InicioShell) / 1000000;
                    arregloOrdenado = true;

                    ImprimirArreglo(arregloB);
                    ImprimirTiempo(tiempoShell);
                    break;
                case 3:
                    System.out.println("        ARREGLO ORDENADO POR MÉTODO SHAKER       ");
                    System.out.println("-------------------------------------------------");

                    long InicioShaker = System.nanoTime();
                    OrdenaciónShaker();
                    long FinalShaker = System.nanoTime();
                    tiempoShaker = (FinalShaker - InicioShaker) / 1000000;
                    arregloOrdenado = true;

                    ImprimirArreglo(arregloB);
                    ImprimirTiempo(tiempoShaker);
                    break;
                case 4:
                    System.out.println("       ARREGLO ORDENADO POR MÉTODO QUICKSORT     ");
                    System.out.println("-------------------------------------------------");

                    long InicioQuick = System.nanoTime();
                    OrdenaciónQuicksort(0, numDatos - 1);
                    long FinalQuick = System.nanoTime();
                    tiempoQuick = (FinalQuick - InicioQuick) / 1000000;
                    arregloOrdenado = true;

                    ImprimirArreglo(arregloB);
                    ImprimirTiempo(tiempoQuick);
                    break;
                case 5:
                    if (arregloOrdenado == false) {
                        System.out.println(" ERROR: ORDENE EL ARREGLO ANTES DE UNA BÚSQUEDA  ");
                    } else {
                        numABuscar = LeerEntero("Ingrese el número que desea buscar en el arreglo: ");

                        long InicioBusquedaS = System.nanoTime();
                        BúsquedaSecuencial();
                        long FinalBusquedaS = System.nanoTime();
                        tiempoBusqSec = (FinalBusquedaS - InicioBusquedaS) / 1000000;

                        ImprimirTiempo(tiempoBusqSec);
                    }
                    break;
                case 6:
                    if (arregloOrdenado == false) {
                        System.out.println(" ERROR: ORDENE EL ARREGLO ANTES DE UNA BÚSQUEDA  ");
                    } else {
                        numABuscar = LeerEntero("Ingrese el número que desea buscar en el arreglo: ");

                        long InicioBusquedaB = System.nanoTime();
                        BúsquedaBinaria();
                        long FinalBusquedaB = System.nanoTime();
                        tiempoBusqBin = (FinalBusquedaB - InicioBusquedaB) / 1000000;

                        ImprimirTiempo(tiempoBusqBin);
                    }
                    break;
                case 7:
                    System.out.println("          PROGRAMA FINALIZADO CON ÉXITO          ");
                    System.out.println("-------------------------------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("       ERROR: SELECCIONE UNA OPCIÓN VÁLIDA       ");
                    break;
            }
        } while (true);
    }

    public static int LeerEntero(String mensaje) throws java.io.IOException {
        BufferedReader leerTeclado = new BufferedReader(new InputStreamReader(System.in));
        String datoLeído;
        int datoInteger;

        do {
            System.out.print(mensaje);
            datoLeído = leerTeclado.readLine();
            try {
                datoInteger = Integer.parseInt(datoLeído);
                if (datoInteger <= 0) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("      ERROR: DIGITE UN NÚMERO MAYOR QUE CERO     ");
                    System.out.println("-------------------------------------------------");
                    continue;
                }
                return datoInteger;
            } catch (NumberFormatException e) {
                System.out.println("-------------------------------------------------");
                System.out.println("    ERROR: SOLAMENTE SE PUEDEN DIGITAR NÚMEROS   ");
                System.out.println("-------------------------------------------------");
            }
        } while (true);
    }

    public static int[] GenerarArreglo(int[] arreglo) {
        Random rnd = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(arreglo.length * 10);
        }
        return arreglo;
    }

    public static void OrdenaciónBurbuja(int[] arreglo) {
        for (int i = 0; i < (arreglo.length - 1); i++) {
            for (int j = 0; j < (arreglo.length - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public static void OrdenaciónShell() {
        int salto = arregloB.length, i, aux;
        boolean flag;

        while (salto > 1) {
            salto = salto / 2;
            flag = true;
            while (flag == true) {
                flag = false;
                i = 0;
                while ((i + salto) <= arregloB.length - 1) {
                    if (arregloB[i] > arregloB[i + salto]) {
                        aux = arregloB[i];
                        arregloB[i] = arregloB[i + salto];
                        arregloB[i + salto] = aux;
                        flag = true;
                    }
                    i = i + 1;
                }
            }
        }
    }

    public static void OrdenaciónShaker() {
        int i, izq = 1, der = (arregloB.length - 1), k = (arregloB.length - 1), aux;
        while (izq <= der) {
            for (i = der; i >= izq; i--) {
                if (arregloB[i - 1] > arregloB[i]) {
                    aux = arregloB[i - 1];
                    arregloB[i - 1] = arregloB[i];
                    arregloB[i] = aux;
                    k = i;
                }
            }
            izq = k + 1;
            for (i = izq; i <= der; i++) {
                if (arregloB[i - 1] > arregloB[i]) {
                    aux = arregloB[i - 1];
                    arregloB[i - 1] = arregloB[i];
                    arregloB[i] = aux;
                    k = i;
                }
            }
            der = k - 1;
        }
    }

    public static void OrdenaciónQuicksort(int izq, int der) {
        int pivote = arregloB[izq], i = izq, j = der, aux;

        while (i < j) {
            while ((arregloB[i] <= pivote) && (i < j)) {
                i++;
            }
            while (arregloB[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = arregloB[i];
                arregloB[i] = arregloB[j];
                arregloB[j] = aux;
            }
        }

        arregloB[izq] = arregloB[j];
        arregloB[j] = pivote;
        if (izq < (j - 1)) {
            OrdenaciónQuicksort(izq, j - 1);
        }
        if (der > (j + 1)) {
            OrdenaciónQuicksort(j + 1, der);
        }
    }

    public static void BúsquedaSecuencial() {
        System.out.println("-------------------------------------------------");
        System.out.println("    ELEMENTO BUSCADO UTILIZANDO BÚSQUEDA SEC.    ");
        System.out.println("-------------------------------------------------");
        int i = 0;

        while ((i <= arregloB.length - 1) && (numABuscar > arregloB[i])) {
            i = i + 1;
        }

        if ((i > (arregloB.length - 1)) || (numABuscar < arregloB[i])) {
            System.out.println("Ese elemento no existe en el vector");
        } else {
            System.out.println("El elemento está en la posición " + (i + 1));
        }
    }

    public static void BúsquedaBinaria() {
        System.out.println("-------------------------------------------------");
        System.out.println("    ELEMENTO BUSCADO UTILIZANDO BÚSQUEDA BIN.    ");
        System.out.println("-------------------------------------------------");
        int izq = 0, der = (arregloB.length - 1), cen = ((izq + der) / 2);

        while ((izq <= der) && (numABuscar != arregloB[cen])) {
            if (numABuscar > arregloB[cen]) {
                izq = (cen + 1);
            } else {
                der = (cen - 1);
            }
            cen = ((izq + der) / 2);
        }

        if (izq > der) {
            System.out.println("Ese elemento no existe en el vector");
        } else {
            System.out.println("El elemento está en la posición " + (cen + 1));
        }
    }

    public static void ImprimirArreglo(int[] arreglo) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (contador == 13) {
                contador = 0;
                System.out.println("");
            }
            System.out.print(arreglo[i] + " ");
            contador++;
        }
        System.out.println("");
    }

    public static void ImprimirTiempo(double tiempo) throws IOException {
        System.out.println("-------------------------------------------------");
        System.out.println("Tiempo del proceso: " + tiempo + " milisegundos");
        System.out.println("-------------------------------------------------");
        System.out.println("           PRESIONE ENTER PARA CONTINUAR         ");
        System.in.read();
    }
}
