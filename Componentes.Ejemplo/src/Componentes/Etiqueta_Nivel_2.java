package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Etiqueta_Nivel_2 extends JLabel
{
    public Etiqueta_Nivel_2()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Fuentes.CrearFuente().Fuente
                (new Fuentes.CrearFuente().etiqueta, 0, 24));
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setHorizontalAlignment(CENTER);
            this.setVerticalAlignment(CENTER);
            this.setFocusable(false);
            this.setRequestFocusEnabled(false);
        } 
        catch (Exception ex) {
            Logger.getLogger(Etiqueta_Nivel_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
