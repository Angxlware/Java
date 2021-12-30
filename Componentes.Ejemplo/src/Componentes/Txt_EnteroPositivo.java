package Componentes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class Txt_EnteroPositivo extends JTextField
{
    public Txt_EnteroPositivo()
    {
        AsignarCaracterísticas();
        
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!(((c >= '0') && (c <= '9')) || (c == KeyEvent.VK_BACK_SPACE) 
                        || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    private void AsignarCaracterísticas()
    {
        try {
            this.setFont(new Fuentes.CrearFuente().Fuente
                (new Fuentes.CrearFuente().campo, 0, 20));
            this.setTransferHandler(null);
            this.setBackground(new java.awt.Color(63, 63, 63));
            this.setForeground(new java.awt.Color(255, 255, 255));
            this.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            this.setBorder(null);
            this.setCaretColor(new java.awt.Color(230, 57, 70));
            this.setSelectedTextColor(new java.awt.Color(33, 33, 33));
            this.setSelectionColor(new java.awt.Color(255, 255, 255));
        } catch (Exception ex) {
            Logger.getLogger(Txt_EnteroPositivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
