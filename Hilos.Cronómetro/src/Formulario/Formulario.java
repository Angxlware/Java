package Formulario;

import Hilos.*;
import javax.swing.UIManager;

public class Formulario extends javax.swing.JFrame {
    
    private Cronómetro hiloCronómetro;
    private int contador = 0;
    
    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnMarcar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnReanudar = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMarcas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tópicos Avanzados de Programación, Unidad III, Evidencia I");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(18, 18, 18));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(48, 48, 48));
        jPanel4.setLayout(null);

        btnMarcar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnMarcar.setText("Añadir Marca");
        btnMarcar.setEnabled(false);
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });
        jPanel4.add(btnMarcar);
        btnMarcar.setBounds(20, 20, 120, 34);

        btnIniciar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel4.add(btnIniciar);
        btnIniciar.setBounds(160, 20, 120, 34);

        btnPausar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnPausar.setText("Pausar");
        btnPausar.setEnabled(false);
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });
        jPanel4.add(btnPausar);
        btnPausar.setBounds(300, 20, 120, 34);

        btnReanudar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnReanudar.setText("Reanudar");
        btnReanudar.setEnabled(false);
        btnReanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReanudarActionPerformed(evt);
            }
        });
        jPanel4.add(btnReanudar);
        btnReanudar.setBounds(20, 70, 120, 34);

        btnDetener.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDetener.setText("Detener");
        btnDetener.setEnabled(false);
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });
        jPanel4.add(btnDetener);
        btnDetener.setBounds(160, 70, 120, 34);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(300, 70, 120, 34);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 230, 440, 120);

        jPanel5.setBackground(new java.awt.Color(48, 48, 48));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cronómetro");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(20, 10, 170, 30);

        lblTiempo.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("00:00:00");
        jPanel5.add(lblTiempo);
        lblTiempo.setBounds(20, 40, 170, 130);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 20, 210, 190);

        jPanel6.setBackground(new java.awt.Color(48, 48, 48));
        jPanel6.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Marcas");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(20, 10, 170, 30);

        txtMarcas.setEditable(false);
        txtMarcas.setBackground(new java.awt.Color(63, 63, 63));
        txtMarcas.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtMarcas.setForeground(new java.awt.Color(255, 255, 255));
        txtMarcas.setTabSize(0);
        jScrollPane1.setViewportView(txtMarcas);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(20, 43, 170, 130);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(250, 20, 210, 190);

        jTabbedPane1.addTab("Cronómetro", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 394));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed

        hiloCronómetro.interrupt();
        lblTiempo.setText("00:00:00");
        txtMarcas.setText(null);
        btnIniciar.setEnabled(true);
        btnMarcar.setEnabled(false);
        btnPausar.setEnabled(false);
        btnReanudar.setEnabled(false);
        btnDetener.setEnabled(false);
    }//GEN-LAST:event_btnDetenerActionPerformed

    private void btnReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReanudarActionPerformed

        hiloCronómetro.resume();
        btnReanudar.setEnabled(false);
        btnPausar.setEnabled(true);
        btnMarcar.setEnabled(true);
        btnDetener.setEnabled(false);
    }//GEN-LAST:event_btnReanudarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed

        hiloCronómetro.suspend();
        btnPausar.setEnabled(false);
        btnReanudar.setEnabled(true);
        btnMarcar.setEnabled(false);
        btnDetener.setEnabled(true);
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        hiloCronómetro = new Cronómetro(lblTiempo);
        hiloCronómetro.start();
        btnIniciar.setEnabled(false);
        btnMarcar.setEnabled(true);
        btnPausar.setEnabled(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed

        contador++;
        txtMarcas.append("Marca #" + contador + ": " + lblTiempo.getText() + "\n");
    }//GEN-LAST:event_btnMarcarActionPerformed
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMarcar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnReanudar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JTextArea txtMarcas;
    // End of variables declaration//GEN-END:variables
}
