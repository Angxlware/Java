package Components;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class MenuButton extends JButton {
    
    public MenuButton() {
        AsignarCaracterísticas();
        
        this.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            }

            @Override
            public void focusLost(FocusEvent e) {
                setBorder(null);
            }
        });
    }
    
    private void AsignarCaracterísticas() {
        try {
            this.setFont(new Libraries.Fonts().getFont("arlrdbd.ttf", 0, 32));
            this.setBorder(null);
            this.setContentAreaFilled(false);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            this.setFocusPainted(false);
            this.setOpaque(false);
        } catch (Exception ex) {
            Logger.getLogger(MenuButton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
