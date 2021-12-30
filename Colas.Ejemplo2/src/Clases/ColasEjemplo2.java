/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

public class ColasEjemplo2 {

    private static Stack cola;

    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------------------------------");
        System.out.println("           INSTRUCCIONES DEL EJERCICIO           ");
        System.out.println("-------------------------------------------------");
        System.out.println(" [i] Considerar una cola de nombres representada ");
        System.out.println("     por un arreglo String con longitud de 6.    ");
        System.out.println(" [i] Escribir los elementos de la cola y los     ");
        System.out.println("     campos frontal y posterior segun se realizan");
        System.out.println("     las operaciones.                            ");

        cola = new Stack(6);
        try {

            //Paso #1
            System.out.println("-------------------------------------------------");
            System.out.println("Paso #1: Añadir 'Gloria' y 'Lupita' a la cola");
            cola.add("Gloria");
            cola.add("Lupita");
            MostrarCola();

            //Paso #2
            System.out.println("-------------------------------------------------");
            System.out.println("Paso #2: Remover elemento de la cola");
            cola.remove();
            MostrarCola();

            //Paso #3
            System.out.println("-------------------------------------------------");
            System.out.println("Paso #3: Añadir 'Karina' a la cola");
            cola.add("Karina");
            MostrarCola();

            //Paso #4
            System.out.println("-------------------------------------------------");
            System.out.println("Paso #4: Añadir 'Luis' a la cola");
            cola.add("Luis");
            MostrarCola();

            //Paso #5
            System.out.println("-------------------------------------------------");
            System.out.println("Paso #5: Vaciar elementos de la cola");
            cola.clear();
            MostrarCola();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("          PROGRAMA FINALIZADO CON EXITO          ");
        System.out.println("-------------------------------------------------");
    }

    private static void MostrarCola() throws Exception {
        try {
            for (int i = 0; i < cola.size(); i++) {
                System.out.println("Cola [" + i + "]: " + cola.getQueue()[i]);
            }
            System.out.println("Elemento frontal de la cola: " + cola.front());
            System.out.println("Elemento posterior de la cola: " + cola.rear());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
