/* 
https://github.com/Angxlware
Last revision 04/01/2022
 */
package Forms;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();

        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("AppIcon.png").getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button2 = new Components.Button();
        button1 = new Components.Button();
        label1 = new Components.Label();
        menuButton6 = new Components.MenuButton();
        menuButton7 = new Components.MenuButton();
        menuButton5 = new Components.MenuButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tópicos Avanzados de Programación, Unidad IV, Evidencia I: Sistema CRUD");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnMinimize.png"))); // NOI18N
        button2.setPressedIcon(null);
        button2.setRolloverIcon(null);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(1140, 10, 50, 50);

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnClose.png"))); // NOI18N
        button1.setPressedIcon(null);
        button1.setRolloverIcon(null);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(1200, 10, 50, 50);

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Menú Principal");
        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jPanel1.add(label1);
        label1.setBounds(10, 0, 1250, 70);

        menuButton6.setForeground(new java.awt.Color(255, 255, 255));
        menuButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnEmployee.png"))); // NOI18N
        menuButton6.setText("Empleado por Horas");
        menuButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        menuButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(menuButton6);
        menuButton6.setBounds(-510, 230, 500, 60);

        menuButton7.setForeground(new java.awt.Color(255, 255, 255));
        menuButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnEmployee.png"))); // NOI18N
        menuButton7.setText("Empleado Asalariado");
        menuButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        menuButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(menuButton7);
        menuButton7.setBounds(-510, 300, 500, 60);

        menuButton5.setForeground(new java.awt.Color(255, 255, 255));
        menuButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnGithub.png"))); // NOI18N
        menuButton5.setText("Github");
        menuButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        menuButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(menuButton5);
        menuButton5.setBounds(-510, 370, 500, 60);

        jLabel1.setBackground(new java.awt.Color(255, 50, 50));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 70);

        jLabel2.setBackground(new java.awt.Color(255, 50, 50));
        jLabel2.setForeground(new java.awt.Color(255, 50, 50));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MenuBackground.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-520, 220, 580, 220);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 70, 1260, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_button2ActionPerformed

    private void menuButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton6ActionPerformed

        new HourlyEmployee().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuButton6ActionPerformed

    private void menuButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton7ActionPerformed

        new SalariedEmployee().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuButton7ActionPerformed

    private void menuButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton5ActionPerformed

        Desktop desktop = java.awt.Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://github.com/Angxlware"));
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(rootPane,
                    "No se pudo mandar a la página https://github.com/Angxlware",
                    "Error de navegación",
                    0);
        }
    }//GEN-LAST:event_menuButton5ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        AnimationClass animation = new AnimationClass();

        animation.jLabelXRight(-520, 0, 10, 20, jLabel2);
        animation.jButtonXRight(-510, 10, 10, 20, menuButton6);
        animation.jButtonXRight(-510, 10, 10, 20, menuButton5);
        animation.jButtonXRight(-510, 10, 10, 20, menuButton7);

        animation.jLabelXLeft(0, -520, 10, 20, jLabel2);
        animation.jButtonXLeft(10, -510, 10, 20, menuButton6);
        animation.jButtonXLeft(10, -510, 10, 20, menuButton5);
        animation.jButtonXLeft(10, -510, 10, 20, menuButton7);

        jLabel2.requestFocus();
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException
                | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.Button button1;
    private Components.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private Components.Label label1;
    private javax.swing.JLabel lblBackground;
    private Components.MenuButton menuButton5;
    private Components.MenuButton menuButton6;
    private Components.MenuButton menuButton7;
    // End of variables declaration//GEN-END:variables
}
