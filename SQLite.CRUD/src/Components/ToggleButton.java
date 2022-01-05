package Components;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JToggleButton;

public class ToggleButton extends JToggleButton {
    
    public ToggleButton() {
        AsignarCaracterísticas();
    }
    
    private void AsignarCaracterísticas() {
        try {
            this.setText(null);
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDefault.png")));
            this.setBorder(null);
            this.setContentAreaFilled(false);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            this.setFocusPainted(false);
            this.setOpaque(false);
            this.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDefaultPressed.png")));
            this.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDefaultRollover.png")));
            this.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDefaultPressed.png")));
        } catch (Exception ex) {
            Logger.getLogger(ToggleButton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
