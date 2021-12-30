package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class Botón_Defecto extends JButton 
{
    public Botón_Defecto() 
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Fuentes.CrearFuente().Fuente
                (new Fuentes.CrearFuente().botón, 1, 24));
            this.setBackground(new java.awt.Color(230, 57, 70));
            this.setForeground(new java.awt.Color(0, 0, 0));
            this.setBorder(null);
            this.setBorderPainted(false);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } catch (Exception ex) {
            Logger.getLogger(Botón_Defecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
