package Components;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class TextField extends JTextField {

    public TextField() {
        AssignFeatures();

        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 50, 50), 2));
            }

            @Override
            public void focusLost(FocusEvent e) {
                setBorder(null);
            }
        });
    }

    private void AssignFeatures() {
        try {
            this.setFont(new Libraries.Fonts().getFont("arlrdbd.ttf", 0, 30));
            this.setForeground(new java.awt.Color(255, 50, 50));
            this.setBackground(new java.awt.Color(255, 255, 255));
            this.setOpaque(false);
            this.setBorder(null);
            this.setCaretColor(new java.awt.Color(255, 51, 51));
            this.setSelectedTextColor(new java.awt.Color(255, 255, 255));
            this.setSelectionColor(new java.awt.Color(255, 51, 51));
            this.setTransferHandler(null);
        } catch (Exception ex) {
            Logger.getLogger(TextField.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
