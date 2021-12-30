/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

public class RecursividadPromedio {

    private static int invocaciones;

    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5};
        double prom;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("           PROMEDIO DE FORMA RECURSIVA           ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        prom = PromedioRecursivo(arreglo, 0);

        System.out.println("                   RESULTADOS                    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Resultado: " + prom);
        System.out.println("No. de invocaciones: " + invocaciones);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static double PromedioRecursivo(int[] arreglo, int índice) {
        invocaciones++;
        if (índice < arreglo.length) {
            return ((double) arreglo[índice] / arreglo.length)
                    + PromedioRecursivo(arreglo, (índice + 1));
        } else {
            return 0;
        }
    }
}
