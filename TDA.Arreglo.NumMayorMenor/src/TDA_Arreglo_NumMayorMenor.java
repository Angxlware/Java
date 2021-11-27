import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TDA_Arreglo_NumMayorMenor 
{
    public static final NumMayorMenor objNumMayorMenor = new NumMayorMenor();
    public static final BufferedReader leerTeclado = new BufferedReader
        (new InputStreamReader(System.in));
    public static final String clrRojo = "\u001B[31m";
    public static final String clrReset = "\u001B[0m";
    
    public static void main(String[] args) throws IOException, Exception 
    {
        int[] conjunto = new int[10];
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("      POSICIÓN DEL NÚMERO MAYOR Y MENOR       ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < objNumMayorMenor.getConjunto().length; i++) 
        {
            conjunto[i] = LeerEntero("Ingrese el valor #" + (i + 1) + ": ");
        }
        objNumMayorMenor.setConjunto(conjunto);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                  RESULTADOS                  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Posición o posiciones del número mayor: ");
        System.out.println(objNumMayorMenor.getPosiciónMayor());
        System.out.println("Posición o posiciones del número menor: ");
        System.out.println(objNumMayorMenor.getPosiciónMenor());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        PROGRAMA FINALIZADO CON ÉXITO         ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.exit(0);
    }
    
    public static int LeerEntero(String mensaje) throws IOException
    {
        String elementoLeído;
        int elementoInt; 
        
        //Validación
        while (true)
        {
            System.out.print(mensaje);
            elementoLeído = leerTeclado.readLine();
            try
            {
                elementoInt = Integer.parseInt(elementoLeído);
                return elementoInt;
            }
            catch(Exception e)
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println (clrRojo +  " ERROR: Tipo de dato inválido "
                        + clrReset);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}