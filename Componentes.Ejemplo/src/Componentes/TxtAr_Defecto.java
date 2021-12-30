package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class TxtAr_Defecto extends JTextArea
{
    public TxtAr_Defecto()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Fuentes.CrearFuente().Fuente
                (new Fuentes.CrearFuente().etiqueta, 0, 20));
            this.setEditable(false);
            this.setBackground(new java.awt.Color(63, 63, 63));
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setTabSize(4);
            this.setBorder(null);
            this.setSelectedTextColor(new java.awt.Color(0, 0, 0));
            this.setSelectionColor(new java.awt.Color(255, 255, 255));
            this.setRequestFocusEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(TxtAr_Defecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
