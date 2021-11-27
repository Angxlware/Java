package Formularios_Menú;

import Formularios_CDF.*;
import Formularios_Matrices.*;
import Formularios_Vectores.*;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class Menú_FRM extends javax.swing.JFrame 
{
    public static CDF_E1_IFRM objFlujoFormE1;
    public static CDF_E1_Modelado objFlujoModeloE1;
    public static CDF_E1_Ayuda objFlujoAyudaE1;
    public static CDF_E2_IFRM objFlujoFormE2;
    public static CDF_E2_Modelado objFlujoModeloE2;
    public static CDF_E2_Ayuda objFlujoAyudaE2;
    public static CDF_E3_IFRM objFlujoFormE3;
    public static CDF_E3_Modelado objFlujoModeloE3;
    public static CDF_E3_Ayuda objFlujoAyudaE3;
    public static CDF_E4_IFRM objFlujoFormE4;
    public static CDF_E4_Modelado objFlujoModeloE4;
    public static CDF_E4_Ayuda objFlujoAyudaE4;
    public static CDF_E5_IFRM objFlujoFormE5;
    public static CDF_E5_Modelado objFlujoModeloE5;
    public static CDF_E5_Ayuda objFlujoAyudaE5;
    
    public static Vec_E1_IFRM objVecFormE1;
    public static Vec_E1_Modelado objVecModeloE1;
    public static Vec_E1_Ayuda objVecAyudaE1;
    public static Vec_E2_IFRM objVecFormE2;
    public static Vec_E2_Modelado objVecModeloE2;
    public static Vec_E2_Ayuda objVecAyudaE2;
    public static Vec_E3_IFRM objVecFormE3;
    public static Vec_E3_Modelado objVecModeloE3;
    public static Vec_E3_Ayuda objVecAyudaE3;
    public static Vec_E4_IFRM objVecFormE4;
    public static Vec_E4_Modelado objVecModeloE4;
    public static Vec_E4_Ayuda objVecAyudaE4;
    public static Vec_E5_IFRM objVecFormE5;
    public static Vec_E5_Modelado objVecModeloE5;
    public static Vec_E5_Ayuda objVecAyudaE5;
    
    public static Mat_E1_IFRM objMatFormE1;
    public static Mat_E1_Modelado objMatModeloE1;
    public static Mat_E1_Ayuda objMatAyudaE1;
    public static Mat_E2_IFRM objMatFormE2;
    public static Mat_E2_Modelado objMatModeloE2;
    public static Mat_E2_Ayuda objMatAyudaE2;
    public static Mat_E3_IFRM objMatFormE3;
    public static Mat_E3_Modelado objMatModeloE3;
    public static Mat_E3_Ayuda objMatAyudaE3;
    public static Mat_E4_IFRM objMatFormE4;
    public static Mat_E4_Modelado objMatModeloE4;
    public static Mat_E4_Ayuda objMatAyudaE4;
    public static Mat_E5_IFRM objMatFormE5;
    public static Mat_E5_Modelado objMatModeloE5;
    public static Mat_E5_Ayuda objMatAyudaE5;
    
    public static Ayuda_FRM objAyuda;
    
    public Menú_FRM() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPantalla = new javax.swing.JDesktopPane();
        brBarraMenú = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        itmArchivoSalir = new javax.swing.JMenuItem();
        mnFlujo = new javax.swing.JMenu();
        mnFlujoE1 = new javax.swing.JMenu();
        itmFlujoFormE1 = new javax.swing.JMenuItem();
        itmFlujoModeloE1 = new javax.swing.JMenuItem();
        itmFlujoAyudaE1 = new javax.swing.JMenuItem();
        mnFlujoE2 = new javax.swing.JMenu();
        itmFlujoFormE2 = new javax.swing.JMenuItem();
        itmFlujoModeloE2 = new javax.swing.JMenuItem();
        itmFlujoAyudaE2 = new javax.swing.JMenuItem();
        mnFlujoE3 = new javax.swing.JMenu();
        itmFlujoFormE3 = new javax.swing.JMenuItem();
        itmFlujoModeloE3 = new javax.swing.JMenuItem();
        itmFlujoAyudaE3 = new javax.swing.JMenuItem();
        mnFlujoE4 = new javax.swing.JMenu();
        itmFlujoFormE4 = new javax.swing.JMenuItem();
        itmFlujoModeloE4 = new javax.swing.JMenuItem();
        itmFlujoAyudaE4 = new javax.swing.JMenuItem();
        mnFlujoE5 = new javax.swing.JMenu();
        itmFlujoFormE5 = new javax.swing.JMenuItem();
        itmFlujoModeloE5 = new javax.swing.JMenuItem();
        itmFlujoAyudaE5 = new javax.swing.JMenuItem();
        mnVectores = new javax.swing.JMenu();
        mnVecE1 = new javax.swing.JMenu();
        itmVecFormE1 = new javax.swing.JMenuItem();
        itmVecModeloE1 = new javax.swing.JMenuItem();
        itmVecAyudaE1 = new javax.swing.JMenuItem();
        mnVecE2 = new javax.swing.JMenu();
        itmVecFormE2 = new javax.swing.JMenuItem();
        itmVecModeloE2 = new javax.swing.JMenuItem();
        itmVecAyudaE2 = new javax.swing.JMenuItem();
        mnVecE3 = new javax.swing.JMenu();
        itmVecFormE3 = new javax.swing.JMenuItem();
        itmVecModeloE3 = new javax.swing.JMenuItem();
        itmVecAyudaE3 = new javax.swing.JMenuItem();
        mnVecE4 = new javax.swing.JMenu();
        itmVecFormE4 = new javax.swing.JMenuItem();
        itmVecModeloE4 = new javax.swing.JMenuItem();
        itmVecAyudaE4 = new javax.swing.JMenuItem();
        mnVecE5 = new javax.swing.JMenu();
        itmVecFormE5 = new javax.swing.JMenuItem();
        itmVecModeloE5 = new javax.swing.JMenuItem();
        itmVecAyudaE5 = new javax.swing.JMenuItem();
        mnMatrices = new javax.swing.JMenu();
        mnFlujoE11 = new javax.swing.JMenu();
        itmMatFormE1 = new javax.swing.JMenuItem();
        itmMatModeloE1 = new javax.swing.JMenuItem();
        itmMatAyudaE1 = new javax.swing.JMenuItem();
        mnFlujoE12 = new javax.swing.JMenu();
        itmMatFormE2 = new javax.swing.JMenuItem();
        itmMatModeloE2 = new javax.swing.JMenuItem();
        itmMatAyudaE2 = new javax.swing.JMenuItem();
        mnFlujoE13 = new javax.swing.JMenu();
        itmMatFormE3 = new javax.swing.JMenuItem();
        itmMatModeloE3 = new javax.swing.JMenuItem();
        itmMatAyudaE3 = new javax.swing.JMenuItem();
        mnFlujoE14 = new javax.swing.JMenu();
        itmMatFormE4 = new javax.swing.JMenuItem();
        itmMatModeloE4 = new javax.swing.JMenuItem();
        itmMatAyudaE4 = new javax.swing.JMenuItem();
        mnFlujoE15 = new javax.swing.JMenu();
        itmMatFormE5 = new javax.swing.JMenuItem();
        itmMatModeloE5 = new javax.swing.JMenuItem();
        itmMatAyudaE5 = new javax.swing.JMenuItem();
        mnAyuda = new javax.swing.JMenu();
        itmAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tópicos Avanzados de Programación, Unidad I, Evidencia II: Menú de Formularios");
        setAutoRequestFocus(false);
        setFocusCycleRoot(false);
        setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        setIconImage(new ImageIcon("src/Imágenes_Menú/Ícono_x64.png").getImage());
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        dpPantalla.setBackground(new java.awt.Color(18, 18, 18));
        dpPantalla.setForeground(new java.awt.Color(255, 255, 255));
        dpPantalla.setFocusCycleRoot(false);
        dpPantalla.setNextFocusableComponent(brBarraMenú);

        javax.swing.GroupLayout dpPantallaLayout = new javax.swing.GroupLayout(dpPantalla);
        dpPantalla.setLayout(dpPantallaLayout);
        dpPantallaLayout.setHorizontalGroup(
            dpPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        dpPantallaLayout.setVerticalGroup(
            dpPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        getContentPane().add(dpPantalla);

        brBarraMenú.setBackground(new java.awt.Color(33, 33, 33));
        brBarraMenú.setBorder(null);
        brBarraMenú.setBorderPainted(false);
        brBarraMenú.setFocusCycleRoot(true);
        brBarraMenú.setNextFocusableComponent(mnArchivo);

        mnArchivo.setBackground(new java.awt.Color(48, 48, 48));
        mnArchivo.setBorder(null);
        mnArchivo.setForeground(new java.awt.Color(255, 255, 255));
        mnArchivo.setText("Archivo");
        mnArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        itmArchivoSalir.setBackground(new java.awt.Color(48, 48, 48));
        itmArchivoSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmArchivoSalir.setForeground(new java.awt.Color(255, 255, 255));
        itmArchivoSalir.setText("Salir");
        itmArchivoSalir.setBorder(null);
        itmArchivoSalir.setBorderPainted(false);
        itmArchivoSalir.setContentAreaFilled(false);
        itmArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmArchivoSalirActionPerformed(evt);
            }
        });
        mnArchivo.add(itmArchivoSalir);

        brBarraMenú.add(mnArchivo);

        mnFlujo.setBackground(new java.awt.Color(48, 48, 48));
        mnFlujo.setBorder(null);
        mnFlujo.setForeground(new java.awt.Color(255, 255, 255));
        mnFlujo.setText("Control de Flujo");
        mnFlujo.setBorderPainted(false);
        mnFlujo.setContentAreaFilled(false);
        mnFlujo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnFlujoE1.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE1.setBorder(null);
        mnFlujoE1.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE1.setText("Evidencia I");
        mnFlujoE1.setBorderPainted(false);
        mnFlujoE1.setContentAreaFilled(false);
        mnFlujoE1.setFocusable(false);
        mnFlujoE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE1.setOpaque(false);

        itmFlujoFormE1.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoFormE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoFormE1.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoFormE1.setText("Calcular Y");
        itmFlujoFormE1.setBorder(null);
        itmFlujoFormE1.setBorderPainted(false);
        itmFlujoFormE1.setContentAreaFilled(false);
        itmFlujoFormE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoFormE1ActionPerformed(evt);
            }
        });
        mnFlujoE1.add(itmFlujoFormE1);

        itmFlujoModeloE1.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoModeloE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoModeloE1.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoModeloE1.setText("Modelado");
        itmFlujoModeloE1.setBorder(null);
        itmFlujoModeloE1.setBorderPainted(false);
        itmFlujoModeloE1.setContentAreaFilled(false);
        itmFlujoModeloE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoModeloE1ActionPerformed(evt);
            }
        });
        mnFlujoE1.add(itmFlujoModeloE1);

        itmFlujoAyudaE1.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoAyudaE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoAyudaE1.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoAyudaE1.setText("Ayuda");
        itmFlujoAyudaE1.setBorder(null);
        itmFlujoAyudaE1.setBorderPainted(false);
        itmFlujoAyudaE1.setContentAreaFilled(false);
        itmFlujoAyudaE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoAyudaE1ActionPerformed(evt);
            }
        });
        mnFlujoE1.add(itmFlujoAyudaE1);

        mnFlujo.add(mnFlujoE1);

        mnFlujoE2.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE2.setBorder(null);
        mnFlujoE2.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE2.setText("Evidencia II");
        mnFlujoE2.setBorderPainted(false);
        mnFlujoE2.setContentAreaFilled(false);
        mnFlujoE2.setFocusable(false);
        mnFlujoE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE2.setOpaque(false);

        itmFlujoFormE2.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoFormE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoFormE2.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoFormE2.setText("Calcular Z");
        itmFlujoFormE2.setBorder(null);
        itmFlujoFormE2.setBorderPainted(false);
        itmFlujoFormE2.setContentAreaFilled(false);
        itmFlujoFormE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoFormE2ActionPerformed(evt);
            }
        });
        mnFlujoE2.add(itmFlujoFormE2);

        itmFlujoModeloE2.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoModeloE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoModeloE2.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoModeloE2.setText("Modelado");
        itmFlujoModeloE2.setBorder(null);
        itmFlujoModeloE2.setBorderPainted(false);
        itmFlujoModeloE2.setContentAreaFilled(false);
        itmFlujoModeloE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoModeloE2ActionPerformed(evt);
            }
        });
        mnFlujoE2.add(itmFlujoModeloE2);

        itmFlujoAyudaE2.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoAyudaE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoAyudaE2.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoAyudaE2.setText("Ayuda");
        itmFlujoAyudaE2.setBorder(null);
        itmFlujoAyudaE2.setBorderPainted(false);
        itmFlujoAyudaE2.setContentAreaFilled(false);
        itmFlujoAyudaE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoAyudaE2ActionPerformed(evt);
            }
        });
        mnFlujoE2.add(itmFlujoAyudaE2);

        mnFlujo.add(mnFlujoE2);

        mnFlujoE3.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE3.setBorder(null);
        mnFlujoE3.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE3.setText("Evidencia III");
        mnFlujoE3.setBorderPainted(false);
        mnFlujoE3.setContentAreaFilled(false);
        mnFlujoE3.setFocusable(false);
        mnFlujoE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE3.setOpaque(false);

        itmFlujoFormE3.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoFormE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoFormE3.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoFormE3.setText("Ordenar ABC");
        itmFlujoFormE3.setBorder(null);
        itmFlujoFormE3.setBorderPainted(false);
        itmFlujoFormE3.setContentAreaFilled(false);
        itmFlujoFormE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoFormE3ActionPerformed(evt);
            }
        });
        mnFlujoE3.add(itmFlujoFormE3);

        itmFlujoModeloE3.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoModeloE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoModeloE3.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoModeloE3.setText("Modelado");
        itmFlujoModeloE3.setBorder(null);
        itmFlujoModeloE3.setBorderPainted(false);
        itmFlujoModeloE3.setContentAreaFilled(false);
        itmFlujoModeloE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoModeloE3ActionPerformed(evt);
            }
        });
        mnFlujoE3.add(itmFlujoModeloE3);

        itmFlujoAyudaE3.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoAyudaE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoAyudaE3.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoAyudaE3.setText("Ayuda");
        itmFlujoAyudaE3.setBorder(null);
        itmFlujoAyudaE3.setBorderPainted(false);
        itmFlujoAyudaE3.setContentAreaFilled(false);
        itmFlujoAyudaE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoAyudaE3ActionPerformed(evt);
            }
        });
        mnFlujoE3.add(itmFlujoAyudaE3);

        mnFlujo.add(mnFlujoE3);

        mnFlujoE4.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE4.setBorder(null);
        mnFlujoE4.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE4.setText("Evidencia IV");
        mnFlujoE4.setBorderPainted(false);
        mnFlujoE4.setContentAreaFilled(false);
        mnFlujoE4.setFocusable(false);
        mnFlujoE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE4.setOpaque(false);

        itmFlujoFormE4.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoFormE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoFormE4.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoFormE4.setText("Calc. Impuestos");
        itmFlujoFormE4.setBorder(null);
        itmFlujoFormE4.setBorderPainted(false);
        itmFlujoFormE4.setContentAreaFilled(false);
        itmFlujoFormE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoFormE4ActionPerformed(evt);
            }
        });
        mnFlujoE4.add(itmFlujoFormE4);

        itmFlujoModeloE4.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoModeloE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoModeloE4.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoModeloE4.setText("Modelado");
        itmFlujoModeloE4.setBorder(null);
        itmFlujoModeloE4.setBorderPainted(false);
        itmFlujoModeloE4.setContentAreaFilled(false);
        itmFlujoModeloE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoModeloE4ActionPerformed(evt);
            }
        });
        mnFlujoE4.add(itmFlujoModeloE4);

        itmFlujoAyudaE4.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoAyudaE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoAyudaE4.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoAyudaE4.setText("Ayuda");
        itmFlujoAyudaE4.setBorder(null);
        itmFlujoAyudaE4.setBorderPainted(false);
        itmFlujoAyudaE4.setContentAreaFilled(false);
        itmFlujoAyudaE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoAyudaE4ActionPerformed(evt);
            }
        });
        mnFlujoE4.add(itmFlujoAyudaE4);

        mnFlujo.add(mnFlujoE4);

        mnFlujoE5.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE5.setBorder(null);
        mnFlujoE5.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE5.setText("Evidencia V");
        mnFlujoE5.setBorderPainted(false);
        mnFlujoE5.setContentAreaFilled(false);
        mnFlujoE5.setFocusable(false);
        mnFlujoE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE5.setOpaque(false);

        itmFlujoFormE5.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoFormE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoFormE5.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoFormE5.setText("Evaluar Lista");
        itmFlujoFormE5.setBorder(null);
        itmFlujoFormE5.setBorderPainted(false);
        itmFlujoFormE5.setContentAreaFilled(false);
        itmFlujoFormE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoFormE5ActionPerformed(evt);
            }
        });
        mnFlujoE5.add(itmFlujoFormE5);

        itmFlujoModeloE5.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoModeloE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoModeloE5.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoModeloE5.setText("Modelado");
        itmFlujoModeloE5.setBorder(null);
        itmFlujoModeloE5.setBorderPainted(false);
        itmFlujoModeloE5.setContentAreaFilled(false);
        itmFlujoModeloE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoModeloE5ActionPerformed(evt);
            }
        });
        mnFlujoE5.add(itmFlujoModeloE5);

        itmFlujoAyudaE5.setBackground(new java.awt.Color(54, 54, 54));
        itmFlujoAyudaE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmFlujoAyudaE5.setForeground(new java.awt.Color(255, 255, 255));
        itmFlujoAyudaE5.setText("Ayuda");
        itmFlujoAyudaE5.setBorder(null);
        itmFlujoAyudaE5.setBorderPainted(false);
        itmFlujoAyudaE5.setContentAreaFilled(false);
        itmFlujoAyudaE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFlujoAyudaE5ActionPerformed(evt);
            }
        });
        mnFlujoE5.add(itmFlujoAyudaE5);

        mnFlujo.add(mnFlujoE5);

        brBarraMenú.add(mnFlujo);

        mnVectores.setBackground(new java.awt.Color(48, 48, 48));
        mnVectores.setBorder(null);
        mnVectores.setForeground(new java.awt.Color(255, 255, 255));
        mnVectores.setText("Vectores");
        mnVectores.setBorderPainted(false);
        mnVectores.setContentAreaFilled(false);
        mnVectores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnVecE1.setBackground(new java.awt.Color(225, 225, 225));
        mnVecE1.setBorder(null);
        mnVecE1.setForeground(new java.awt.Color(0, 0, 0));
        mnVecE1.setText("Evidencia I");
        mnVecE1.setBorderPainted(false);
        mnVecE1.setContentAreaFilled(false);
        mnVecE1.setFocusable(false);
        mnVecE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnVecE1.setOpaque(false);

        itmVecFormE1.setBackground(new java.awt.Color(54, 54, 54));
        itmVecFormE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecFormE1.setForeground(new java.awt.Color(255, 255, 255));
        itmVecFormE1.setText("Escalar Arreglo");
        itmVecFormE1.setBorder(null);
        itmVecFormE1.setBorderPainted(false);
        itmVecFormE1.setContentAreaFilled(false);
        itmVecFormE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecFormE1ActionPerformed(evt);
            }
        });
        mnVecE1.add(itmVecFormE1);

        itmVecModeloE1.setBackground(new java.awt.Color(54, 54, 54));
        itmVecModeloE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecModeloE1.setForeground(new java.awt.Color(255, 255, 255));
        itmVecModeloE1.setText("Modelado");
        itmVecModeloE1.setBorder(null);
        itmVecModeloE1.setBorderPainted(false);
        itmVecModeloE1.setContentAreaFilled(false);
        itmVecModeloE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecModeloE1ActionPerformed(evt);
            }
        });
        mnVecE1.add(itmVecModeloE1);

        itmVecAyudaE1.setBackground(new java.awt.Color(54, 54, 54));
        itmVecAyudaE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecAyudaE1.setForeground(new java.awt.Color(255, 255, 255));
        itmVecAyudaE1.setText("Ayuda");
        itmVecAyudaE1.setBorder(null);
        itmVecAyudaE1.setBorderPainted(false);
        itmVecAyudaE1.setContentAreaFilled(false);
        itmVecAyudaE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecAyudaE1ActionPerformed(evt);
            }
        });
        mnVecE1.add(itmVecAyudaE1);

        mnVectores.add(mnVecE1);

        mnVecE2.setBackground(new java.awt.Color(225, 225, 225));
        mnVecE2.setBorder(null);
        mnVecE2.setForeground(new java.awt.Color(0, 0, 0));
        mnVecE2.setText("Evidencia II");
        mnVecE2.setBorderPainted(false);
        mnVecE2.setContentAreaFilled(false);
        mnVecE2.setFocusable(false);
        mnVecE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnVecE2.setOpaque(false);

        itmVecFormE2.setBackground(new java.awt.Color(54, 54, 54));
        itmVecFormE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecFormE2.setForeground(new java.awt.Color(255, 255, 255));
        itmVecFormE2.setText("Rep. May. Men.");
        itmVecFormE2.setBorder(null);
        itmVecFormE2.setBorderPainted(false);
        itmVecFormE2.setContentAreaFilled(false);
        itmVecFormE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecFormE2ActionPerformed(evt);
            }
        });
        mnVecE2.add(itmVecFormE2);

        itmVecModeloE2.setBackground(new java.awt.Color(54, 54, 54));
        itmVecModeloE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecModeloE2.setForeground(new java.awt.Color(255, 255, 255));
        itmVecModeloE2.setText("Modelado");
        itmVecModeloE2.setBorder(null);
        itmVecModeloE2.setBorderPainted(false);
        itmVecModeloE2.setContentAreaFilled(false);
        itmVecModeloE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecModeloE2ActionPerformed(evt);
            }
        });
        mnVecE2.add(itmVecModeloE2);

        itmVecAyudaE2.setBackground(new java.awt.Color(54, 54, 54));
        itmVecAyudaE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecAyudaE2.setForeground(new java.awt.Color(255, 255, 255));
        itmVecAyudaE2.setText("Ayuda");
        itmVecAyudaE2.setBorder(null);
        itmVecAyudaE2.setBorderPainted(false);
        itmVecAyudaE2.setContentAreaFilled(false);
        itmVecAyudaE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecAyudaE2ActionPerformed(evt);
            }
        });
        mnVecE2.add(itmVecAyudaE2);

        mnVectores.add(mnVecE2);

        mnVecE3.setBackground(new java.awt.Color(225, 225, 225));
        mnVecE3.setBorder(null);
        mnVecE3.setForeground(new java.awt.Color(0, 0, 0));
        mnVecE3.setText("Evidencia III");
        mnVecE3.setBorderPainted(false);
        mnVecE3.setContentAreaFilled(false);
        mnVecE3.setFocusable(false);
        mnVecE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnVecE3.setOpaque(false);

        itmVecFormE3.setBackground(new java.awt.Color(54, 54, 54));
        itmVecFormE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecFormE3.setForeground(new java.awt.Color(255, 255, 255));
        itmVecFormE3.setText("Interc. May. Men.");
        itmVecFormE3.setBorder(null);
        itmVecFormE3.setBorderPainted(false);
        itmVecFormE3.setContentAreaFilled(false);
        itmVecFormE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecFormE3ActionPerformed(evt);
            }
        });
        mnVecE3.add(itmVecFormE3);

        itmVecModeloE3.setBackground(new java.awt.Color(54, 54, 54));
        itmVecModeloE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecModeloE3.setForeground(new java.awt.Color(255, 255, 255));
        itmVecModeloE3.setText("Modelado");
        itmVecModeloE3.setBorder(null);
        itmVecModeloE3.setBorderPainted(false);
        itmVecModeloE3.setContentAreaFilled(false);
        itmVecModeloE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecModeloE3ActionPerformed(evt);
            }
        });
        mnVecE3.add(itmVecModeloE3);

        itmVecAyudaE3.setBackground(new java.awt.Color(54, 54, 54));
        itmVecAyudaE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecAyudaE3.setForeground(new java.awt.Color(255, 255, 255));
        itmVecAyudaE3.setText("Ayuda");
        itmVecAyudaE3.setBorder(null);
        itmVecAyudaE3.setBorderPainted(false);
        itmVecAyudaE3.setContentAreaFilled(false);
        itmVecAyudaE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecAyudaE3ActionPerformed(evt);
            }
        });
        mnVecE3.add(itmVecAyudaE3);

        mnVectores.add(mnVecE3);

        mnVecE4.setBackground(new java.awt.Color(225, 225, 225));
        mnVecE4.setBorder(null);
        mnVecE4.setForeground(new java.awt.Color(0, 0, 0));
        mnVecE4.setText("Evidencia IV");
        mnVecE4.setBorderPainted(false);
        mnVecE4.setContentAreaFilled(false);
        mnVecE4.setFocusable(false);
        mnVecE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnVecE4.setOpaque(false);

        itmVecFormE4.setBackground(new java.awt.Color(54, 54, 54));
        itmVecFormE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecFormE4.setForeground(new java.awt.Color(255, 255, 255));
        itmVecFormE4.setText("Ordenar Arreglo");
        itmVecFormE4.setBorder(null);
        itmVecFormE4.setBorderPainted(false);
        itmVecFormE4.setContentAreaFilled(false);
        itmVecFormE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecFormE4ActionPerformed(evt);
            }
        });
        mnVecE4.add(itmVecFormE4);

        itmVecModeloE4.setBackground(new java.awt.Color(54, 54, 54));
        itmVecModeloE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecModeloE4.setForeground(new java.awt.Color(255, 255, 255));
        itmVecModeloE4.setText("Modelado");
        itmVecModeloE4.setBorder(null);
        itmVecModeloE4.setBorderPainted(false);
        itmVecModeloE4.setContentAreaFilled(false);
        itmVecModeloE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecModeloE4ActionPerformed(evt);
            }
        });
        mnVecE4.add(itmVecModeloE4);

        itmVecAyudaE4.setBackground(new java.awt.Color(54, 54, 54));
        itmVecAyudaE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecAyudaE4.setForeground(new java.awt.Color(255, 255, 255));
        itmVecAyudaE4.setText("Ayuda");
        itmVecAyudaE4.setBorder(null);
        itmVecAyudaE4.setBorderPainted(false);
        itmVecAyudaE4.setContentAreaFilled(false);
        itmVecAyudaE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecAyudaE4ActionPerformed(evt);
            }
        });
        mnVecE4.add(itmVecAyudaE4);

        mnVectores.add(mnVecE4);

        mnVecE5.setBackground(new java.awt.Color(225, 225, 225));
        mnVecE5.setBorder(null);
        mnVecE5.setForeground(new java.awt.Color(0, 0, 0));
        mnVecE5.setText("Evidencia V");
        mnVecE5.setBorderPainted(false);
        mnVecE5.setContentAreaFilled(false);
        mnVecE5.setFocusable(false);
        mnVecE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnVecE5.setOpaque(false);

        itmVecFormE5.setBackground(new java.awt.Color(54, 54, 54));
        itmVecFormE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecFormE5.setForeground(new java.awt.Color(255, 255, 255));
        itmVecFormE5.setText("Prom. Temp.");
        itmVecFormE5.setBorder(null);
        itmVecFormE5.setBorderPainted(false);
        itmVecFormE5.setContentAreaFilled(false);
        itmVecFormE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecFormE5ActionPerformed(evt);
            }
        });
        mnVecE5.add(itmVecFormE5);

        itmVecModeloE5.setBackground(new java.awt.Color(54, 54, 54));
        itmVecModeloE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecModeloE5.setForeground(new java.awt.Color(255, 255, 255));
        itmVecModeloE5.setText("Modelado");
        itmVecModeloE5.setBorder(null);
        itmVecModeloE5.setBorderPainted(false);
        itmVecModeloE5.setContentAreaFilled(false);
        itmVecModeloE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecModeloE5ActionPerformed(evt);
            }
        });
        mnVecE5.add(itmVecModeloE5);

        itmVecAyudaE5.setBackground(new java.awt.Color(54, 54, 54));
        itmVecAyudaE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmVecAyudaE5.setForeground(new java.awt.Color(255, 255, 255));
        itmVecAyudaE5.setText("Ayuda");
        itmVecAyudaE5.setBorder(null);
        itmVecAyudaE5.setBorderPainted(false);
        itmVecAyudaE5.setContentAreaFilled(false);
        itmVecAyudaE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVecAyudaE5ActionPerformed(evt);
            }
        });
        mnVecE5.add(itmVecAyudaE5);

        mnVectores.add(mnVecE5);

        brBarraMenú.add(mnVectores);

        mnMatrices.setBackground(new java.awt.Color(48, 48, 48));
        mnMatrices.setBorder(null);
        mnMatrices.setForeground(new java.awt.Color(255, 255, 255));
        mnMatrices.setText("Matrices");
        mnMatrices.setBorderPainted(false);
        mnMatrices.setContentAreaFilled(false);
        mnMatrices.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnFlujoE11.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE11.setBorder(null);
        mnFlujoE11.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE11.setText("Evidencia I");
        mnFlujoE11.setBorderPainted(false);
        mnFlujoE11.setContentAreaFilled(false);
        mnFlujoE11.setFocusable(false);
        mnFlujoE11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE11.setOpaque(false);

        itmMatFormE1.setBackground(new java.awt.Color(54, 54, 54));
        itmMatFormE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatFormE1.setForeground(new java.awt.Color(255, 255, 255));
        itmMatFormE1.setText("Escalar Matriz");
        itmMatFormE1.setBorder(null);
        itmMatFormE1.setBorderPainted(false);
        itmMatFormE1.setContentAreaFilled(false);
        itmMatFormE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatFormE1ActionPerformed(evt);
            }
        });
        mnFlujoE11.add(itmMatFormE1);

        itmMatModeloE1.setBackground(new java.awt.Color(54, 54, 54));
        itmMatModeloE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatModeloE1.setForeground(new java.awt.Color(255, 255, 255));
        itmMatModeloE1.setText("Modelado");
        itmMatModeloE1.setBorder(null);
        itmMatModeloE1.setBorderPainted(false);
        itmMatModeloE1.setContentAreaFilled(false);
        itmMatModeloE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatModeloE1ActionPerformed(evt);
            }
        });
        mnFlujoE11.add(itmMatModeloE1);

        itmMatAyudaE1.setBackground(new java.awt.Color(54, 54, 54));
        itmMatAyudaE1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatAyudaE1.setForeground(new java.awt.Color(255, 255, 255));
        itmMatAyudaE1.setText("Ayuda");
        itmMatAyudaE1.setBorder(null);
        itmMatAyudaE1.setBorderPainted(false);
        itmMatAyudaE1.setContentAreaFilled(false);
        itmMatAyudaE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatAyudaE1ActionPerformed(evt);
            }
        });
        mnFlujoE11.add(itmMatAyudaE1);

        mnMatrices.add(mnFlujoE11);

        mnFlujoE12.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE12.setBorder(null);
        mnFlujoE12.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE12.setText("Evidencia II");
        mnFlujoE12.setBorderPainted(false);
        mnFlujoE12.setContentAreaFilled(false);
        mnFlujoE12.setFocusable(false);
        mnFlujoE12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE12.setOpaque(false);

        itmMatFormE2.setBackground(new java.awt.Color(54, 54, 54));
        itmMatFormE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatFormE2.setForeground(new java.awt.Color(255, 255, 255));
        itmMatFormE2.setText("Mayor Diagonal");
        itmMatFormE2.setBorder(null);
        itmMatFormE2.setBorderPainted(false);
        itmMatFormE2.setContentAreaFilled(false);
        itmMatFormE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatFormE2ActionPerformed(evt);
            }
        });
        mnFlujoE12.add(itmMatFormE2);

        itmMatModeloE2.setBackground(new java.awt.Color(54, 54, 54));
        itmMatModeloE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatModeloE2.setForeground(new java.awt.Color(255, 255, 255));
        itmMatModeloE2.setText("Modelado");
        itmMatModeloE2.setBorder(null);
        itmMatModeloE2.setBorderPainted(false);
        itmMatModeloE2.setContentAreaFilled(false);
        itmMatModeloE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatModeloE2ActionPerformed(evt);
            }
        });
        mnFlujoE12.add(itmMatModeloE2);

        itmMatAyudaE2.setBackground(new java.awt.Color(54, 54, 54));
        itmMatAyudaE2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatAyudaE2.setForeground(new java.awt.Color(255, 255, 255));
        itmMatAyudaE2.setText("Ayuda");
        itmMatAyudaE2.setBorder(null);
        itmMatAyudaE2.setBorderPainted(false);
        itmMatAyudaE2.setContentAreaFilled(false);
        itmMatAyudaE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatAyudaE2ActionPerformed(evt);
            }
        });
        mnFlujoE12.add(itmMatAyudaE2);

        mnMatrices.add(mnFlujoE12);

        mnFlujoE13.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE13.setBorder(null);
        mnFlujoE13.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE13.setText("Evidencia III");
        mnFlujoE13.setBorderPainted(false);
        mnFlujoE13.setContentAreaFilled(false);
        mnFlujoE13.setFocusable(false);
        mnFlujoE13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE13.setOpaque(false);

        itmMatFormE3.setBackground(new java.awt.Color(54, 54, 54));
        itmMatFormE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatFormE3.setForeground(new java.awt.Color(255, 255, 255));
        itmMatFormE3.setText("Intercambiar Col.");
        itmMatFormE3.setBorder(null);
        itmMatFormE3.setBorderPainted(false);
        itmMatFormE3.setContentAreaFilled(false);
        itmMatFormE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatFormE3ActionPerformed(evt);
            }
        });
        mnFlujoE13.add(itmMatFormE3);

        itmMatModeloE3.setBackground(new java.awt.Color(54, 54, 54));
        itmMatModeloE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatModeloE3.setForeground(new java.awt.Color(255, 255, 255));
        itmMatModeloE3.setText("Modelado");
        itmMatModeloE3.setBorder(null);
        itmMatModeloE3.setBorderPainted(false);
        itmMatModeloE3.setContentAreaFilled(false);
        itmMatModeloE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatModeloE3ActionPerformed(evt);
            }
        });
        mnFlujoE13.add(itmMatModeloE3);

        itmMatAyudaE3.setBackground(new java.awt.Color(54, 54, 54));
        itmMatAyudaE3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatAyudaE3.setForeground(new java.awt.Color(255, 255, 255));
        itmMatAyudaE3.setText("Ayuda");
        itmMatAyudaE3.setBorder(null);
        itmMatAyudaE3.setBorderPainted(false);
        itmMatAyudaE3.setContentAreaFilled(false);
        itmMatAyudaE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatAyudaE3ActionPerformed(evt);
            }
        });
        mnFlujoE13.add(itmMatAyudaE3);

        mnMatrices.add(mnFlujoE13);

        mnFlujoE14.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE14.setBorder(null);
        mnFlujoE14.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE14.setText("Evidencia IV");
        mnFlujoE14.setBorderPainted(false);
        mnFlujoE14.setContentAreaFilled(false);
        mnFlujoE14.setFocusable(false);
        mnFlujoE14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE14.setOpaque(false);

        itmMatFormE4.setBackground(new java.awt.Color(54, 54, 54));
        itmMatFormE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatFormE4.setForeground(new java.awt.Color(255, 255, 255));
        itmMatFormE4.setText("Sumar Colum.");
        itmMatFormE4.setBorder(null);
        itmMatFormE4.setBorderPainted(false);
        itmMatFormE4.setContentAreaFilled(false);
        itmMatFormE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatFormE4ActionPerformed(evt);
            }
        });
        mnFlujoE14.add(itmMatFormE4);

        itmMatModeloE4.setBackground(new java.awt.Color(54, 54, 54));
        itmMatModeloE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatModeloE4.setForeground(new java.awt.Color(255, 255, 255));
        itmMatModeloE4.setText("Modelado");
        itmMatModeloE4.setBorder(null);
        itmMatModeloE4.setBorderPainted(false);
        itmMatModeloE4.setContentAreaFilled(false);
        itmMatModeloE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatModeloE4ActionPerformed(evt);
            }
        });
        mnFlujoE14.add(itmMatModeloE4);

        itmMatAyudaE4.setBackground(new java.awt.Color(54, 54, 54));
        itmMatAyudaE4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatAyudaE4.setForeground(new java.awt.Color(255, 255, 255));
        itmMatAyudaE4.setText("Ayuda");
        itmMatAyudaE4.setBorder(null);
        itmMatAyudaE4.setBorderPainted(false);
        itmMatAyudaE4.setContentAreaFilled(false);
        itmMatAyudaE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatAyudaE4ActionPerformed(evt);
            }
        });
        mnFlujoE14.add(itmMatAyudaE4);

        mnMatrices.add(mnFlujoE14);

        mnFlujoE15.setBackground(new java.awt.Color(225, 225, 225));
        mnFlujoE15.setBorder(null);
        mnFlujoE15.setForeground(new java.awt.Color(0, 0, 0));
        mnFlujoE15.setText("Evidencia V");
        mnFlujoE15.setBorderPainted(false);
        mnFlujoE15.setContentAreaFilled(false);
        mnFlujoE15.setFocusable(false);
        mnFlujoE15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnFlujoE15.setOpaque(false);

        itmMatFormE5.setBackground(new java.awt.Color(54, 54, 54));
        itmMatFormE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatFormE5.setForeground(new java.awt.Color(255, 255, 255));
        itmMatFormE5.setText("May. Sum. Res. DP.");
        itmMatFormE5.setBorder(null);
        itmMatFormE5.setBorderPainted(false);
        itmMatFormE5.setContentAreaFilled(false);
        itmMatFormE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatFormE5ActionPerformed(evt);
            }
        });
        mnFlujoE15.add(itmMatFormE5);

        itmMatModeloE5.setBackground(new java.awt.Color(54, 54, 54));
        itmMatModeloE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatModeloE5.setForeground(new java.awt.Color(255, 255, 255));
        itmMatModeloE5.setText("Modelado");
        itmMatModeloE5.setBorder(null);
        itmMatModeloE5.setBorderPainted(false);
        itmMatModeloE5.setContentAreaFilled(false);
        itmMatModeloE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatModeloE5ActionPerformed(evt);
            }
        });
        mnFlujoE15.add(itmMatModeloE5);

        itmMatAyudaE5.setBackground(new java.awt.Color(54, 54, 54));
        itmMatAyudaE5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmMatAyudaE5.setForeground(new java.awt.Color(255, 255, 255));
        itmMatAyudaE5.setText("Ayuda");
        itmMatAyudaE5.setBorder(null);
        itmMatAyudaE5.setBorderPainted(false);
        itmMatAyudaE5.setContentAreaFilled(false);
        itmMatAyudaE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMatAyudaE5ActionPerformed(evt);
            }
        });
        mnFlujoE15.add(itmMatAyudaE5);

        mnMatrices.add(mnFlujoE15);

        brBarraMenú.add(mnMatrices);

        mnAyuda.setBackground(new java.awt.Color(48, 48, 48));
        mnAyuda.setBorder(null);
        mnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        mnAyuda.setText("Ayuda");
        mnAyuda.setBorderPainted(false);
        mnAyuda.setContentAreaFilled(false);
        mnAyuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        itmAcerca.setBackground(new java.awt.Color(54, 54, 54));
        itmAcerca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itmAcerca.setForeground(new java.awt.Color(255, 255, 255));
        itmAcerca.setText("Acerca de");
        itmAcerca.setBorder(null);
        itmAcerca.setBorderPainted(false);
        itmAcerca.setContentAreaFilled(false);
        itmAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAcercaActionPerformed(evt);
            }
        });
        mnAyuda.add(itmAcerca);

        brBarraMenú.add(mnAyuda);

        setJMenuBar(brBarraMenú);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void itmFlujoFormE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoFormE1ActionPerformed
        objFlujoFormE1 = new CDF_E1_IFRM();
        MostrarVentana(dpPantalla, objFlujoFormE1, itmFlujoFormE1, 
                objFlujoFormE1.nombreProblema);
    }//GEN-LAST:event_itmFlujoFormE1ActionPerformed

    private void itmFlujoModeloE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoModeloE1ActionPerformed
        objFlujoModeloE1 = new CDF_E1_Modelado();
        MostrarVentana(dpPantalla, objFlujoModeloE1, itmFlujoModeloE1, 
                objFlujoModeloE1.nombreProblema);
    }//GEN-LAST:event_itmFlujoModeloE1ActionPerformed

    private void itmFlujoAyudaE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoAyudaE1ActionPerformed
        objFlujoAyudaE1 = new CDF_E1_Ayuda();
        MostrarVentana(dpPantalla, objFlujoAyudaE1, itmFlujoAyudaE1, 
                objFlujoAyudaE1.nombreProblema);
    }//GEN-LAST:event_itmFlujoAyudaE1ActionPerformed

    private void itmFlujoFormE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoFormE2ActionPerformed
        objFlujoFormE2 = new CDF_E2_IFRM();
        MostrarVentana(dpPantalla, objFlujoFormE2, itmFlujoFormE2, 
                objFlujoFormE2.nombreProblema);
    }//GEN-LAST:event_itmFlujoFormE2ActionPerformed

    private void itmFlujoModeloE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoModeloE2ActionPerformed
        objFlujoModeloE2 = new CDF_E2_Modelado();
        MostrarVentana(dpPantalla, objFlujoModeloE2, itmFlujoModeloE2, 
                objFlujoModeloE2.nombreProblema);
    }//GEN-LAST:event_itmFlujoModeloE2ActionPerformed

    private void itmFlujoAyudaE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoAyudaE2ActionPerformed
        objFlujoAyudaE2 = new CDF_E2_Ayuda();
        MostrarVentana(dpPantalla, objFlujoAyudaE2, itmFlujoAyudaE2, 
                objFlujoAyudaE2.nombreProblema);
    }//GEN-LAST:event_itmFlujoAyudaE2ActionPerformed

    private void itmFlujoFormE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoFormE3ActionPerformed
        objFlujoFormE3 = new CDF_E3_IFRM();
        MostrarVentana(dpPantalla, objFlujoFormE3, itmFlujoFormE3, 
                objFlujoFormE3.nombreProblema);
    }//GEN-LAST:event_itmFlujoFormE3ActionPerformed

    private void itmFlujoModeloE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoModeloE3ActionPerformed
        objFlujoModeloE3 = new CDF_E3_Modelado();
        MostrarVentana(dpPantalla, objFlujoModeloE3, itmFlujoModeloE3, 
                objFlujoModeloE3.nombreProblema);
    }//GEN-LAST:event_itmFlujoModeloE3ActionPerformed

    private void itmFlujoAyudaE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoAyudaE3ActionPerformed
        objFlujoAyudaE3 = new CDF_E3_Ayuda();
        MostrarVentana(dpPantalla, objFlujoAyudaE3, itmFlujoAyudaE3, 
                objFlujoAyudaE3.nombreProblema);
    }//GEN-LAST:event_itmFlujoAyudaE3ActionPerformed

    private void itmFlujoFormE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoFormE4ActionPerformed
        objFlujoFormE4 = new CDF_E4_IFRM();
        MostrarVentana(dpPantalla, objFlujoFormE4, itmFlujoFormE4, 
                objFlujoFormE4.nombreProblema);
    }//GEN-LAST:event_itmFlujoFormE4ActionPerformed

    private void itmFlujoModeloE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoModeloE4ActionPerformed
        objFlujoModeloE4 = new CDF_E4_Modelado();
        MostrarVentana(dpPantalla, objFlujoModeloE4, itmFlujoModeloE4, 
                objFlujoModeloE4.nombreProblema);
    }//GEN-LAST:event_itmFlujoModeloE4ActionPerformed

    private void itmFlujoAyudaE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoAyudaE4ActionPerformed
        objFlujoAyudaE4 = new CDF_E4_Ayuda();
        MostrarVentana(dpPantalla, objFlujoAyudaE4, itmFlujoAyudaE4, 
                objFlujoAyudaE4.nombreProblema);
    }//GEN-LAST:event_itmFlujoAyudaE4ActionPerformed

    private void itmFlujoFormE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoFormE5ActionPerformed
        objFlujoFormE5 = new CDF_E5_IFRM();
        MostrarVentana(dpPantalla, objFlujoFormE5, itmFlujoFormE5, 
                objFlujoFormE5.nombreProblema);
    }//GEN-LAST:event_itmFlujoFormE5ActionPerformed

    private void itmFlujoModeloE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoModeloE5ActionPerformed
        objFlujoModeloE5 = new CDF_E5_Modelado();
        MostrarVentana(dpPantalla, objFlujoModeloE5, itmFlujoModeloE5, 
                objFlujoModeloE5.nombreProblema);
    }//GEN-LAST:event_itmFlujoModeloE5ActionPerformed

    private void itmFlujoAyudaE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFlujoAyudaE5ActionPerformed
        objFlujoAyudaE5 = new CDF_E5_Ayuda();
        MostrarVentana(dpPantalla, objFlujoAyudaE5, itmFlujoAyudaE5, 
                objFlujoAyudaE5.nombreProblema);
    }//GEN-LAST:event_itmFlujoAyudaE5ActionPerformed

    private void itmVecFormE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecFormE1ActionPerformed
        objVecFormE1 = new Vec_E1_IFRM();
        MostrarVentana(dpPantalla, objVecFormE1, itmVecFormE1, 
                objVecFormE1.nombreProblema);
    }//GEN-LAST:event_itmVecFormE1ActionPerformed

    private void itmVecModeloE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecModeloE1ActionPerformed
        objVecModeloE1 = new Vec_E1_Modelado();
        MostrarVentana(dpPantalla, objVecModeloE1, itmVecModeloE1, 
                objVecModeloE1.nombreProblema);
    }//GEN-LAST:event_itmVecModeloE1ActionPerformed

    private void itmVecAyudaE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecAyudaE1ActionPerformed
        objVecAyudaE1 = new Vec_E1_Ayuda();
        MostrarVentana(dpPantalla, objVecAyudaE1, itmVecAyudaE1, 
                objVecAyudaE1.nombreProblema);
    }//GEN-LAST:event_itmVecAyudaE1ActionPerformed

    private void itmVecFormE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecFormE2ActionPerformed
        objVecFormE2 = new Vec_E2_IFRM();
        MostrarVentana(dpPantalla, objVecFormE2, itmVecFormE2, 
                objVecFormE2.nombreProblema);
    }//GEN-LAST:event_itmVecFormE2ActionPerformed

    private void itmVecModeloE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecModeloE2ActionPerformed
        objVecModeloE2 = new Vec_E2_Modelado();
        MostrarVentana(dpPantalla, objVecModeloE2, itmVecModeloE2, 
                objVecModeloE2.nombreProblema);
    }//GEN-LAST:event_itmVecModeloE2ActionPerformed

    private void itmVecAyudaE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecAyudaE2ActionPerformed
        objVecAyudaE2 = new Vec_E2_Ayuda();
        MostrarVentana(dpPantalla, objVecAyudaE2, itmVecAyudaE2, 
                objVecAyudaE2.nombreProblema);
    }//GEN-LAST:event_itmVecAyudaE2ActionPerformed

    private void itmVecFormE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecFormE3ActionPerformed
        objVecFormE3 = new Vec_E3_IFRM();
        MostrarVentana(dpPantalla, objVecFormE3, itmVecFormE3, 
                objVecFormE3.nombreProblema);
    }//GEN-LAST:event_itmVecFormE3ActionPerformed

    private void itmVecModeloE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecModeloE3ActionPerformed
        objVecModeloE3 = new Vec_E3_Modelado();
        MostrarVentana(dpPantalla, objVecModeloE3, itmVecModeloE3, 
                objVecModeloE3.nombreProblema);
    }//GEN-LAST:event_itmVecModeloE3ActionPerformed

    private void itmVecAyudaE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecAyudaE3ActionPerformed
        objVecAyudaE3 = new Vec_E3_Ayuda();
        MostrarVentana(dpPantalla, objVecAyudaE3, itmVecAyudaE3, 
                objVecAyudaE3.nombreProblema);
    }//GEN-LAST:event_itmVecAyudaE3ActionPerformed

    private void itmVecFormE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecFormE4ActionPerformed
        objVecFormE4 = new Vec_E4_IFRM();
        MostrarVentana(dpPantalla, objVecFormE4, itmVecFormE4, 
                objVecFormE4.nombreProblema);
    }//GEN-LAST:event_itmVecFormE4ActionPerformed

    private void itmVecModeloE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecModeloE4ActionPerformed
        objVecModeloE4 = new Vec_E4_Modelado();
        MostrarVentana(dpPantalla, objVecModeloE4, itmVecModeloE4, 
                objVecModeloE4.nombreProblema);
    }//GEN-LAST:event_itmVecModeloE4ActionPerformed

    private void itmVecAyudaE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecAyudaE4ActionPerformed
        objVecAyudaE4 = new Vec_E4_Ayuda();
        MostrarVentana(dpPantalla, objVecAyudaE4, itmVecAyudaE4, 
                objVecAyudaE4.nombreProblema);
    }//GEN-LAST:event_itmVecAyudaE4ActionPerformed

    private void itmVecFormE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecFormE5ActionPerformed
        objVecFormE5 = new Vec_E5_IFRM();
        MostrarVentana(dpPantalla, objVecFormE5, itmVecFormE5, 
                objVecFormE5.nombreProblema);
    }//GEN-LAST:event_itmVecFormE5ActionPerformed

    private void itmVecModeloE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecModeloE5ActionPerformed
        objVecModeloE5 = new Vec_E5_Modelado();
        MostrarVentana(dpPantalla, objVecModeloE5, itmVecModeloE5, 
                objVecModeloE5.nombreProblema);
    }//GEN-LAST:event_itmVecModeloE5ActionPerformed

    private void itmVecAyudaE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVecAyudaE5ActionPerformed
        objVecAyudaE5 = new Vec_E5_Ayuda();
        MostrarVentana(dpPantalla, objVecAyudaE5, itmVecAyudaE5, 
                objVecAyudaE5.nombreProblema);
    }//GEN-LAST:event_itmVecAyudaE5ActionPerformed

    private void itmMatFormE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatFormE1ActionPerformed
        objMatFormE1 = new Mat_E1_IFRM();
        MostrarVentana(dpPantalla, objMatFormE1, itmMatFormE1, 
                objMatFormE1.nombreProblema);
    }//GEN-LAST:event_itmMatFormE1ActionPerformed

    private void itmMatModeloE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatModeloE1ActionPerformed
        objMatModeloE1 = new Mat_E1_Modelado();
        MostrarVentana(dpPantalla, objMatModeloE1, itmMatModeloE1, 
                objMatModeloE1.nombreProblema);
    }//GEN-LAST:event_itmMatModeloE1ActionPerformed

    private void itmMatAyudaE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatAyudaE1ActionPerformed
        objMatAyudaE1 = new Mat_E1_Ayuda();
        MostrarVentana(dpPantalla, objMatAyudaE1, itmMatAyudaE1, 
                objMatAyudaE1.nombreProblema);
    }//GEN-LAST:event_itmMatAyudaE1ActionPerformed

    private void itmMatFormE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatFormE2ActionPerformed
        objMatFormE2 = new Mat_E2_IFRM();
        MostrarVentana(dpPantalla, objMatFormE2, itmMatFormE2, 
                objMatFormE2.nombreProblema);
    }//GEN-LAST:event_itmMatFormE2ActionPerformed

    private void itmMatModeloE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatModeloE2ActionPerformed
        objMatModeloE2 = new Mat_E2_Modelado();
        MostrarVentana(dpPantalla, objMatModeloE2, itmMatModeloE2, 
                objMatModeloE2.nombreProblema);
    }//GEN-LAST:event_itmMatModeloE2ActionPerformed

    private void itmMatAyudaE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatAyudaE2ActionPerformed
        objMatAyudaE2 = new Mat_E2_Ayuda();
        MostrarVentana(dpPantalla, objMatAyudaE2, itmMatAyudaE2, 
                objMatAyudaE2.nombreProblema);
    }//GEN-LAST:event_itmMatAyudaE2ActionPerformed

    private void itmMatFormE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatFormE3ActionPerformed
        objMatFormE3 = new Mat_E3_IFRM();
        MostrarVentana(dpPantalla, objMatFormE3, itmMatFormE3, 
                objMatFormE3.nombreProblema);
    }//GEN-LAST:event_itmMatFormE3ActionPerformed

    private void itmMatModeloE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatModeloE3ActionPerformed
        objMatModeloE3 = new Mat_E3_Modelado();
        MostrarVentana(dpPantalla, objMatModeloE3, itmMatModeloE3, 
                objMatModeloE3.nombreProblema);
    }//GEN-LAST:event_itmMatModeloE3ActionPerformed

    private void itmMatAyudaE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatAyudaE3ActionPerformed
        objMatAyudaE3 = new Mat_E3_Ayuda();
        MostrarVentana(dpPantalla, objMatAyudaE3, itmMatAyudaE3, 
                objMatAyudaE3.nombreProblema);
    }//GEN-LAST:event_itmMatAyudaE3ActionPerformed

    private void itmMatFormE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatFormE4ActionPerformed
        objMatFormE4 = new Mat_E4_IFRM();
        MostrarVentana(dpPantalla, objMatFormE4, itmMatFormE4, 
                objMatFormE4.nombreProblema);
    }//GEN-LAST:event_itmMatFormE4ActionPerformed

    private void itmMatModeloE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatModeloE4ActionPerformed
        objMatModeloE4 = new Mat_E4_Modelado();
        MostrarVentana(dpPantalla, objMatModeloE4, itmMatModeloE4, 
                objMatModeloE4.nombreProblema);
    }//GEN-LAST:event_itmMatModeloE4ActionPerformed

    private void itmMatAyudaE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatAyudaE4ActionPerformed
        objMatAyudaE4 = new Mat_E4_Ayuda();
        MostrarVentana(dpPantalla, objMatAyudaE4, itmMatAyudaE4, 
                objMatAyudaE4.nombreProblema);
    }//GEN-LAST:event_itmMatAyudaE4ActionPerformed

    private void itmMatFormE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatFormE5ActionPerformed
        objMatFormE5 = new Mat_E5_IFRM();
        MostrarVentana(dpPantalla, objMatFormE5, itmMatFormE5, 
                objMatFormE5.nombreProblema);
    }//GEN-LAST:event_itmMatFormE5ActionPerformed

    private void itmMatModeloE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatModeloE5ActionPerformed
        objMatModeloE5 = new Mat_E5_Modelado();
        MostrarVentana(dpPantalla, objMatModeloE5, itmMatModeloE5, 
                objMatModeloE5.nombreProblema);
    }//GEN-LAST:event_itmMatModeloE5ActionPerformed

    private void itmMatAyudaE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMatAyudaE5ActionPerformed
        objMatAyudaE5 = new Mat_E5_Ayuda();
        MostrarVentana(dpPantalla, objMatAyudaE5, itmMatAyudaE5, 
                objMatAyudaE5.nombreProblema);
    }//GEN-LAST:event_itmMatAyudaE5ActionPerformed

    private void itmArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmArchivoSalirActionPerformed

    private void itmAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAcercaActionPerformed
        objAyuda = new Ayuda_FRM();
        MostrarVentana(dpPantalla, objAyuda, itmAcerca, objAyuda.nombreProblema);
    }//GEN-LAST:event_itmAcercaActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } 
        catch(Exception e) {
            System.out.println(e);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú_FRM().setVisible(true);
            }
        });
    }
    
    private void MostrarVentana(JDesktopPane dpPantalla, JInternalFrame 
            ifrmVentana, JMenuItem itmMenú, String nombreProblema)
    {
        dpPantalla.add(ifrmVentana);
        ifrmVentana.setLocation(((dpPantalla.getWidth() - ifrmVentana.getWidth()) / 2), 
                ((dpPantalla.getHeight() - ifrmVentana.getHeight()) / 2));
        ifrmVentana.setVisible(true);
        itmMenú.setEnabled(false);
        itmMenú.setText(nombreProblema + " (En ejecución)");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar brBarraMenú;
    public static javax.swing.JDesktopPane dpPantalla;
    public static javax.swing.JMenuItem itmAcerca;
    private javax.swing.JMenuItem itmArchivoSalir;
    public static javax.swing.JMenuItem itmFlujoAyudaE1;
    public static javax.swing.JMenuItem itmFlujoAyudaE2;
    public static javax.swing.JMenuItem itmFlujoAyudaE3;
    public static javax.swing.JMenuItem itmFlujoAyudaE4;
    public static javax.swing.JMenuItem itmFlujoAyudaE5;
    public static javax.swing.JMenuItem itmFlujoFormE1;
    public static javax.swing.JMenuItem itmFlujoFormE2;
    public static javax.swing.JMenuItem itmFlujoFormE3;
    public static javax.swing.JMenuItem itmFlujoFormE4;
    public static javax.swing.JMenuItem itmFlujoFormE5;
    public static javax.swing.JMenuItem itmFlujoModeloE1;
    public static javax.swing.JMenuItem itmFlujoModeloE2;
    public static javax.swing.JMenuItem itmFlujoModeloE3;
    public static javax.swing.JMenuItem itmFlujoModeloE4;
    public static javax.swing.JMenuItem itmFlujoModeloE5;
    public static javax.swing.JMenuItem itmMatAyudaE1;
    public static javax.swing.JMenuItem itmMatAyudaE2;
    public static javax.swing.JMenuItem itmMatAyudaE3;
    public static javax.swing.JMenuItem itmMatAyudaE4;
    public static javax.swing.JMenuItem itmMatAyudaE5;
    public static javax.swing.JMenuItem itmMatFormE1;
    public static javax.swing.JMenuItem itmMatFormE2;
    public static javax.swing.JMenuItem itmMatFormE3;
    public static javax.swing.JMenuItem itmMatFormE4;
    public static javax.swing.JMenuItem itmMatFormE5;
    public static javax.swing.JMenuItem itmMatModeloE1;
    public static javax.swing.JMenuItem itmMatModeloE2;
    public static javax.swing.JMenuItem itmMatModeloE3;
    public static javax.swing.JMenuItem itmMatModeloE4;
    public static javax.swing.JMenuItem itmMatModeloE5;
    public static javax.swing.JMenuItem itmVecAyudaE1;
    public static javax.swing.JMenuItem itmVecAyudaE2;
    public static javax.swing.JMenuItem itmVecAyudaE3;
    public static javax.swing.JMenuItem itmVecAyudaE4;
    public static javax.swing.JMenuItem itmVecAyudaE5;
    public static javax.swing.JMenuItem itmVecFormE1;
    public static javax.swing.JMenuItem itmVecFormE2;
    public static javax.swing.JMenuItem itmVecFormE3;
    public static javax.swing.JMenuItem itmVecFormE4;
    public static javax.swing.JMenuItem itmVecFormE5;
    public static javax.swing.JMenuItem itmVecModeloE1;
    public static javax.swing.JMenuItem itmVecModeloE2;
    public static javax.swing.JMenuItem itmVecModeloE3;
    public static javax.swing.JMenuItem itmVecModeloE4;
    public static javax.swing.JMenuItem itmVecModeloE5;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnAyuda;
    private javax.swing.JMenu mnFlujo;
    private javax.swing.JMenu mnFlujoE1;
    private javax.swing.JMenu mnFlujoE11;
    private javax.swing.JMenu mnFlujoE12;
    private javax.swing.JMenu mnFlujoE13;
    private javax.swing.JMenu mnFlujoE14;
    private javax.swing.JMenu mnFlujoE15;
    private javax.swing.JMenu mnFlujoE2;
    private javax.swing.JMenu mnFlujoE3;
    private javax.swing.JMenu mnFlujoE4;
    private javax.swing.JMenu mnFlujoE5;
    private javax.swing.JMenu mnMatrices;
    private javax.swing.JMenu mnVecE1;
    private javax.swing.JMenu mnVecE2;
    private javax.swing.JMenu mnVecE3;
    private javax.swing.JMenu mnVecE4;
    private javax.swing.JMenu mnVecE5;
    private javax.swing.JMenu mnVectores;
    // End of variables declaration//GEN-END:variables
}