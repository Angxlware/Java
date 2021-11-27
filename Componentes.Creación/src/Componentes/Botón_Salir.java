package Componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class Botón_Salir extends JButton
{
    public Botón_Salir()
    {
        AsignarCaracterísticas();

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Librerías.Fuentes.CrearFuente().Fuente
                (new Librerías.Fuentes.CrearFuente().botón, 1, 24));
            this.setBackground(new java.awt.Color(230, 57, 70));
            this.setForeground(new java.awt.Color(0, 0, 0));
            this.setBorder(null);
            this.setBorderPainted(false);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } catch (Exception ex) {
            Logger.getLogger(Botón_Salir.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
