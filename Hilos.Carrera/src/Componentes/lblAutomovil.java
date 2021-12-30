package Componentes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class lblAutomovil extends JLabel
{
    public lblAutomovil()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Automovil.png")));
            this.setFocusable(false);
            this.setRequestFocusEnabled(false);
        } 
        catch (Exception ex) {
            Logger.getLogger(lblAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}