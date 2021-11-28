package Componentes;

import javax.swing.JTextField;

public class txtResultado extends JTextField
{
    public txtResultado() throws Exception
    {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas() throws Exception
    {
        this.setEditable(false);
        this.setBackground(new java.awt.Color(63, 63, 63));
        this.setFont(new Libreria.Fuentes().ObtenerFuente
        (new Libreria.Fuentes().getNombreFuenteCampo(), 0, 20));
        this.setForeground(new java.awt.Color(255, 255, 255));
        this.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        this.setBorder(null);
        this.setCaretColor(new java.awt.Color(230, 57, 70));
        this.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        this.setSelectionColor(new java.awt.Color(255, 255, 255));
    }
}
