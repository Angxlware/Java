package Formularios_CDF;

import Formularios_Menú.Menú_FRM;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.event.KeyEvent;

public class CDF_E4_Ayuda extends javax.swing.JInternalFrame 
{   
    public final String tema = "Control de Flujo";
    public final String numEvidencia = "Evidencia IV";
    public final String nombreProblema = "Ayuda";
    
    public CDF_E4_Ayuda() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArMatriz = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(640, 560));
        setPreferredSize(new java.awt.Dimension(640, 560));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeiconified(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameIconified(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(48, 48, 48));
        jPanel1.setFocusable(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Descripción del Problema");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 560, 50);

        jScrollPane3.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setOpaque(false);

        txtArMatriz.setEditable(false);
        txtArMatriz.setBackground(new java.awt.Color(63, 63, 63));
        txtArMatriz.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtArMatriz.setForeground(new java.awt.Color(255, 255, 255));
        txtArMatriz.setTabSize(4);
        txtArMatriz.setText("- ¿Qué hace el programa?\n   Es un algoritmo que genera una tabla de impuestos a partir de un importe\n   inicial un importe final y el porcentaje del impuesto, la tabla mostrará el\n   importe, el impuesto del importe y el total por cada valor del importe.\n\n- ¿Qué datos necesito ingresar y qué significan?\n   - Importe inicial: El primer valor del importe (Número entero mayor que cero)\n   - Importe final: El último valor del importe (Número entero mayor que el\n      importe inicial)\n   - Impuesto: El impuesto expresado en porcentaje (Cualquier número positivo)\n\n- ¿Qué procesos se realizan?\n   - Se calcula el impuesto de cada importe\n   - Se calcula el total de cada importe\n\n- ¿Qué datos me muestra el programa?\n   Por cada importe se mostrará:  \n    - El importe\n    - El impuesto del importe\n    - El total del importe");
        txtArMatriz.setBorder(null);
        txtArMatriz.setCaretPosition(0);
        txtArMatriz.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArMatriz.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(txtArMatriz);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 70, 560, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 600, 390);

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setFocusable(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(null);

        btnCerrar.setBackground(new java.awt.Color(230, 57, 70));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        btnCerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCerrarKeyPressed(evt);
            }
        });
        jPanel2.add(btnCerrar);
        btnCerrar.setBounds(310, 20, 270, 50);

        btnCentrar.setBackground(new java.awt.Color(230, 57, 70));
        btnCentrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCentrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCentrar.setText("Centrar");
        btnCentrar.setBorder(null);
        btnCentrar.setBorderPainted(false);
        btnCentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentrarActionPerformed(evt);
            }
        });
        btnCentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCentrarKeyPressed(evt);
            }
        });
        jPanel2.add(btnCentrar);
        btnCentrar.setBounds(20, 20, 270, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 430, 600, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrarActionPerformed
        this.setLocation(((dpPantalla.getWidth() - this.getWidth()) / 2), 
                ((dpPantalla.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCentrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCentrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCentrar.doClick();
        }
    }//GEN-LAST:event_btnCentrarKeyPressed

    private void btnCerrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCerrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCerrar.doClick();
        }
    }//GEN-LAST:event_btnCerrarKeyPressed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Menú_FRM.objFlujoAyudaE4 = null;
        itmFlujoAyudaE4.setEnabled(true);
        itmFlujoAyudaE4.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle("CDF, E4: Ayuda");
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtArMatriz;
    // End of variables declaration//GEN-END:variables
}