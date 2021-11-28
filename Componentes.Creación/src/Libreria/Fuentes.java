package Libreria;

import java.awt.Font;
import java.io.InputStream;

public class Fuentes 
{
    private String nombreFuenteEtiqueta = "Roboto.ttf";
    private String nombreFuenteCampo = "Roboto.ttf";
    private String nombreFuenteBoton = "Roboto.ttf";
    
    public String getNombreFuenteEtiqueta() {
        return nombreFuenteEtiqueta;
    }
    
    public String getNombreFuenteCampo() {
        return nombreFuenteCampo;
    }
    
    public String getNombreFuenteBoton() {
        return nombreFuenteBoton;
    }
    
    public Font ObtenerFuente(String nombre, int estilo, float tamaño) throws Exception
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
