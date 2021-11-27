package Componentes;

import javax.swing.JPanel;

public class Panel_Nivel_3 extends JPanel
{
    public Panel_Nivel_3()
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
