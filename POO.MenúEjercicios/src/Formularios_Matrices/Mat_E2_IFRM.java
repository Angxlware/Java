package Formularios_Matrices;

import Clases_Mat_E2.*;
import static Librerías.Validaciones.*;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class Mat_E2_IFRM extends javax.swing.JInternalFrame 
{   
    private final DecimalFormat dcfNúmero = new DecimalFormat("###,###.##");
    public final String tema = "Matrices";
    public final String numEvidencia = "Evidencia II";
    public final String nombreProblema = "Mayor Diagonal";
    private MayorDiagonal_Interfaz objMayorDiagonal;
    
    public Mat_E2_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFilasYColumnas = new javax.swing.JTextField();
        txtFilasYColumnas.setTransferHandler(null);
        jLabel6 = new javax.swing.JLabel();
        lblFilasYColumnas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArMatriz = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNumMayorDP = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(720, 660));
        setPreferredSize(new java.awt.Dimension(720, 660));
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
        jLabel1.setText("Número Mayor de la Diagonal Principal");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        txtFilasYColumnas.setBackground(new java.awt.Color(63, 63, 63));
        txtFilasYColumnas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFilasYColumnas.setForeground(new java.awt.Color(255, 255, 255));
        txtFilasYColumnas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFilasYColumnas.setBorder(null);
        txtFilasYColumnas.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFilasYColumnas.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtFilasYColumnas.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtFilasYColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFilasYColumnasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasYColumnasKeyTyped(evt);
            }
        });
        jPanel1.add(txtFilasYColumnas);
        txtFilasYColumnas.setBounds(20, 120, 640, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Filas y columnas");
        jLabel6.setFocusable(false);
        jLabel6.setRequestFocusEnabled(false);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 80, 640, 40);

        lblFilasYColumnas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblFilasYColumnas.setForeground(new java.awt.Color(255, 51, 51));
        lblFilasYColumnas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFilasYColumnas.setFocusable(false);
        lblFilasYColumnas.setRequestFocusEnabled(false);
        jPanel1.add(lblFilasYColumnas);
        lblFilasYColumnas.setBounds(20, 140, 640, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 680, 170);

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
        btnCerrar.setBounds(20, 230, 110, 50);

        btnGenerar.setBackground(new java.awt.Color(230, 57, 70));
        btnGenerar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("Generar");
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        btnGenerar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGenerarKeyPressed(evt);
            }
        });
        jPanel2.add(btnGenerar);
        btnGenerar.setBounds(20, 20, 110, 50);

        btnBorrar.setBackground(new java.awt.Color(230, 57, 70));
        btnBorrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.setBorderPainted(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        btnBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBorrarKeyPressed(evt);
            }
        });
        jPanel2.add(btnBorrar);
        btnBorrar.setBounds(20, 90, 110, 50);

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
        btnCentrar.setBounds(20, 160, 110, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 210, 150, 300);

        jPanel4.setBackground(new java.awt.Color(48, 48, 48));
        jPanel4.setFocusable(false);
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tiempo");
        jLabel7.setFocusable(false);
        jLabel7.setRequestFocusEnabled(false);
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 10, 110, 30);

        txtTiempo.setEditable(false);
        txtTiempo.setBackground(new java.awt.Color(63, 63, 63));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setBorder(null);
        txtTiempo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTiempo.setFocusCycleRoot(true);
        txtTiempo.setRequestFocusEnabled(false);
        txtTiempo.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtTiempo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtTiempo);
        txtTiempo.setBounds(20, 40, 110, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 530, 150, 90);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        jScrollPane3.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setOpaque(false);

        txtArMatriz.setEditable(false);
        txtArMatriz.setBackground(new java.awt.Color(63, 63, 63));
        txtArMatriz.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtArMatriz.setForeground(new java.awt.Color(255, 255, 255));
        txtArMatriz.setTabSize(4);
        txtArMatriz.setBorder(null);
        txtArMatriz.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArMatriz.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(txtArMatriz);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(20, 50, 470, 270);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Número mayor de la diagonal principal");
        jLabel9.setFocusable(false);
        jLabel9.setRequestFocusEnabled(false);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 320, 470, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Matriz generada");
        jLabel10.setFocusable(false);
        jLabel10.setRequestFocusEnabled(false);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 10, 470, 30);

        txtNumMayorDP.setEditable(false);
        txtNumMayorDP.setBackground(new java.awt.Color(63, 63, 63));
        txtNumMayorDP.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtNumMayorDP.setForeground(new java.awt.Color(255, 255, 255));
        txtNumMayorDP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumMayorDP.setBorder(null);
        txtNumMayorDP.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumMayorDP.setFocusCycleRoot(true);
        txtNumMayorDP.setRequestFocusEnabled(false);
        txtNumMayorDP.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNumMayorDP.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtNumMayorDP);
        txtNumMayorDP.setBounds(20, 360, 470, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(190, 210, 510, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objMatFormE2 = null;
        itmMatFormE2.setEnabled(true);
        itmMatFormE2.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Algoritmo();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnGenerarActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtFilasYColumnas.setText(null);
        txtArMatriz.setText(null);
        txtNumMayorDP.setText(null);
        txtTiempo.setText(null);
        txtFilasYColumnas.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrarActionPerformed
        this.setLocation(((dpPantalla.getWidth() - this.getWidth()) / 2),
                ((dpPantalla.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCentrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGenerarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGenerarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerar.doClick();
        }
    }//GEN-LAST:event_btnGenerarKeyPressed

    private void btnBorrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBorrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBorrar.doClick();
        }
    }//GEN-LAST:event_btnBorrarKeyPressed

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

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified

    private void txtFilasYColumnasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasYColumnasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerar.requestFocus();
        }
    }//GEN-LAST:event_txtFilasYColumnasKeyPressed

    private void txtFilasYColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasYColumnasKeyTyped
        ValidarEnteroPositivo(evt, txtFilasYColumnas, lblFilasYColumnas, this);
    }//GEN-LAST:event_txtFilasYColumnasKeyTyped

    private void Algoritmo()
    {        
        long tiempoInicio = System.nanoTime();
        int[][] matriz;
        int longitud;
        
        if ((txtFilasYColumnas.getText().isEmpty())) {
            MostrarError(2, "Error: Campo vacío", 
                    "Llene el campo antes de generar la matriz", 
                    txtFilasYColumnas);
            return;
        }
        
        try {
            longitud = Integer.parseInt(txtFilasYColumnas.getText());
            if (longitud < 2) {
                MostrarError(0, "Error: Valor de filas y columnas inválido", 
                    "El número de filas y columnas tiene que ser mayor que uno",
                    txtFilasYColumnas);
                return;
            }
        }
        catch (Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtFilasYColumnas);
            return;
        }
        
        matriz = new int[longitud][longitud];
        Random rnd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rnd.nextInt(99) + 1;
            }
        }
        objMayorDiagonal = new MayorDiagonal_Clase_Base(matriz);
        objMayorDiagonal.setNumMayor();
        
        txtArMatriz.setText(null);
        for (int i = 0; i < matriz.length; i++) 
        {
            txtArMatriz.append("{");
            for (int j = 0; j < matriz[0].length; j++) {
                txtArMatriz.append(String.valueOf(matriz[i][j]));
                if (j != (matriz[0].length - 1)) {
                    txtArMatriz.append(", ");
                }
            }
            txtArMatriz.append("}\n");
        }
        txtNumMayorDP.setText(dcfNúmero.format(objMayorDiagonal.getNumMayor()));
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        txtArMatriz.setText(null);
        txtNumMayorDP.setText(null);
        txtTiempo.setText(null);
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, mensaje, título, tipo);
        txtCampo.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFilasYColumnas;
    private javax.swing.JTextArea txtArMatriz;
    private javax.swing.JTextField txtFilasYColumnas;
    private javax.swing.JTextField txtNumMayorDP;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}