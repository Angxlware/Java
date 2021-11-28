package Formularios_Vectores;

import Clases_Vec_E4.*;
import static Librerías.Validaciones.*;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class Vec_E4_IFRM extends javax.swing.JInternalFrame 
{   
    public final String tema = "Vectores";
    public final String numEvidencia = "Evidencia IV";
    public final String nombreProblema = "Ordenar Arreglo";
    private OrdenarArreglo_Interfaz objOrdenarArreglo;
    
    public Vec_E4_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumDatos = new javax.swing.JTextField();
        txtNumDatos.setTransferHandler(null);
        lblLongitud = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArArregloOrdenado = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtArArregloOriginal = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();

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
        jLabel1.setText("Ordenación Descendente de un Arreglo");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Longitud");
        jLabel4.setFocusable(false);
        jLabel4.setRequestFocusEnabled(false);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 80, 640, 30);

        txtNumDatos.setBackground(new java.awt.Color(63, 63, 63));
        txtNumDatos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNumDatos.setForeground(new java.awt.Color(255, 255, 255));
        txtNumDatos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumDatos.setBorder(null);
        txtNumDatos.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumDatos.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNumDatos.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtNumDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumDatosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDatosKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumDatos);
        txtNumDatos.setBounds(20, 120, 640, 30);

        lblLongitud.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLongitud.setForeground(new java.awt.Color(255, 51, 51));
        lblLongitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLongitud.setFocusable(false);
        lblLongitud.setRequestFocusEnabled(false);
        jPanel1.add(lblLongitud);
        lblLongitud.setBounds(20, 140, 640, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 680, 170);

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setFocusable(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(null);

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
        btnGenerar.setBounds(20, 20, 140, 50);

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
        btnBorrar.setBounds(20, 90, 140, 50);

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
        btnCentrar.setBounds(20, 160, 140, 50);

        btnCerrar.setBackground(new java.awt.Color(230, 57, 70));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setNextFocusableComponent(txtNumDatos);
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
        btnCerrar.setBounds(20, 230, 140, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 210, 180, 300);

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
        jLabel7.setBounds(20, 10, 140, 30);

        txtTiempo.setEditable(false);
        txtTiempo.setBackground(new java.awt.Color(63, 63, 63));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setBorder(null);
        txtTiempo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTiempo.setFocusCycleRoot(true);
        txtTiempo.setNextFocusableComponent(txtNumDatos);
        txtTiempo.setRequestFocusEnabled(false);
        txtTiempo.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtTiempo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtTiempo);
        txtTiempo.setBounds(20, 40, 140, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 530, 180, 90);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Arreglo Ordenado");
        jLabel12.setFocusable(false);
        jLabel12.setRequestFocusEnabled(false);
        jPanel3.add(jLabel12);
        jLabel12.setBounds(250, 10, 210, 40);

        jScrollPane3.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setOpaque(false);

        txtArArregloOrdenado.setEditable(false);
        txtArArregloOrdenado.setBackground(new java.awt.Color(63, 63, 63));
        txtArArregloOrdenado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtArArregloOrdenado.setForeground(new java.awt.Color(255, 255, 255));
        txtArArregloOrdenado.setTabSize(4);
        txtArArregloOrdenado.setBorder(null);
        txtArArregloOrdenado.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArArregloOrdenado.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(txtArArregloOrdenado);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(250, 50, 210, 340);

        jScrollPane5.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane5.setBorder(null);
        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setOpaque(false);

        txtArArregloOriginal.setEditable(false);
        txtArArregloOriginal.setBackground(new java.awt.Color(63, 63, 63));
        txtArArregloOriginal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtArArregloOriginal.setForeground(new java.awt.Color(255, 255, 255));
        txtArArregloOriginal.setTabSize(4);
        txtArArregloOriginal.setBorder(null);
        txtArArregloOriginal.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArArregloOriginal.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(txtArArregloOriginal);

        jPanel3.add(jScrollPane5);
        jScrollPane5.setBounds(20, 50, 210, 340);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Arreglo Generado");
        jLabel18.setFocusable(false);
        jLabel18.setRequestFocusEnabled(false);
        jPanel3.add(jLabel18);
        jLabel18.setBounds(20, 10, 210, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(220, 210, 480, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objVecFormE4 = null;
        itmVecFormE4.setEnabled(true);
        itmVecFormE4.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Algoritmo();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnGenerarActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtNumDatos.setText(null);
        txtArArregloOriginal.setText(null);
        txtArArregloOrdenado.setText(null);
        txtTiempo.setText(null);
        txtNumDatos.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrarActionPerformed
        this.setLocation(((dpPantalla.getWidth() - this.getWidth()) / 2),
                ((dpPantalla.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCentrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNumDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDatosKeyTyped
        ValidarEnteroPositivo(evt, txtNumDatos, lblLongitud, this);
    }//GEN-LAST:event_txtNumDatosKeyTyped

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

    private void txtNumDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDatosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerar.requestFocus();
        }
    }//GEN-LAST:event_txtNumDatosKeyPressed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified
    
    private void Algoritmo()
    {        
        long tiempoInicio = System.nanoTime();
        int numDatos;
        int[] arreglo;
        
        if (txtNumDatos.getText().isEmpty()) {
            MostrarError(2, "Error: Campo vacío", 
                    "Llene el campo antes de generar el arreglo", txtNumDatos);
            return;
        }
        
        try {
            numDatos = Integer.parseInt(txtNumDatos.getText());
            if (numDatos < 2) {
                MostrarError(0, "Error: Longitud inválida", 
                    "La longitud del arreglo tiene que ser mayor que uno",
                    txtNumDatos);
                return;
            }
        }
        catch(Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtNumDatos);
            return;
        }
        
        arreglo = new int[numDatos];
        Random rnd = new Random();
        for (int índice = 0; índice < arreglo.length; índice++) {
            arreglo[índice] = rnd.nextInt(99) + 1;
        }
        txtArArregloOriginal.setText(null);
        for (int i = 0; i < arreglo.length; i++) {
            txtArArregloOriginal.append("Arreglo[" + (i + 1) + "]: " 
                    + arreglo[i] + "\n");
        }
        objOrdenarArreglo = new OrdenarArreglo_Clase_Base(arreglo);
        
        objOrdenarArreglo.OrdenarArreglo();
        txtArArregloOrdenado.setText(null);
        for (int i = 0; i < arreglo.length; i++) {
            txtArArregloOrdenado.append("Arreglo[" + (i + 1) + "]: " 
                    + objOrdenarArreglo.getArreglo()[i] + "\n");
        }
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        txtArArregloOriginal.setText(null);
        txtArArregloOrdenado.setText(null);
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblLongitud;
    private javax.swing.JTextArea txtArArregloOrdenado;
    private javax.swing.JTextArea txtArArregloOriginal;
    private javax.swing.JTextField txtNumDatos;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}