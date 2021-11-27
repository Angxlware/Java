package Formulario;

import Hilos.Caballo;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

public class Formulario extends javax.swing.JFrame {
    
    private static Caballo[] caballos;
    private JProgressBar[] pistas;
    private boolean[] ganadores;
    
    public Formulario() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        caballos = new Caballo[4];
        pistas = new JProgressBar[4];
        pistas[0] = pg1;
        pistas[1] = pg2;
        pistas[2] = pg3;
        pistas[3] = pg4;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pg1 = new javax.swing.JProgressBar();
        pg2 = new javax.swing.JProgressBar();
        pg3 = new javax.swing.JProgressBar();
        pg4 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblGanador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnIniciar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tópicos Avanzados de Programación, Unidad III, Evidencia I: Carrera de Caballos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(33, 33, 33));
        jPanel3.setLayout(null);

        pg1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        pg1.setBorder(null);
        pg1.setBorderPainted(false);
        pg1.setRequestFocusEnabled(false);
        pg1.setStringPainted(true);
        jPanel3.add(pg1);
        pg1.setBounds(20, 70, 560, 40);

        pg2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        pg2.setBorder(null);
        pg2.setBorderPainted(false);
        pg2.setRequestFocusEnabled(false);
        pg2.setStringPainted(true);
        jPanel3.add(pg2);
        pg2.setBounds(20, 130, 560, 40);

        pg3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        pg3.setBorder(null);
        pg3.setBorderPainted(false);
        pg3.setRequestFocusEnabled(false);
        pg3.setStringPainted(true);
        jPanel3.add(pg3);
        pg3.setBounds(20, 190, 560, 40);

        pg4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        pg4.setBorder(null);
        pg4.setBorderPainted(false);
        pg4.setRequestFocusEnabled(false);
        pg4.setStringPainted(true);
        jPanel3.add(pg4);
        pg4.setBounds(20, 250, 560, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pistas");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 10, 560, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 20, 600, 310);

        jPanel4.setBackground(new java.awt.Color(33, 33, 33));
        jPanel4.setLayout(null);

        lblGanador.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblGanador.setForeground(new java.awt.Color(255, 255, 255));
        lblGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanador.setText("Ganador de la carrera");
        jPanel4.add(lblGanador);
        lblGanador.setBounds(20, -10, 560, 70);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 350, 600, 60);

        jPanel2.setBackground(new java.awt.Color(33, 33, 33));
        jPanel2.setLayout(null);

        btnIniciar.setText("Iniciar Carrera");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciar);
        btnIniciar.setBounds(20, 70, 270, 49);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Controles");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 10, 560, 50);

        btnIniciar1.setText("Salir");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciar1);
        btnIniciar1.setBounds(310, 70, 270, 49);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 430, 600, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        lblGanador.setText("Ganador de la carrera");
        btnIniciar.setEnabled(false);
        for (int i = 0; i < caballos.length; i++) {
            caballos[i] = new Caballo("Caballo " + (i + 1), pistas[i], lblGanador);
            caballos[i].start();
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnIniciar1ActionPerformed
    
    public synchronized static void TerminarHilos() {
        
        btnIniciar.setEnabled(true);
        for (int i = 0; i < caballos.length; i++) {
            caballos[i].interrupt();
        }
    }
    
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
    private static javax.swing.JButton btnIniciar;
    private static javax.swing.JButton btnIniciar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblGanador;
    private javax.swing.JProgressBar pg1;
    private javax.swing.JProgressBar pg2;
    private javax.swing.JProgressBar pg3;
    private javax.swing.JProgressBar pg4;
    // End of variables declaration//GEN-END:variables
}
