/* 
https://github.com/Angxlware
Last revision 30/12/2021
 */
package Formularios;

import Hilos.Corredor;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Carrera extends javax.swing.JFrame {

    private static Corredor[] corredores;
    private final JLabel[] automoviles;

    public Carrera() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("src/Imagenes/Iconox64.png").getImage());

        corredores = new Corredor[4];
        automoviles = new JLabel[4];
        automoviles[0] = lblAutomovil1;
        automoviles[1] = lblAutomovil2;
        automoviles[2] = lblAutomovil3;
        automoviles[3] = lblAutomovil4;

        btnComenzar.requestFocus();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGithub = new Componentes.lblDefecto();
        lblAutomovil1 = new Componentes.lblAutomovil();
        lblAutomovil2 = new Componentes.lblAutomovil();
        lblAutomovil3 = new Componentes.lblAutomovil();
        lblAutomovil4 = new Componentes.lblAutomovil();
        btnMinimizar = new Componentes.btnDefecto();
        btnSalir = new Componentes.btnDefecto();
        btnComenzar = new Componentes.btnDefecto();
        lblTítulo = new Componentes.lblDefecto();
        lblGanador = new Componentes.lblDefecto();
        lblMeta = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tópicos Avanzados de Programación, Unidad III, Evidencia I: Carrera");
        setUndecorated(true);
        setResizable(false);

        lblGithub.setText("github angxlware");
        lblGithub.setFont(lblGithub.getFont().deriveFont(lblGithub.getFont().getStyle() & ~java.awt.Font.BOLD, lblGithub.getFont().getSize()-35));

        btnMinimizar.setText("minimizar");
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnComenzar.setText("comenzar");
        btnComenzar.setFont(btnComenzar.getFont().deriveFont(btnComenzar.getFont().getSize()+5f));
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        lblTítulo.setText("carrera");

        lblGanador.setFont(lblGanador.getFont().deriveFont(lblGanador.getFont().getSize()-25f));

        lblMeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Meta.png"))); // NOI18N

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        lblFondo.setAlignmentY(0.0F);
        lblFondo.setMaximumSize(new java.awt.Dimension(720, 600));
        lblFondo.setMinimumSize(new java.awt.Dimension(720, 600));
        lblFondo.setPreferredSize(new java.awt.Dimension(720, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblAutomovil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblAutomovil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblAutomovil3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblGithub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblAutomovil4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(673, 673, 673)
                .addComponent(lblMeta))
            .addComponent(lblTítulo, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(lblAutomovil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblAutomovil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblAutomovil3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblGithub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(lblAutomovil4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(lblMeta))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblTítulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed

        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed

        btnComenzar.setEnabled(false);
        lblGanador.setText(null);
        for (int i = 0; i < corredores.length; i++) {
            corredores[i] = new Corredor("Corredor No " + (i + 1),
                    automoviles[i], lblMeta, lblGanador);
            corredores[i].start();
        }
    }//GEN-LAST:event_btnComenzarActionPerformed

    public static synchronized void TerminarCarrera() {

        ReproducirSonido("src/Sonidos/Victoria.wav");
        btnComenzar.setEnabled(true);
        btnComenzar.requestFocus();
        lblGanador.setText(null);
        for (int i = 0; i < corredores.length; i++) {
            corredores[i].interrupt();
        }
    }

    private static void ReproducirSonido(String ruta) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream
        (new File(ruta).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("Error al reproducir el archivo: " + e);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Carrera().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static Componentes.btnDefecto btnComenzar;
    private Componentes.btnDefecto btnMinimizar;
    private Componentes.btnDefecto btnSalir;
    private Componentes.lblAutomovil lblAutomovil1;
    private Componentes.lblAutomovil lblAutomovil2;
    private Componentes.lblAutomovil lblAutomovil3;
    private Componentes.lblAutomovil lblAutomovil4;
    private javax.swing.JLabel lblFondo;
    private static Componentes.lblDefecto lblGanador;
    private Componentes.lblDefecto lblGithub;
    private javax.swing.JLabel lblMeta;
    private Componentes.lblDefecto lblTítulo;
    // End of variables declaration//GEN-END:variables
}
