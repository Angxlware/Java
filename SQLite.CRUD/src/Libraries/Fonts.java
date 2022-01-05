package Libraries;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class Fonts 
{
    public Font getFont(String nombre, int estilo, float tamaño) throws Exception
    {
        try {
            InputStream is = getClass().getResourceAsStream(nombre);
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            font = font.deriveFont(estilo, tamaño);
            return font;
        }
        catch (FontFormatException | IOException e) {
            throw new Exception("Error al encontrar la fuente: " + e);
        }  
    }
}
