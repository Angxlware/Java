package Librerías.Fuentes;

import java.awt.Font;
import java.io.InputStream;

public class CrearFuente 
{
    public String etiqueta = "Roboto.ttf";
    public String campo = "Roboto.ttf";
    public String botón = "Roboto.ttf";
    
    public Font Fuente(String nombre, int estilo, float tamaño) throws Exception
    {
        try {
            InputStream is = getClass().getResourceAsStream(nombre);
            Font fuente = Font.createFont(Font.TRUETYPE_FONT, is);
            fuente = fuente.deriveFont(estilo, tamaño);
            return fuente;
        }
        catch (Exception e) {
            throw new Exception("Error al encontrar la fuente: " + e);
        }
    }
}
