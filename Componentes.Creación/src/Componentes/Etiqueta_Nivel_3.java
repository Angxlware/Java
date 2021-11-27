package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Etiqueta_Nivel_3 extends JLabel
{
    public Etiqueta_Nivel_3()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Librerías.Fuentes.CrearFuente().Fuente
                (new Librerías.Fuentes.CrearFuente().etiqueta, 0, 20));
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setHorizontalAlignment(CENTER);
            this.setVerticalAlignment(CENTER);
            this.setFocusable(false);
            this.setRequestFocusEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(Etiqueta_Nivel_3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
