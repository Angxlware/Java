/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Clases;

import java.io.BufferedReader;
import java.io.FileReader;

public class PilasCalculadora {

    private static Queue pila;
    private static BufferedReader comandos;

    public static void main(String[] args) throws Exception {
        comandos = new BufferedReader(new FileReader("src/Texto/Comandos.txt"));
        pila = new Queue(2);

        try {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("   CALCULADORA A BASE DE COMANDOS USANDO PILAS   ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("El resultado del calculo es: " + Calcular());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static double Calcular() throws Exception {
        String lineaComando;
        int lineaContador = 0;

        try {
            //Evaluar todas las lineas de la consola
            while ((lineaComando = comandos.readLine()) != null) {
                lineaContador++;
                //Evaluar los primeros 3 carácteres de cada línea
                switch (lineaComando.substring(0, 3)) {
                    case "ldc" ->
                        pila.push(ValidarNumero(lineaComando.substring(4, lineaComando.length())));
                    case "add" ->
                        pila.add();
                    case "sub" ->
                        pila.sub();
                    case "mul" ->
                        pila.mul();
                    case "div" ->
                        pila.div();
                    case "stp" -> {
                        if (!pila.isFull()) {
                            return pila.pop();
                        } //Si no se efectuó ninguna operación manda error
                        else {
                            throw new Exception();
                        }
                    }
                    default ->
                        throw new Exception();
                }
                //Comando no válido
            }
            //No se encontró el comando stp, por lo tanto no retornó y manda error
            lineaContador++;
            throw new Exception();
        } //Sea cuál sea el error regresa la línea de comando donde ocurrió
        catch (Exception e) {
            throw new Exception("ERROR: LINEA DE COMANDO NO. "
                    + lineaContador + " NO VALIDA");
        }
    }

    private static double ValidarNumero(String num) throws Exception {
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException e) {
            throw new Exception("ERROR: AL CONVERTIR NUMERO");
        }
    }
}
