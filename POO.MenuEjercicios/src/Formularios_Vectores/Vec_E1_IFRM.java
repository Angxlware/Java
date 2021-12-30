package Formularios_Vectores;

import Clases_Vec_E1.*;
import static Librerías.Validaciones.*;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class Vec_E1_IFRM extends javax.swing.JInternalFrame 
{   
    public final String tema = "Vectores";
    public final String numEvidencia = "Evidencia I";
    public final String nombreProblema = "Escalar Arreglo";
    private EscalarArreglo_Interfaz objEscalarArreglo;
    
    public Vec_E1_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEscalar = new javax.swing.JTextField();
        txtEscalar.setTransferHandler(null);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumDatos = new javax.swing.JTextField();
        txtNumDatos.setTransferHandler(null);
        lblLongitud = new javax.swing.JLabel();
        lblEscalar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGenerarYEscalar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArArregloA = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArArregloB = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(720, 590));
        setPreferredSize(new java.awt.Dimension(720, 590));
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
        jLabel1.setText("Arreglo Multiplicado por un Escalar");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        txtEscalar.setBackground(new java.awt.Color(63, 63, 63));
        txtEscalar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtEscalar.setForeground(new java.awt.Color(255, 255, 255));
        txtEscalar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEscalar.setBorder(null);
        txtEscalar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEscalar.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtEscalar.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtEscalar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEscalarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscalarKeyTyped(evt);
            }
        });
        jPanel1.add(txtEscalar);
        txtEscalar.setBounds(360, 120, 300, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Escalar");
        jLabel3.setFocusable(false);
        jLabel3.setRequestFocusEnabled(false);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 83, 300, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Longitud");
        jLabel4.setFocusable(false);
        jLabel4.setRequestFocusEnabled(false);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 80, 320, 30);

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
        txtNumDatos.setBounds(20, 120, 320, 30);

        lblLongitud.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLongitud.setForeground(new java.awt.Color(255, 51, 51));
        lblLongitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLongitud.setFocusable(false);
        lblLongitud.setRequestFocusEnabled(false);
        jPanel1.add(lblLongitud);
        lblLongitud.setBounds(20, 140, 320, 30);

        lblEscalar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblEscalar.setForeground(new java.awt.Color(255, 51, 51));
        lblEscalar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscalar.setFocusable(false);
        lblEscalar.setRequestFocusEnabled(false);
        jPanel1.add(lblEscalar);
        lblEscalar.setBounds(360, 140, 300, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 680, 170);

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setFocusable(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(null);

        btnGenerarYEscalar.setBackground(new java.awt.Color(230, 57, 70));
        btnGenerarYEscalar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnGenerarYEscalar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarYEscalar.setText("Generar y escalar");
        btnGenerarYEscalar.setBorder(null);
        btnGenerarYEscalar.setBorderPainted(false);
        btnGenerarYEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarYEscalarActionPerformed(evt);
            }
        });
        btnGenerarYEscalar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGenerarYEscalarKeyPressed(evt);
            }
        });
        jPanel2.add(btnGenerarYEscalar);
        btnGenerarYEscalar.setBounds(20, 20, 300, 50);

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
        btnCentrar.setBounds(180, 90, 140, 50);

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
        btnCerrar.setBounds(20, 160, 300, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 210, 340, 230);

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
        jLabel7.setBounds(20, 10, 300, 30);

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
        txtTiempo.setBounds(20, 40, 300, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 460, 340, 90);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Arreglo Generado");
        jLabel10.setFocusable(false);
        jLabel10.setRequestFocusEnabled(false);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 10, 280, 40);

        jScrollPane1.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);

        txtArArregloA.setEditable(false);
        txtArArregloA.setBackground(new java.awt.Color(63, 63, 63));
        txtArArregloA.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtArArregloA.setForeground(new java.awt.Color(255, 255, 255));
        txtArArregloA.setTabSize(4);
        txtArArregloA.setBorder(null);
        txtArArregloA.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArArregloA.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtArArregloA);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 280, 110);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Arreglo Escalado");
        jLabel11.setFocusable(false);
        jLabel11.setRequestFocusEnabled(false);
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 170, 280, 40);

        jScrollPane2.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        txtArArregloB.setEditable(false);
        txtArArregloB.setBackground(new java.awt.Color(63, 63, 63));
        txtArArregloB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtArArregloB.setForeground(new java.awt.Color(255, 255, 255));
        txtArArregloB.setTabSize(4);
        txtArArregloB.setBorder(null);
        txtArArregloB.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArArregloB.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txtArArregloB);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 210, 280, 110);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(380, 210, 320, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objVecFormE1 = null;
        itmVecFormE1.setEnabled(true);
        itmVecFormE1.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnGenerarYEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarYEscalarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Algoritmo();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnGenerarYEscalarActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtNumDatos.setText(null);
        txtEscalar.setText(null);
        txtArArregloA.setText(null);
        txtArArregloB.setText(null);
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

    private void txtEscalarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscalarKeyTyped
        ValidarDecimalCualquiera(evt, txtEscalar, lblLongitud, this);
    }//GEN-LAST:event_txtEscalarKeyTyped

    private void btnGenerarYEscalarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGenerarYEscalarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerarYEscalar.doClick();
        }
    }//GEN-LAST:event_btnGenerarYEscalarKeyPressed

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
            txtEscalar.requestFocus();
        }
    }//GEN-LAST:event_txtNumDatosKeyPressed

    private void txtEscalarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscalarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerarYEscalar.requestFocus();
        }
    }//GEN-LAST:event_txtEscalarKeyPressed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified
    
    private void Algoritmo()
    {        
        long tiempoInicio = System.nanoTime();
        int numDatos, escalar;
        int[] arreglo;
        
        if ((txtNumDatos.getText().isEmpty()) || (txtEscalar.getText().isEmpty())) {
            MostrarError(2, "Error: Campos vacíos", 
                    "Llene todos los campos antes de generar y escalar",
                    txtNumDatos);
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
            escalar = Integer.parseInt(txtEscalar.getText());
        }
        catch(Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtNumDatos);
            return;
        }
        
        arreglo = new int[numDatos];
        Random rnd = new Random();
        for (int índice = 0; índice < arreglo.length; índice++) {
            arreglo[índice] = rnd.nextInt(90) + 10;
        }
        objEscalarArreglo = new EscalarArreglo_Clase_Base(arreglo, escalar);
        objEscalarArreglo.setArregloB();
        
        txtArArregloA.setText(null);
        txtArArregloB.setText(null);
        for (int i = 0; i < arreglo.length; i++) {
            txtArArregloA.append("Arreglo[" + (i + 1) + "]: " + 
                    objEscalarArreglo.getArregloA()[i] + "\n");
            txtArArregloB.append("Arreglo[" + (i + 1) + "]: " + 
                    objEscalarArreglo.getArregloB()[i] + "\n");
        }
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        txtArArregloA.setText(null);
        txtArArregloB.setText(null);
        txtTiempo.setText(null);
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, mensaje, título, tipo);
        txtCampo.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerarYEscalar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEscalar;
    private javax.swing.JLabel lblLongitud;
    private javax.swing.JTextArea txtArArregloA;
    private javax.swing.JTextArea txtArArregloB;
    private javax.swing.JTextField txtEscalar;
    private javax.swing.JTextField txtNumDatos;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}