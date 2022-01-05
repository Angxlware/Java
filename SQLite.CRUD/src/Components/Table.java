package Components;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class Table extends JTable {

    public Table() {
        AsignarCaracterísticas();
    }

    private void AsignarCaracterísticas() {
        try {
            this.setBackground(new java.awt.Color(255, 255, 255));
            this.setFont(new Libraries.Fonts().getFont("arlrdbd.ttf", 0, 14));
            this.setForeground(new java.awt.Color(255, 50, 50));
            this.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
            this.setRequestFocusEnabled(false);
            this.setRowHeight(18);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            this.setSelectionBackground(new java.awt.Color(255, 50, 50));
            this.setSelectionForeground(new java.awt.Color(255, 255, 255));
            this.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            this.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            this.setShowGrid(true);
            this.getTableHeader().setResizingAllowed(false);
            this.getTableHeader().setReorderingAllowed(false);
        } catch (Exception ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
