package Components;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class Button extends JButton {
    
    public Button() {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas() {
        try {
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDefault.png")));
            this.setBorder(null);
            this.setContentAreaFilled(false);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            this.setFocusPainted(false);
            this.setOpaque(false);
            this.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDefaultPressed.png")));
            this.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDefaultRollover.png")));
        } catch (Exception ex) {
            Logger.getLogger(Button.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
