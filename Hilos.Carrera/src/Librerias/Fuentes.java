package Librerias;

import java.awt.Font;
import java.io.InputStream;

public class Fuentes {

    private final String fuenteEtiqueta = "8-BIT WONDER.TTF";
    private final String fuenteBoton = "8-BIT WONDER.TTF";

    public String getFuenteEtiqueta() {
        return fuenteEtiqueta;
    }

    public String getFuenteBoton() {
        return fuenteBoton;
    }

    public Font CrearFuente(String nombre, int estilo, float tamaño) throws Exception {
        try {
            InputStream is = getClass().getResourceAsStream(nombre);
            Font fuente = Font.createFont(Font.TRUETYPE_FONT, is);
            fuente = fuente.deriveFont(estilo, tamaño);
            return fuente;
        } catch (Exception e) {
            throw new Exception("Error al encontrar la fuente: " + e);
        }
    }
}
