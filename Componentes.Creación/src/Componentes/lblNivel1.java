package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class lblNivel1 extends JLabel
{
    public lblNivel1()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Libreria.Fuentes().ObtenerFuente
                (new Libreria.Fuentes().getNombreFuenteEtiqueta(), 1, 38));
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setHorizontalAlignment(CENTER);
            this.setVerticalAlignment(CENTER);
            this.setFocusable(false);
            this.setRequestFocusEnabled(false);
        } 
        catch (Exception ex) {
            Logger.getLogger(lblNivel1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}