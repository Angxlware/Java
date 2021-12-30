/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColasAnalizadorLexicoExpresiones {

    public static void main(String[] args) throws IOException, Exception {

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String expresion;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("   ANALIZADOR LEXICO DE EXPRESIONES CON COLAS    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" [i] Ejemplo de expresiones:                     ");
        System.out.println("x=10+23+2.2*24");
        System.out.println("b=23*134.3+33");
        System.out.println("p=235.13*32+15/2");
        System.out.println("[i] Que no se puede hacer:                       ");
        System.out.println("     1. No empezar con una letra seguido de un   ");
        System.out.println("        '=' la expresion                         ");
        System.out.println("     2. No terminar con un numero la expresion   ");
        System.out.println("     3. Ingresar un caracter no valido (incluye  ");
        System.out.println("        espacios y parentesis)                   ");
        System.out.println("     4. Ingresar dos puntos en un mismo numero   ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese la expresion a evaluar:");
        expresion = lector.readLine();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            AnalizarExpresion(expresion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("               PROGRAMA FINALIZADO               ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static void AnalizarExpresion(String expresion) throws Exception {

        //Introducir caracteres a la cola
        Queue cola = new Queue(expresion.length());
        for (int i = 0; i < cola.size(); i++) {
            cola.add(String.valueOf(expresion.toCharArray()[i]));
        }

        //Si la expresión empieza y termina correctamente
        if ((Character.isLetter(cola.remove().charAt(0))) && (cola.remove().equals("="))
                && (isNumber(cola.front())) && (isNumber(cola.rear()))) {
            String num = "";
            boolean punto = false;
            //Evaluar caracteres de la cola exceptuando los 2 primeros ya removidos
            for (int i = 0; i < cola.size() - 2; i++) {
                if (isNumber(cola.front())) {
                    if (punto && cola.front().equals(".")) {
                        throw new Exception("ERROR: DECIMAL NO VALIDO");
                    } else if (cola.front().equals(".")) {
                        punto = true;
                    }
                    num += cola.remove();
                    //Si el próximo elemento es un operador y la cola no está vacía
                    if (!cola.isEmpty() && isOper(cola.front())
                            || (i == cola.size() - 3)) {
                        if (num.contains(".")) {
                            System.out.println("'" + num + "': Decimal");
                            punto = false;
                        } else if (!num.contains(".")) {
                            System.out.println("'" + num + "': Entero");
                        }
                        if (i < cola.size() - 3) {
                            System.out.println("'" + cola.front() + "': Operador");
                            cola.remove();
                            num = "";
                            i++;
                        }
                    }
                } else {
                    throw new Exception("ERROR: NUMERO NO VALIDO");
                }
            } //No empieza ni termina correctamente
        } else {
            throw new Exception("ERROR: EXPRESION NO VALIDA");
        }
    }

    private static boolean isNumber(String num) {
        return (num.equals("1")) || (num.equals("2")) || (num.equals("3"))
                || (num.equals("4")) || (num.equals("5")) || (num.equals("6"))
                || (num.equals("7")) || (num.equals("8")) || (num.equals("9"))
                || (num.equals("0")) || (num.equals("."));
    }

    private static boolean isOper(String op) {
        return (op.equals("+")) || (op.equals("-")) || (op.equals("*"))
                || (op.equals("/"));
    }
}
