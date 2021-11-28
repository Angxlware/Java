package Componentes;

import javax.swing.JPanel;

public class pnlNivel1 extends JPanel
{
    public pnlNivel1()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas() 
    {
        this.setBackground(new java.awt.Color(18, 18, 18));
        this.setFocusable(false);
        this.setRequestFocusEnabled(false);
        this.setLayout(null);
    }
}
