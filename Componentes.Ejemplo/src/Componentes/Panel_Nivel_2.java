package Componentes;

import javax.swing.JPanel;

public class Panel_Nivel_2 extends JPanel
{
    public Panel_Nivel_2()
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas() 
    {
        this.setBackground(new java.awt.Color(33, 33, 33));
        this.setFocusable(false);
        this.setRequestFocusEnabled(false);
        this.setLayout(null);
    }
}
