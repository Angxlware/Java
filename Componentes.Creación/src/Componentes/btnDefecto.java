package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class btnDefecto extends JButton 
{
    public btnDefecto() 
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Libreria.Fuentes().ObtenerFuente
                (new Libreria.Fuentes().getNombreFuenteBoton(), 1, 24));
            this.setBackground(new java.awt.Color(230, 57, 70));
            this.setForeground(new java.awt.Color(0, 0, 0));
            this.setBorder(null);
            this.setBorderPainted(false);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } catch (Exception ex) {
            Logger.getLogger(btnDefecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
