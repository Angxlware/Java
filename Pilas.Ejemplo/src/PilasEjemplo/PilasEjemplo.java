package PilasEjemplo;

import java.util.Scanner;

public class PilasEjemplo 
{
    public static int tamanoPila = 2;
    public static int puntero = -1;
    public static int[] pila = new int[tamanoPila];

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        int valor = 0;
        boolean salir = false;
        do {
            try {
                System.out.println("Bienvenidos a nuestra pila ");
                System.out.println("Opciones: \n"
                        + "1)Insertar en pila \n"
                        + "2)Sacar en Pila  \n"
                        + "3)Limpiar Pila \n"
                        + "4)Imprimir Pila \n"
                        + "5)Salir");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("dame un valor a insertar: ");
                        valor = lector.nextInt();
                        Push(valor);
                        break;
                    case 2:
                        System.out.println(Pop());
                        break;
                    case 3:
                        Clear();
                        break;
                    case 4:
                        for (int i = puntero; i >= 0; i--) {
                            System.out.println("pila[" + i + "]=" + pila[i]);
                        }
                        break;
                    case 5:
                        salir = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            }

        } while (!salir);

    }

    public static void Push(int dato) throws Exception {
        if (!isFull()) {
            puntero++;
            pila[puntero] = dato;
        } else {
            throw new Exception("Error: OverFlow in PILA");
        }
    }

    public static int Pop() throws Exception {
        if (!isEmpty()) {
            int regreso = pila[puntero];
            pila[puntero] = -1;
            puntero--;
            return regreso;
        } else {
            throw new Exception("Error: UnderFlow in PILA");
        }
    }

    public static void Clear() {
        pila = new int[tamanoPila];
        puntero = -1;
    }

    public static boolean isEmpty() {
        if (puntero == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFull() {
        if ((puntero + 1) >= tamanoPila) {
            return true;
        } else {
            return false;
        }
    }

    public static int getElement() {
        return pila[puntero];
    }

    public static int getLenght() {
        return pila.length;
    }
}
