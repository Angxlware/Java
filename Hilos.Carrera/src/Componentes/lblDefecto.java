package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class lblDefecto extends JLabel
{
    public lblDefecto()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Librerias.Fuentes().CrearFuente
                (new Librerias.Fuentes().getFuenteEtiqueta(), 1, 50));
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setHorizontalAlignment(CENTER);
            this.setVerticalAlignment(CENTER);
            this.setFocusable(false);
            this.setRequestFocusEnabled(false);
        } 
        catch (Exception ex) {
            Logger.getLogger(lblDefecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}