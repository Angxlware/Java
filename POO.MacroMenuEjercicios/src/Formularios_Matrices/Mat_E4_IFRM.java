package Formularios_Matrices;

import Clases_Mat_E4.*;
import static Librerías.Validaciones.*;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class Mat_E4_IFRM extends javax.swing.JInternalFrame 
{   
    private final DecimalFormat dcfNúmero = new DecimalFormat("###,###.##");
    public final String tema = "Matrices";
    public final String numEvidencia = "Evidencia IV";
    public final String nombreProblema = "Sumar Colum.";
    private SumarColum_Interfaz objSumarColum;
    
    public Mat_E4_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        txtFilas.setTransferHandler(null);
        jLabel6 = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        txtColumnas.setTransferHandler(null);
        jLabel8 = new javax.swing.JLabel();
        lblFilas = new javax.swing.JLabel();
        lblColumnas = new javax.swing.JLabel();
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
        txtSumatoria = new javax.swing.JTextField();

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
        jLabel1.setText("Sumar Columnas de una Matriz");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        txtFilas.setBackground(new java.awt.Color(63, 63, 63));
        txtFilas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFilas.setForeground(new java.awt.Color(255, 255, 255));
        txtFilas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFilas.setBorder(null);
        txtFilas.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFilas.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtFilas.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFilasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel1.add(txtFilas);
        txtFilas.setBounds(20, 120, 310, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Columnas");
        jLabel6.setFocusable(false);
        jLabel6.setRequestFocusEnabled(false);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 80, 310, 40);

        txtColumnas.setBackground(new java.awt.Color(63, 63, 63));
        txtColumnas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtColumnas.setForeground(new java.awt.Color(255, 255, 255));
        txtColumnas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColumnas.setBorder(null);
        txtColumnas.setCaretColor(new java.awt.Color(255, 255, 255));
        txtColumnas.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtColumnas.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtColumnasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel1.add(txtColumnas);
        txtColumnas.setBounds(350, 120, 310, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Filas");
        jLabel8.setFocusable(false);
        jLabel8.setRequestFocusEnabled(false);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 80, 310, 40);

        lblFilas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblFilas.setForeground(new java.awt.Color(255, 51, 51));
        lblFilas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFilas.setFocusable(false);
        lblFilas.setRequestFocusEnabled(false);
        jPanel1.add(lblFilas);
        lblFilas.setBounds(20, 140, 310, 30);

        lblColumnas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblColumnas.setForeground(new java.awt.Color(255, 51, 51));
        lblColumnas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColumnas.setFocusable(false);
        lblColumnas.setRequestFocusEnabled(false);
        jPanel1.add(lblColumnas);
        lblColumnas.setBounds(350, 140, 310, 30);

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
        jLabel9.setText("Sumatoria de la primer y última columna");
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

        txtSumatoria.setEditable(false);
        txtSumatoria.setBackground(new java.awt.Color(63, 63, 63));
        txtSumatoria.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtSumatoria.setForeground(new java.awt.Color(255, 255, 255));
        txtSumatoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumatoria.setBorder(null);
        txtSumatoria.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSumatoria.setFocusCycleRoot(true);
        txtSumatoria.setRequestFocusEnabled(false);
        txtSumatoria.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtSumatoria.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtSumatoria);
        txtSumatoria.setBounds(20, 360, 470, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(190, 210, 510, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objMatFormE4 = null;
        itmMatFormE4.setEnabled(true);
        itmMatFormE4.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Algoritmo();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnGenerarActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtFilas.setText(null);
        txtColumnas.setText(null);
        txtArMatriz.setText(null);
        txtSumatoria.setText(null);
        txtTiempo.setText(null);
        txtFilas.requestFocus();
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

    private void txtFilasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtColumnas.requestFocus();
        }
    }//GEN-LAST:event_txtFilasKeyPressed

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        ValidarEnteroPositivo(evt, txtFilas, lblFilas, this);
    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerar.requestFocus();
        }
    }//GEN-LAST:event_txtColumnasKeyPressed

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
        ValidarEnteroPositivo(evt, txtColumnas, lblColumnas, this);
    }//GEN-LAST:event_txtColumnasKeyTyped

    private void Algoritmo()
    {        
        long tiempoInicio = System.nanoTime();
        int[][] matriz;
        int filas, columnas;
        
        if ((txtFilas.getText().isEmpty() || txtColumnas.getText().isEmpty())) {
            MostrarError(2, "Error: Campos vacíos", 
                    "Llene todos los campos antes de generar la matriz", txtFilas);
            return;
        }
        
        try {
            filas = Integer.parseInt(txtFilas.getText());
            if (filas < 2) {
                MostrarError(0, "Error: Valor de las filas inválido", 
                    "El número de filas tiene que ser mayor que uno", txtFilas);
                return;
            }
            columnas = Integer.parseInt(txtColumnas.getText());
            if (columnas < 2) {
                MostrarError(0, "Error: Valor de las columnas inválido", 
                    "El número de columnas tiene que ser mayor que uno", 
                    txtColumnas);
                return;
            }
            if (columnas == filas) {
                MostrarError(0, "Error: Valor de las columnas inválido", 
                    "El número de columnas tiene que ser distinto al número de filas",
                    txtColumnas);
                return;
            }
        }
        catch (Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtFilas);
            return;
        }
        
        matriz = new int[filas][columnas];
        Random rnd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rnd.nextInt(99) + 1;
            }
        }
        objSumarColum = new SumarColum_Clase_Base(matriz);
        objSumarColum.setSuma();
        
        txtArMatriz.setText(null);
        for (int i = 0; i < matriz.length; i++) {
            txtArMatriz.append("{");
            for (int j = 0; j < matriz[0].length; j++) {
                txtArMatriz.append(String.valueOf(matriz[i][j]));
                if (j != (matriz[0].length - 1)) {
                    txtArMatriz.append(", ");
                }
            }
            txtArMatriz.append("}\n");
        }
        txtSumatoria.setText(dcfNúmero.format(objSumarColum.getSuma()));
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        txtArMatriz.setText(null);
        txtSumatoria.setText(null);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblColumnas;
    private javax.swing.JLabel lblFilas;
    private javax.swing.JTextArea txtArMatriz;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextField txtSumatoria;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}