package Components;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Label extends JLabel
{
    public Label()
    {
        AssignFeatures();
    }
    
    private void AssignFeatures()
    {
        try {
            this.setFont(new Libraries.Fonts().getFont("arlrdbd.ttf", 0, 32));
            this.setForeground(new java.awt.Color(255,50,50));
            this.setHorizontalAlignment(LEFT);
            this.setVerticalAlignment(CENTER);
            this.setFocusable(false);
            this.setRequestFocusEnabled(false);
        } 
        catch (Exception ex) {
            Logger.getLogger(Label.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}