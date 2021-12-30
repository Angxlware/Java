/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

public class Examen {

    private static Nodo raiz;
    private static int puntero;
    private static boolean encontrado;

    public Examen() {
        puntero = 0;
        encontrado = false;
    }

    public static void main(String[] args) {

        InsertarNodo(new Nodo(145));
        InsertarNodo(new Nodo(33));
        InsertarNodo(new Nodo(122));
        InsertarNodo(new Nodo(9));
        InsertarNodo(new Nodo(666));
        InsertarNodo(new Nodo(25));
        InsertarNodo(new Nodo(99));

        System.out.println("Lista actual:");
        ImprimirLista(raiz);
        BorrarUltimoElemento(raiz);
        System.out.println("Lista después de eliminar el último elemento: ");
        ImprimirLista(raiz);
        BorrarElementoIntermedio(raiz, 122);
        System.out.println("Lista después de eliminar el elemento '122': ");
        ImprimirLista(raiz);
    }

    public static void InsertarNodo(Nodo nuevoNodo) {
        if (esVacia()) {
            raiz = nuevoNodo;
        } else {
            esUltimo(raiz, nuevoNodo);
        }
    }

    public static void esUltimo(Nodo raiz, Nodo nuevoNodo) {
        if (raiz.getLigaDerecha() != null) {
            esUltimo(raiz.getLigaDerecha(), nuevoNodo);
        } else {
            raiz.setLigaDerecha(nuevoNodo);
        }
    }

    public static boolean esVacia() {
        return raiz == null;
    }

    public static void BorrarLista() {
        raiz = null;
    }

    ////////////////////////////////////////////////////////////////////////////
    //Métodos solicitados del Examen
    ////////////////////////////////////////////////////////////////////////////
    //Eliminar el último elemento
    public static void BorrarUltimoElemento(Nodo raiz) {

        Nodo penultimo = raiz;

        while (penultimo.getLigaDerecha().getLigaDerecha() != null) {
            penultimo = penultimo.getLigaDerecha();
        }

        penultimo.setLigaDerecha(null);
        Examen.raiz = raiz;
    }

    //Eliminar un elemento intermedio
    public static void BorrarElementoIntermedio(Nodo raiz, int dato) {

        Nodo temp = null;

        if ((raiz != null) && (raiz.getDato() == dato)) {
            Examen.raiz = raiz.getLigaDerecha();
        }

        while ((raiz != null) && (raiz.getDato() != dato)) {
            temp = raiz;
            raiz = raiz.getLigaDerecha();
        }

        temp.setLigaDerecha(raiz.getLigaDerecha());
    }
    ////////////////////////////////////////////////////////////////////////////

    public static void BorrarLista(Nodo raiz) {
        if (raiz.getLigaDerecha() != null) {
            raiz = raiz.getLigaDerecha();
        } else {
            raiz = null;
        }

        Examen.raiz = raiz;
    }

    public static int BuscarNodo(Nodo raiz, int dato) {

        if (raiz.getDato() != dato) {
            if (raiz.getLigaDerecha() != null) {
                BuscarNodo(raiz.getLigaDerecha(), dato);
            }
        } else {
            encontrado = true;
        }

        if (encontrado == true) {
            return puntero;
        } else {
            return 0;
        }
    }

    public static void ImprimirLista(Nodo raiz) {
        if (raiz.getLigaDerecha() != null) {
            System.out.println(raiz.getDato());
            ImprimirLista(raiz.getLigaDerecha());
        } else {
            System.out.println(raiz.getDato());
        }
    }
}
