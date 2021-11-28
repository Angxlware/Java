package Formularios_Menú;

import static Formularios_Menú.Menú_FRM.*;
import java.awt.event.KeyEvent;

public class Ayuda_FRM extends javax.swing.JInternalFrame 
{   
    public final String nombreProblema = "Acerca de";
    
    public Ayuda_FRM() 
    {
        initComponents();
        this.setTitle(nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArTexto = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArTexto1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(630, 600));
        setPreferredSize(new java.awt.Dimension(630, 600));
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
        jLabel1.setText("Acerca del Programa");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 550, 50);

        jTabbedPane1.setBackground(new java.awt.Color(63, 63, 63));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        jTabbedPane5.setBackground(new java.awt.Color(63, 63, 63));
        jTabbedPane5.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane5.setOpaque(true);

        jPanel9.setBackground(new java.awt.Color(48, 48, 48));
        jPanel9.setFocusable(false);
        jPanel9.setRequestFocusEnabled(false);
        jPanel9.setLayout(null);

        jScrollPane3.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setOpaque(false);

        txtArTexto.setEditable(false);
        txtArTexto.setBackground(new java.awt.Color(63, 63, 63));
        txtArTexto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtArTexto.setForeground(new java.awt.Color(255, 255, 255));
        txtArTexto.setTabSize(4);
        txtArTexto.setText("Nombre: Ángel Mauricio Romero López\nNo. de Control: 19330661\nContacto: amrl7654321@gmail.com");
        txtArTexto.setBorder(null);
        txtArTexto.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArTexto.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(txtArTexto);

        jPanel9.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 420, 330);

        jTabbedPane5.addTab("Creador", jPanel9);

        jPanel13.setBackground(new java.awt.Color(48, 48, 48));
        jPanel13.setFocusable(false);
        jPanel13.setRequestFocusEnabled(false);
        jPanel13.setLayout(null);

        jScrollPane4.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setOpaque(false);

        txtArTexto1.setEditable(false);
        txtArTexto1.setBackground(new java.awt.Color(63, 63, 63));
        txtArTexto1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtArTexto1.setForeground(new java.awt.Color(255, 255, 255));
        txtArTexto1.setTabSize(4);
        txtArTexto1.setText("Nombre: Tópicos Avanzados de Programación\nEscuela: Tecnológico Nacional de México Campus Hermosillo\nProfesor: Ing. Victor Manuel Jaime Burgos");
        txtArTexto1.setBorder(null);
        txtArTexto1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArTexto1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(txtArTexto1);

        jPanel13.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 420, 330);

        jTabbedPane5.addTab("Materia", jPanel13);

        jPanel3.add(jTabbedPane5);
        jTabbedPane5.setBounds(0, 0, 480, 340);

        jTabbedPane1.addTab("Datos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(48, 48, 48));
        jPanel4.setFocusable(false);
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(null);

        jTabbedPane7.setBackground(new java.awt.Color(63, 63, 63));
        jTabbedPane7.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane7.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane7.setOpaque(true);

        jPanel11.setBackground(new java.awt.Color(48, 48, 48));
        jPanel11.setFocusable(false);
        jPanel11.setRequestFocusEnabled(false);
        jPanel11.setLayout(null);

        jTabbedPane8.setBackground(new java.awt.Color(63, 63, 63));
        jTabbedPane8.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane8.setOpaque(true);

        jPanel12.setBackground(new java.awt.Color(33, 33, 33));
        jPanel12.setFocusable(false);
        jPanel12.setRequestFocusEnabled(false);
        jPanel12.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_CDF/CalcularY_Pantalla.png"))); // NOI18N
        jPanel12.add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 310);

        jTabbedPane8.addTab("Ev. I", jPanel12);

        jPanel18.setBackground(new java.awt.Color(33, 33, 33));
        jPanel18.setFocusable(false);
        jPanel18.setRequestFocusEnabled(false);
        jPanel18.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_CDF/CalcularZ_Pantalla.png"))); // NOI18N
        jPanel18.add(jLabel7);
        jLabel7.setBounds(0, 0, 400, 310);

        jTabbedPane8.addTab("Ev. II", jPanel18);

        jPanel19.setBackground(new java.awt.Color(33, 33, 33));
        jPanel19.setFocusable(false);
        jPanel19.setRequestFocusEnabled(false);
        jPanel19.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_CDF/OrdenarABC_Pantalla.png"))); // NOI18N
        jPanel19.add(jLabel8);
        jLabel8.setBounds(0, 0, 400, 310);

        jTabbedPane8.addTab("Ev. III", jPanel19);

        jPanel20.setBackground(new java.awt.Color(33, 33, 33));
        jPanel20.setFocusable(false);
        jPanel20.setRequestFocusEnabled(false);
        jPanel20.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_CDF/CalcImpuestos_Pantalla.png"))); // NOI18N
        jPanel20.add(jLabel9);
        jLabel9.setBounds(0, 0, 400, 310);

        jTabbedPane8.addTab("Ev. IV", jPanel20);

        jPanel21.setBackground(new java.awt.Color(33, 33, 33));
        jPanel21.setFocusable(false);
        jPanel21.setRequestFocusEnabled(false);
        jPanel21.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_CDF/EvaluarLista_Pantalla.png"))); // NOI18N
        jPanel21.add(jLabel10);
        jLabel10.setBounds(0, 0, 400, 310);

        jTabbedPane8.addTab("Ev. V", jPanel21);

        jPanel11.add(jTabbedPane8);
        jTabbedPane8.setBounds(0, 0, 400, 340);

        jTabbedPane7.addTab("Control", jPanel11);

        jPanel22.setBackground(new java.awt.Color(48, 48, 48));
        jPanel22.setFocusable(false);
        jPanel22.setRequestFocusEnabled(false);
        jPanel22.setLayout(null);

        jTabbedPane11.setBackground(new java.awt.Color(63, 63, 63));
        jTabbedPane11.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane11.setOpaque(true);

        jPanel23.setBackground(new java.awt.Color(33, 33, 33));
        jPanel23.setFocusable(false);
        jPanel23.setRequestFocusEnabled(false);
        jPanel23.setLayout(null);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Vectores/EscalarArreglo_Pantalla.png"))); // NOI18N
        jPanel23.add(jLabel11);
        jLabel11.setBounds(0, 0, 400, 310);

        jTabbedPane11.addTab("Ev. I", jPanel23);

        jPanel24.setBackground(new java.awt.Color(33, 33, 33));
        jPanel24.setFocusable(false);
        jPanel24.setRequestFocusEnabled(false);
        jPanel24.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Vectores/RepMayMen_Pantalla.png"))); // NOI18N
        jPanel24.add(jLabel12);
        jLabel12.setBounds(0, 0, 400, 310);

        jTabbedPane11.addTab("Ev. II", jPanel24);

        jPanel25.setBackground(new java.awt.Color(33, 33, 33));
        jPanel25.setFocusable(false);
        jPanel25.setRequestFocusEnabled(false);
        jPanel25.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Vectores/IntercMayMen_Pantalla.png"))); // NOI18N
        jPanel25.add(jLabel13);
        jLabel13.setBounds(0, 0, 400, 310);

        jTabbedPane11.addTab("Ev. III", jPanel25);

        jPanel26.setBackground(new java.awt.Color(33, 33, 33));
        jPanel26.setFocusable(false);
        jPanel26.setRequestFocusEnabled(false);
        jPanel26.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Vectores/OrdenarArreglo_Pantalla.png"))); // NOI18N
        jPanel26.add(jLabel14);
        jLabel14.setBounds(0, 0, 400, 310);

        jTabbedPane11.addTab("Ev. IV", jPanel26);

        jPanel27.setBackground(new java.awt.Color(33, 33, 33));
        jPanel27.setFocusable(false);
        jPanel27.setRequestFocusEnabled(false);
        jPanel27.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Vectores/PromTemp_Pantalla.png"))); // NOI18N
        jPanel27.add(jLabel15);
        jLabel15.setBounds(0, 0, 400, 310);

        jTabbedPane11.addTab("Ev. V", jPanel27);

        jPanel22.add(jTabbedPane11);
        jTabbedPane11.setBounds(0, 0, 400, 340);

        jTabbedPane7.addTab("Vectores", jPanel22);

        jPanel28.setBackground(new java.awt.Color(48, 48, 48));
        jPanel28.setFocusable(false);
        jPanel28.setRequestFocusEnabled(false);
        jPanel28.setLayout(null);

        jTabbedPane12.setBackground(new java.awt.Color(63, 63, 63));
        jTabbedPane12.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane12.setOpaque(true);

        jPanel29.setBackground(new java.awt.Color(33, 33, 33));
        jPanel29.setFocusable(false);
        jPanel29.setRequestFocusEnabled(false);
        jPanel29.setLayout(null);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Matrices/EscalarMatriz_Pantalla.png"))); // NOI18N
        jPanel29.add(jLabel16);
        jLabel16.setBounds(0, 0, 400, 310);

        jTabbedPane12.addTab("Ev. I", jPanel29);

        jPanel30.setBackground(new java.awt.Color(33, 33, 33));
        jPanel30.setFocusable(false);
        jPanel30.setRequestFocusEnabled(false);
        jPanel30.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Matrices/MayorDiagonal_Pantalla.png"))); // NOI18N
        jPanel30.add(jLabel17);
        jLabel17.setBounds(0, 0, 400, 310);

        jTabbedPane12.addTab("Ev. II", jPanel30);

        jPanel31.setBackground(new java.awt.Color(33, 33, 33));
        jPanel31.setFocusable(false);
        jPanel31.setRequestFocusEnabled(false);
        jPanel31.setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Matrices/IntercambiarCol_Pantalla.png"))); // NOI18N
        jPanel31.add(jLabel18);
        jLabel18.setBounds(0, 0, 400, 310);

        jTabbedPane12.addTab("Ev. III", jPanel31);

        jPanel32.setBackground(new java.awt.Color(33, 33, 33));
        jPanel32.setFocusable(false);
        jPanel32.setRequestFocusEnabled(false);
        jPanel32.setLayout(null);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Matrices/SumarColum_Pantalla.png"))); // NOI18N
        jPanel32.add(jLabel19);
        jLabel19.setBounds(0, 0, 400, 310);

        jTabbedPane12.addTab("Ev. IV", jPanel32);

        jPanel33.setBackground(new java.awt.Color(33, 33, 33));
        jPanel33.setFocusable(false);
        jPanel33.setRequestFocusEnabled(false);
        jPanel33.setLayout(null);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Matrices/MaySumResDP_Pantalla.png"))); // NOI18N
        jPanel33.add(jLabel20);
        jLabel20.setBounds(0, 0, 400, 310);

        jTabbedPane12.addTab("Ev. V", jPanel33);

        jPanel28.add(jTabbedPane12);
        jTabbedPane12.setBounds(0, 0, 400, 340);

        jTabbedPane7.addTab("Matrices", jPanel28);

        jPanel4.add(jTabbedPane7);
        jTabbedPane7.setBounds(0, 0, 490, 340);

        jTabbedPane1.addTab("Ejercicios", jPanel4);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 70, 550, 340);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 590, 430);

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
        btnCerrar.setBounds(310, 20, 260, 50);

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
        jPanel2.setBounds(20, 470, 590, 90);

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
        objAyuda = null;
        itmAcerca.setEnabled(true);
        itmAcerca.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextArea txtArTexto;
    private javax.swing.JTextArea txtArTexto1;
    // End of variables declaration//GEN-END:variables
}