package Componentes;

import javax.swing.JPanel;

public class pnlNivel3 extends JPanel
{
    public pnlNivel3()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas() 
    {
        this.setBackground(new java.awt.Color(48, 48, 48));
        this.setFocusable(false);
        this.setRequestFocusEnabled(false);
        this.setLayout(null);
    }
}
