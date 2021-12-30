package Componentes;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class btnDefecto extends JButton {

    public btnDefecto() {
        AsignarCaracterísticas();
        
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 1, 122), 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                setBorder(null);
            }
        });
        
        this.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == VK_ENTER) {
                    doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }

    private void AsignarCaracterísticas() {
        try {
            this.setFont(new Librerias.Fuentes().CrearFuente(new Librerias.Fuentes().getFuenteBoton(), 1, 20));
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setBorder(null);
            this.setBorderPainted(true);
            this.setFocusPainted(false);
            this.setContentAreaFilled(false);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } catch (Exception ex) {
            Logger.getLogger(btnDefecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
