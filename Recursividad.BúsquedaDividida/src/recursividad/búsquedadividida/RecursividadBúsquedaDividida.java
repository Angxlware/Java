package recursividad.búsquedadividida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursividadBúsquedaDividida 
{ 
    public static void main(String[] args) throws IOException
    {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int[] arreglo = {31, 36, 88, 42, 15, 98, 777, 65, 23, 77, 13};
        int numBuscado, posición;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     BUSCAR EN UN ARREGLO DE FORMA RECURSIVA     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Digite el número que desea encontrar: ");
        numBuscado = Integer.parseInt(leer.readLine());
        
        OrdenaciónQuicksort(arreglo, 0, (arreglo.length - 1));
        posición = BúsquedaBinaria(arreglo, numBuscado, 0,(arreglo.length - 1));
        
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                   RESULTADOS                    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo[" + i + "]: " + arreglo[i]);
        }
        if (posición != -1) {
            System.out.println("El número se encontró en la posición: " + posición);
        }
        else {
            System.out.println("El elemento no forma parte del arreglo.");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public static void OrdenaciónQuicksort(int[] arreglo, int izq, int der) 
    {
        int pivote = arreglo[izq], i = izq, j = der, aux;
        
        while (i < j) 
        {
            while ((arreglo[i] <= pivote) && (i < j)) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        
        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;
        if (izq < (j - 1)) {
            OrdenaciónQuicksort(arreglo, izq, (j - 1));
        }
        if (der > (j + 1)) {
            OrdenaciónQuicksort(arreglo, (j + 1), der);
        }
    }
    
    private static int BúsquedaBinaria(int[] arreglo, int num, int izq, int der)
    {
        int cen = ((izq + der) / 2);
        if ((izq <= der) && (num != arreglo[cen])) 
        {
            if (num > arreglo[cen]) {
                return BúsquedaBinaria(arreglo, num, (cen + 1), der);
            }
            else {
                return BúsquedaBinaria(arreglo, num, izq, (cen - 1));
            }
        }
        else 
        {
            if (izq > der) {
                return -1;
            }
            else {
                return cen;
            }
        }
    }
}
