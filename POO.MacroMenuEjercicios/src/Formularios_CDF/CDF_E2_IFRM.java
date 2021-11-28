package Formularios_CDF;

import Clases_CDF_E2.*;
import static Librerías.Validaciones.ValidarDecimalCualquiera;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CDF_E2_IFRM extends javax.swing.JInternalFrame 
{   
    private final DecimalFormat dcfNúmero = new DecimalFormat("###,###.##");
    public final String tema = "Control de Flujo";
    public final String numEvidencia = "Evidencia II";
    public final String nombreProblema = "Calcular Z";
    private CalcularZ_Interfaz objCalcularZ;
    
    public CDF_E2_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValorB = new javax.swing.JTextField();
        txtValorB.setTransferHandler(null);
        txtValorC = new javax.swing.JTextField();
        txtValorC.setTransferHandler(null);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValorA = new javax.swing.JTextField();
        txtValorA.setTransferHandler(null);
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblValorB = new javax.swing.JLabel();
        lblValorC = new javax.swing.JLabel();
        lblValorA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtValorZ = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(720, 620));
        setPreferredSize(new java.awt.Dimension(720, 620));
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
        jLabel1.setText("Cálculo de la Expresión Algebraíca de Z");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        txtValorB.setBackground(new java.awt.Color(63, 63, 63));
        txtValorB.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtValorB.setForeground(new java.awt.Color(255, 255, 255));
        txtValorB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorB.setBorder(null);
        txtValorB.setCaretColor(new java.awt.Color(255, 255, 255));
        txtValorB.setNextFocusableComponent(txtValorC);
        txtValorB.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtValorB.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtValorB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorBKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorBKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorB);
        txtValorB.setBounds(460, 200, 200, 30);

        txtValorC.setBackground(new java.awt.Color(63, 63, 63));
        txtValorC.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtValorC.setForeground(new java.awt.Color(255, 255, 255));
        txtValorC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorC.setBorder(null);
        txtValorC.setCaretColor(new java.awt.Color(255, 255, 255));
        txtValorC.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtValorC.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtValorC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorCKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorC);
        txtValorC.setBounds(460, 280, 200, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Valor de C");
        jLabel3.setFocusable(false);
        jLabel3.setRequestFocusEnabled(false);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 250, 200, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor de A");
        jLabel4.setFocusable(false);
        jLabel4.setRequestFocusEnabled(false);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 90, 200, 20);

        txtValorA.setBackground(new java.awt.Color(63, 63, 63));
        txtValorA.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtValorA.setForeground(new java.awt.Color(255, 255, 255));
        txtValorA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorA.setBorder(null);
        txtValorA.setCaretColor(new java.awt.Color(255, 255, 255));
        txtValorA.setNextFocusableComponent(txtValorB);
        txtValorA.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtValorA.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtValorA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorAKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorA);
        txtValorA.setBounds(460, 120, 200, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Valor de B");
        jLabel6.setFocusable(false);
        jLabel6.setRequestFocusEnabled(false);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(460, 170, 200, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_CDF/CalcularZ_Expresión.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(21, 116, 420, 190);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Expresión");
        jLabel5.setFocusable(false);
        jLabel5.setRequestFocusEnabled(false);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 80, 420, 27);

        lblValorB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblValorB.setForeground(new java.awt.Color(255, 51, 51));
        lblValorB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorB.setFocusable(false);
        lblValorB.setRequestFocusEnabled(false);
        jPanel1.add(lblValorB);
        lblValorB.setBounds(460, 220, 200, 30);

        lblValorC.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblValorC.setForeground(new java.awt.Color(255, 51, 51));
        lblValorC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorC.setFocusable(false);
        lblValorC.setRequestFocusEnabled(false);
        jPanel1.add(lblValorC);
        lblValorC.setBounds(460, 300, 200, 30);

        lblValorA.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblValorA.setForeground(new java.awt.Color(255, 51, 51));
        lblValorA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorA.setFocusable(false);
        lblValorA.setRequestFocusEnabled(false);
        jPanel1.add(lblValorA);
        lblValorA.setBounds(460, 140, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 680, 330);

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
        btnCerrar.setNextFocusableComponent(txtValorA);
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
        btnCerrar.setBounds(520, 20, 140, 50);

        btnCalcular.setBackground(new java.awt.Color(230, 57, 70));
        btnCalcular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        btnCalcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCalcularKeyPressed(evt);
            }
        });
        jPanel2.add(btnCalcular);
        btnCalcular.setBounds(20, 20, 140, 50);

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
        btnBorrar.setBounds(180, 20, 150, 50);

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
        btnCentrar.setBounds(350, 20, 150, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 370, 680, 90);

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
        jLabel7.setBounds(20, 20, 70, 20);

        txtTiempo.setEditable(false);
        txtTiempo.setBackground(new java.awt.Color(63, 63, 63));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setBorder(null);
        txtTiempo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTiempo.setFocusCycleRoot(true);
        txtTiempo.setNextFocusableComponent(txtValorA);
        txtTiempo.setRequestFocusEnabled(false);
        txtTiempo.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtTiempo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtTiempo);
        txtTiempo.setBounds(20, 50, 70, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(590, 480, 110, 100);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Valor de la variable Z");
        jLabel8.setFocusable(false);
        jLabel8.setRequestFocusEnabled(false);
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 20, 510, 20);

        txtValorZ.setEditable(false);
        txtValorZ.setBackground(new java.awt.Color(63, 63, 63));
        txtValorZ.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtValorZ.setForeground(new java.awt.Color(255, 255, 255));
        txtValorZ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorZ.setBorder(null);
        txtValorZ.setCaretColor(new java.awt.Color(255, 255, 255));
        txtValorZ.setFocusCycleRoot(true);
        txtValorZ.setNextFocusableComponent(txtValorA);
        txtValorZ.setRequestFocusEnabled(false);
        txtValorZ.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtValorZ.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtValorZ);
        txtValorZ.setBounds(20, 50, 510, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 480, 550, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objFlujoFormE2 = null;
        itmFlujoFormE2.setEnabled(true);
        itmFlujoFormE2.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Algoritmo();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnCalcularActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtValorA.setText(null);
        txtValorB.setText(null);
        txtValorC.setText(null);
        txtValorZ.setText(null);
        txtTiempo.setText(null);
        txtValorA.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrarActionPerformed
        this.setLocation(((dpPantalla.getWidth() - this.getWidth()) / 2),
                ((dpPantalla.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCentrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtValorAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorAKeyTyped
        ValidarDecimalCualquiera(evt, txtValorA, lblValorA, this);
    }//GEN-LAST:event_txtValorAKeyTyped

    private void txtValorBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorBKeyTyped
        ValidarDecimalCualquiera(evt, txtValorB, lblValorB, this);
    }//GEN-LAST:event_txtValorBKeyTyped

    private void txtValorCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorCKeyTyped
        ValidarDecimalCualquiera(evt, txtValorC, lblValorC, this);
    }//GEN-LAST:event_txtValorCKeyTyped

    private void btnCalcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCalcularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_btnCalcularKeyPressed

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

    private void txtValorAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorAKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtValorB.requestFocus();
        }
    }//GEN-LAST:event_txtValorAKeyPressed

    private void txtValorBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorBKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtValorC.requestFocus();
        }
    }//GEN-LAST:event_txtValorBKeyPressed

    private void txtValorCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorCKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcular.requestFocus();
        }
    }//GEN-LAST:event_txtValorCKeyPressed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified

    private void Algoritmo()
    {        
        long tiempoInicio = System.nanoTime();
        double valorA, valorB, valorC;
        
        if ((txtValorA.getText().isEmpty()) || (txtValorB.getText().isEmpty())
                || (txtValorC.getText().isEmpty())) {
            MostrarError(2, "Error: Campos vacíos", 
                    "Llene todos los campos antes de calcular", txtValorA);
            return;
        }
        
        try {
            valorA = Double.parseDouble(txtValorA.getText());
            valorB = Double.parseDouble(txtValorB.getText());
            valorC = Double.parseDouble(txtValorC.getText());
            if (valorC == 0) {
                MostrarError(0, "Error: Valor de C inválido", 
                        "No se puede dividir entre 0", txtValorC);
                return;
            }
        }
        catch (Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtValorA);
            return;
        }
 
        objCalcularZ = new CalcularZ_Clase_Base(valorA, valorB, valorC);
        objCalcularZ.setValorZ();
        txtValorZ.setText(String.valueOf(dcfNúmero.format(objCalcularZ.getValorZ())));
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        txtValorZ.setText(null);
        txtTiempo.setText(null);
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, mensaje, título, tipo);
        txtCampo.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblValorA;
    private javax.swing.JLabel lblValorB;
    private javax.swing.JLabel lblValorC;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtValorA;
    private javax.swing.JTextField txtValorB;
    private javax.swing.JTextField txtValorC;
    private javax.swing.JTextField txtValorZ;
    // End of variables declaration//GEN-END:variables
}